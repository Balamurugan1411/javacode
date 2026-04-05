class CreditPayment extends Payment {
    private String cardNo;

    public CreditPayment(String cardNo){
        this.cardNo = cardNo;
    }

    public void pay(double amt) throws Exception{
        if(cardNo.length() != 16){
            throw new Exception("Card invalid");
        }
        System.out.println("Paid " + amt);
    }
}