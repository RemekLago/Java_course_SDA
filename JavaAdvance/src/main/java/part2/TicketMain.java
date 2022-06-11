package part2;

public class TicketMain {
    public static void main(String[] args) {
        Ticket ticket1 = Ticket.NORMALNY_CALODNIOWY;
        Ticket ticket2 = Ticket.NORMALNY_GODZINOWY;
        Ticket ticket3 = Ticket.ULGOWY_CALODNIOWY;
        Ticket ticket4 = Ticket.ULGOWY_GODZINNY;

        System.out.println(ticket1.getPrice());
        System.out.println(ticket2.getPrice());
        System.out.println(ticket3.getPrice());
        System.out.println(ticket4.getPrice());

        ticket1.informationTicket();

        Ticket result = Ticket.whichTicket(20, 90, 80);
        System.out.println("Ticket result: " + result.name());
    }
}
