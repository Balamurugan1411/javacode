import java.util.*;

class Notification{
    String name;
    String message;
    String contact;
    
    Notification(String name,String message,String contact){
        this.name=name;
        this.message=message;
        this.contact=contact;
    }
     
     void send(){
        System.out.print("EMail");
     }
}
class Email extends Notification{

    Email(String name,String message,String contact){
        super(name,message,contact);
    }

    @Override
    void send(){
        System.out.println("Email sended to "+name);
        System.out.println("Email received is  "+message);
        System.out.println("Emailid is  "+contact);
    }


    void ChangeEmail(){
        System.out.print("Email changed");
    }
}

class Sms extends Notification{
    Sms(String name,String message,String contact){
         super(name,message,contact);
    }
    @Override
    void send(){
        System.out.println("SMS sended to "+name);
        System.out.println("SMS received is  "+message);

        System.out.println("Phoneno is  "+contact);
    }
}

public class notify {
    public static void main(String[] args){
        Notification[] n={new Email("abc","hi","abc@aac.com "),new Sms("abc","hi","9876543210")};
        
       for(Notification a:n){
        a.send();
       }
        
    }
}
