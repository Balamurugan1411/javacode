class Flight {
    private String flightId;
    private String from;
    private String to;
    private int seats;

    public Flight(String flightId, String from, String to, int seats){
        this.flightId = flightId;
        this.from = from;
        this.to = to;
        this.seats = seats;
    }

    public String getFlightId(){ return flightId; }
    public int getSeats(){ return seats; }

    public void bookSeat() throws Exception{
        if(seats <= 0){
            throw new Exception("Seats not available");
        }
        seats--;
    }
}