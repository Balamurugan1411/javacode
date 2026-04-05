class FlightService {
    public Booking bookFlight(Passenger p, Flight f, Payment pay, double amt){
        try{
            f.bookSeat();
            pay.pay(amt);
            Booking b = new Booking(p, f);
            b.confirm();
            return b;
        }catch(Exception e){
            System.out.println("Booking failed: " + e.getMessage());
            return null;
        }
    }
}