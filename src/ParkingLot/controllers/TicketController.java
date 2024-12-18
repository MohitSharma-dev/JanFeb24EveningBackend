package ParkingLot.controllers;

import ParkingLot.dtos.IssueTicketRequestDTO;
import ParkingLot.dtos.IssueTicketResponseDTO;
import ParkingLot.dtos.ResponseStatus;
import ParkingLot.models.Ticket;
import ParkingLot.services.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDTO issueTicket(IssueTicketRequestDTO request) {
        IssueTicketResponseDTO response = new IssueTicketResponseDTO();

        try {
            Ticket ticket = ticketService.issueTicket(
                    request.getGateId(),
                    request.getVehicleNumber(),
                    request.getOwnerName(),
                    request.getVehicleType()
            );
            response.setTicketId(ticket.getId());
            response.setSlotNumber(ticket.getParkingSlot().getSlotNumber());
            response.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (Exception ex){
            response.setResponseStatus(ResponseStatus.FAILURE);
            response.setFailureMessage(ex.getMessage());
        }

        return response;
    }
}

// controller => service

// client -> request -> contain some data
// response

// Response
// DTO : Data transfer Object
// ticketId
// slotNumber
// responseStatus : SUCCESS / FALIURE
// failureMessage