import java.util.*;

abstract class SmartDevice{
    abstract void turnOn();
    abstract void turnOff();

}


class Light extends SmartDevice{
    @Override
    void turnOn(){
        System.out.println("Light on");
    }
    @Override
    void turnOff(){
        System.out.println("Light off");
    }
}
 interface Remote  {

     void change();
}

class Tv implements Remote{
     @Override
     public void change(){
        System.out.println("change channel");

     }
}
public class smart {
    public static void main(String[] args){ 
        SmartDevice device=new Light();
        device.turnOn();
        Remote r=new Tv();
        r.change();
    }
}
