package ParkingLot.strategies;

import ParkingLot.models.*;

public class RandomSlotAssignmentStrategy implements SlotAssignmentStrategy {
    @Override
    public ParkingSlot assignSlot(ParkingLot parkingLot, VehicleType vehicleType) {
        for(ParkingFloor parkingFloor: parkingLot.getParkingFloors()) {
            for(ParkingSlot parkingSlot: parkingFloor.getParkingSlots()) {
                if(parkingSlot.getVehicleType().equals(vehicleType) && parkingSlot.getParkingSlotStatus().equals(ParkingSlotStatus.EMPTY)) {
                    return parkingSlot;
                }
            }
        }
        return null;
    }
}

// enums , use ==

// ParkingLot : all the floor
    // for a floor : all the slots
        // slot is empty + slot supports the vehicle type
            // return the slot