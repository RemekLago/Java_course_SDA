package part2;

public enum Ticket {
    ULGOWY_GODZINNY(10, 60),
    ULGOWY_CALODNIOWY(30, 1440),
    NORMALNY_GODZINOWY(20, 60),
    NORMALNY_CALODNIOWY(60, 1440),
    BRAK_BILETU(0, 0);

    private double price;
    private int time;

    Ticket(double price, int time) {
        this.price = price;
        this.time = time;
    }

    public double getPrice() {
        return price;
    }

    public int getTime() {
        return time;
    }

    public void informationTicket() {
        System.out.println(this.name() + " " + this.getTime() + " minutes");
    }

    public static Ticket whichTicket(int age, int timeTravel, double money) {
        Ticket userTicket = Ticket.BRAK_BILETU;

        if (age < 18) {
            if (timeTravel <= 60) {
                userTicket = Ticket.ULGOWY_GODZINNY;
            } else {
                userTicket = Ticket.ULGOWY_CALODNIOWY;
            }
        } else {
            if (timeTravel <= 60) {
                userTicket = Ticket.NORMALNY_GODZINOWY;
            } else {
                userTicket = Ticket.NORMALNY_CALODNIOWY;
            }
        }
        if (money < userTicket.getPrice()) {
            userTicket = Ticket.BRAK_BILETU;
        }
        return userTicket;
    }
}


