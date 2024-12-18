package ParkingLot.models;

import java.util.HashMap;
import java.util.List;

public class ParkingLot extends BaseEntity{
    private List<ParkingFloor> parkingFloors;
    private List<Gate> entryGates;
    private List<Gate> exitGates;
    private ParkingLotStatus parkingLotStatus;
    private int totalCapacity;
    private List<SupportedVehicleTypes> supportedVehicleTypes;
//    private HashMap<VehicleType, List<ParkingFloor>> ;
}

// SlotAssignmentStrategy

// id
// createdAt
// LastUpdatedAt

// HW : Complete all the classes with the correct attributes


// issueTicket : Ticket => TicketController
// addFloor : Floor => FloorController