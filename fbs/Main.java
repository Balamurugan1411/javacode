public class Main {
    public static void main(String[] args){
        Passenger p1 = new Passenger("Balamurugan", "bala@gmail.com", "IND123");
        Flight f1 = new Flight("AI101", "Chennai", "Delhi", 2);
        Payment pay = new CreditPayment("1234567812345678");
        FlightService fs = new FlightService();

        Booking b1 = fs.bookFlight(p1, f1, pay, 5000);
        if(b1 != null) b1.showDetails();
    }
}