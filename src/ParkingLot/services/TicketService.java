package ParkingLot.services;

import ParkingLot.models.*;
import ParkingLot.repositories.GateRepository;
import ParkingLot.repositories.TicketRepository;
import ParkingLot.repositories.VehicleRepository;

import java.util.Date;
import java.util.Optional;

public class TicketService {
    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private TicketRepository ticketRepository;

    public TicketService(
            GateRepository gateRepository,
            VehicleRepository vehicleRepository,
            TicketRepository ticketRepository
    ) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.ticketRepository = ticketRepository;
    }

    public Ticket issueTicket(
            int gateId,
            String vehicleNumber,
            String ownerName,
            VehicleType vehicleType
    ) {
//        In the service we will write the logic of issuing the ticket
        Ticket ticket = new Ticket();

//         we have gateId, let's get the Gate object
//         call db with the gateId -> Gate Object

        Optional<Gate> gateOptional = gateRepository.findGateById(gateId);
        if(gateOptional.isEmpty()){
            throw new IllegalArgumentException("Gate not found");
        }
        Gate gate = gateOptional.get();

        ticket.setGate(gate);
        ticket.setOperator(gate.getOperator());
        ticket.setEntryTime(new Date());

//        we have the vehicle information
//        we need to get the object of vehicle

        Optional<Vehicle> vehicleOptional = vehicleRepository.findVehicleByNumber(vehicleNumber);
        Vehicle vehicle = null;
        if(vehicleOptional.isEmpty()){
//            this is a new Vehicle
            vehicle = new Vehicle();
            vehicle.setVehicleType(vehicleType);
            vehicle.setOwnerName(ownerName);
            vehicle.setLicensePlate(vehicleNumber);
            vehicle = vehicleRepository.save(vehicle);
        } else {
            vehicle = vehicleOptional.get();
        }
        ticket.setVehicle(vehicle);

//        assign the slot
        ParkingLot parkingLot = gate.getParkingLot();
        ParkingSlot slot =
                parkingLot
                .getSlotAssignmentStrategy()
                .assignSlot(parkingLot , vehicleType);

        ticket.setParkingSlot(slot);

        return ticketRepository.save(ticket);
    }
}
// in the gate table we stored the parking Lot Id
// findByGate(Gate gate) => select * from gates join parking_lot on gate_id = 5 and gate.parking_lot_id = parking_lot.id;
// To create the ticket what all we need

// Gate : gateId -> corresponding Object for this
// Slot : We need to assign the slot
// Vehicle : vehicle info is present, object is required

// Agenda
// IssueTicket : Business Logic
// Repository : mock our db
// It will not be final working code : ingestion of data



// Services -> db XXX
// services -> repositories -> db via ORM
