

public class thread {
    public static void main(String[] args) {

        try{
            String str=null;
            System.out.println(str.length());
        }
        
          catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of index");
        }

        catch(NullPointerException e){
            System.out.println("Null pointer error");
        }
         

        catch(Exception e){
            System.out.println(e);

        }

        finally{
            System.out.println("final always execute");
        }
    }
}
