package tddmicroexercises.turnticketdispenser;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TicketDispenserTest {

    @Test
    @DisplayName("First ticket number should be 0")
    void checkFirstTicketNumber() {
        TicketDispenser dispenser = new TicketDispenser();
        TurnTicket ticket = dispenser.getTurnTicket();
        assertEquals(0, ticket.getTurnNumber());
    }

    @Test
    @DisplayName("First ticket number should be 0")
    void checkSecondTicketNumber() {
        TicketDispenser dispenser = new TicketDispenser();
        TurnTicket ticket = dispenser.getTurnTicket();
        assertEquals(0, ticket.getTurnNumber());
    }

//    @Test
//    @DisplayName("First ticket number should be 0")
//    void checkFirstTicketNumber() {
//        TicketDispenser dispenser = new TicketDispenser();
//        TurnTicket ticket = dispenser.getTurnTicket();
//        assertEquals(0, ticket.getTurnNumber());
//    }

}
