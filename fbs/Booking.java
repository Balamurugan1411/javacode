class Booking {
    private Passenger passenger;
    private Flight flight;
    private String status;

    public Booking(Passenger p, Flight f){
        this.passenger = p;
        this.flight = f;
        this.status = "Pending";
    }

    public void confirm(){ status = "Confirmed"; }

    public void showDetails(){
        System.out.println("Name: " + passenger.getName());
        System.out.println("Flight: " + flight.getFlightId());
        System.out.println("Status: " + status);
    }
}