class Passenger extends Person {
    private String passportNo;

    public Passenger(String name, String email, String passportNo){
        super(name, email);
        this.passportNo = passportNo;
    }

    public String getPassportNo(){ return passportNo; }

    public void showRole(){
        System.out.println("Passenger logged in");
    }
}