package ParkingLot;

import ParkingLot.controllers.TicketController;
import ParkingLot.dtos.IssueTicketRequestDTO;
import ParkingLot.dtos.IssueTicketResponseDTO;
import ParkingLot.dtos.ResponseStatus;
import ParkingLot.models.VehicleType;
import ParkingLot.repositories.GateRepository;
import ParkingLot.repositories.TicketRepository;
import ParkingLot.repositories.VehicleRepository;
import ParkingLot.services.TicketService;

public class Client {
    public static void main(String[] args) {
//        all of this is managed by frameworks
        GateRepository gateRepository = new GateRepository();
        TicketRepository ticketRepository = new TicketRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();

        TicketService ticketService = new TicketService(
                gateRepository,
                vehicleRepository,
                ticketRepository
        );

        TicketController ticketController = new TicketController(ticketService);

        IssueTicketRequestDTO request = new IssueTicketRequestDTO();
        request.setVehicleType(VehicleType.THREE_WHEELER);
        request.setGateId(1);
        request.setVehicleNumber("DL 1VC 0324");
        request.setOwnerName("Mohit Sharma");

        IssueTicketResponseDTO response = ticketController.issueTicket(request);
        if(response.getResponseStatus() == ResponseStatus.SUCCESS){
            System.out.println(response.getTicketId());
        } else {
            System.out.println(response.getFailureMessage());
        }


    }
}

// HW 0 : Write this whole code yourself
// HW 1 : complete VehicleRepo
// HW 2 : Get some objects created and stored to test the client
// HW 3 : Write the code for generating Bill
