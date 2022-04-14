package tddmicroexercises.turnticketdispenser;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TicketDispenserTest {
    TicketDispenser dispenser;

    @Test
    @DisplayName("First ticket number should be 0")
    void checkFirstTicketNumber() {
        dispenser = new TicketDispenser();
        TurnTicket ticket = dispenser.getTurnTicket();
        assertEquals(0, ticket.getTurnNumber());
    }

    @Test
    @DisplayName("Second ticket number should be 1")
    void checkSecondTicketNumber() {
        dispenser = new TicketDispenser();
        TurnTicket ticket = dispenser.getTurnTicket();
        ticket = dispenser.getTurnTicket(ticket);
        assertEquals(1, ticket.getTurnNumber());
    }

    @Test
    @DisplayName("Third ticket number should be 2")
    void checkThirdTicketNumber() {
        dispenser = new TicketDispenser();
        TurnTicket ticket = dispenser.getTurnTicket();
        ticket = dispenser.getTurnTicket(ticket);
        ticket = dispenser.getTurnTicket(ticket);
        assertEquals(2, ticket.getTurnNumber());
    }

    @Test
    @DisplayName("Nth ticket number should be n-1")
    void checkNthTicketNumber() {
        dispenser = new TicketDispenser();
        int n = 12;
        TurnTicket ticket = dispenser.getTurnTicket();

        for(int i=1; i < n; i++){
            ticket = dispenser.getTurnTicket(ticket);
        }

        assertEquals(11, ticket.getTurnNumber());
    }

}
