package tddmicroexercises.turnticketdispenser;

public class TicketDispenser
{
    public TurnTicket getTurnTicket(TurnTicket ticket) {
//        int newTurnNumber = TurnNumberSequence.getNextTurnNumber();
        return new TurnTicket(ticket.getTurnNumber() + 1);
    }

    public TurnTicket getTurnTicket() {
        return new TurnTicket(0);
    }
}
