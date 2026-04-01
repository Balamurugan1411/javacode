class InvalidAgeException extends Exception{
    public  InvalidAgeException(String message){
        super(message);
    }
}

public class age {
    static void checkAge(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("you are not eligible to vote");
        }

        else{
            System.out.println("You are eligible to vote");
        }
    }

    public static void main(String[] args){
        try{
            checkAge(19);
        }

        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
