package ParkingLot.dtos;

import ParkingLot.models.VehicleType;

public class IssueTicketRequestDTO {
    private String vehicleNumber;
    private int gateId;
    private String ownerName;
    private VehicleType vehicleType;

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public int getGateId() {
        return gateId;
    }

    public void setGateId(int gateId) {
        this.gateId = gateId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}


// issueTicket

// vehicleNumber
// ownerName
// vehicleType
// gateId

// gateNumber
// parkingLotId
