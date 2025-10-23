public class UMLPassenger extends umlperson {
    public int seatNum;
    public int ticketAmt;
    public double ticketPrice;

    public UMLPassenger() {
        super();
        seatNum = 6;
        ticketAmt = 1;
        ticketPrice = 120.500;
    }

    public UMLPassenger(String name, int age, char gender, int num, int amt, double price) {
        super(name, age, gender);
        this.seatNum = num;
        this.ticketAmt = amt;
        this.ticketPrice = price;
    }

    public int getseatNum() {
        return seatNum;
    }
    public void setseatNum(int seatNum) {
        this.seatNum = seatNum;
    }
    public int getticketAmt() {
        return ticketAmt;
    }
    public void setticketAmt(int ticketAmt) {
    this.ticketAmt = ticketAmt;
    }
    public double getticketPrice() {
        return ticketPrice;
    }
    public void setticketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public void displayPassanger(){
        super.display();
        System.out.println("Seat Number: "+seatNum);
        System.out.println("Ticket bought: "+ticketAmt);
        System.out.println("Price per ticket: "+ticketPrice);
}

}
