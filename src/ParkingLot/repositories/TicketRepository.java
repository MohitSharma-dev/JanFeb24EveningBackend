package ParkingLot.repositories;

import ParkingLot.models.Ticket;

import java.util.Map;
import java.util.TreeMap;

// TicketRepository is going to be singleton
public class TicketRepository {
    private final Map<Integer , Ticket> tickets;
    private static int previousId = 0;
    public TicketRepository() {
        tickets = new TreeMap<>();
    }

    public Ticket save(Ticket ticket) {
        previousId++;
        ticket.setId(previousId);
        tickets.put(ticket.getId(), ticket);
        return ticket;
    }
}
// we need to assign the id