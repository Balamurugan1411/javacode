
public class thread1 {
    public static void main(String[] args) {
        Thread t=new Thread(() ->{
         try{
            System.out.println("Thread sleep");
            Thread.sleep(2000);
            System.out.println("Thread wake");
         }
         catch(Exception e){
            System.out.println("Sleep interupted");
         }
        



    } );

    t.start();
    
    try{
        Thread.sleep(6000);
        System.out.println("main method thread");
    }
    catch(InterruptedException e){
        System.out.println("Not T");
    }

    t.interrupt();;
}
