class Locker {
    private int lockerId;
    private boolean isLocked;
    private int pin;
    private String item;

    
    public Locker(int lockerId) {
        this.lockerId = lockerId;
        this.isLocked = true; 
        this.item = null;
    }

    
    public void storeItem(String item, int pin) {
        if (!isLocked) {
            this.item = item;
            this.pin = pin;
            lock(); 
            System.out.println("Item stored successfully.");
        } else {
            System.out.println("Unlock locker first.");
        }
    }


    public void retrieveItem(int pin) {
        if (!isLocked && this.pin == pin) {
            System.out.println("Retrieved item: " + item);
            item = null;
            lock(); 
            System.out.println("Invalid PIN or Locker is locked.");
        }
    }

    
    public void lock() {
        isLocked = true;
        System.out.println("Locker locked.");
    }

    public void unlock(int pin) {
        if (this.pin == pin) {
            isLocked = false;
            System.out.println("Locker unlocked.");
        } else {
            System.out.println("Incorrect PIN. Access denied.");
        }
    }
}


public class safe {
    public static void main(String[] args) {
        Locker locker = new Locker(101);
        locker.storeItem("Laptop", 1234);
        locker.unlock(1111);
        locker.unlock(1234);
        locker.retrieveItem(1234);
        locker.unlock(1234);
        locker.retrieveItem(1234);
    }
}


/*

   Design Locker System where users can store items securely
   Each locker protect its internal data and only controlled operations
   Requirements
   1.Each Locker has Locker Id islocked(boolean) pin stored item

   2.Operations
   Store item(item,pin)
   retrieve item(pin)
   lock()
   unlock(pin);

   3.Rules
     Items cannot access directly
     Locker opens with crct pin
     Invalid access should be blocked
 */