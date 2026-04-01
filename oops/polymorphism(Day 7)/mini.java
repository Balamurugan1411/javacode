/*
  task:Mini game
  game have 3 characters-warrior,archer,mage
  All character have attack
  warrior=attack with sword
  archer=attack with arrow
  mage=attack with magic
  one common reference(name)
 */

import java.util.*;

class Game{
    String name;
    String character;

    void display(){

    }
}
class warrior extends Game{
    warrior(String name,String character){
          this.name=name;
          this.character=character;
    }

    void display(){
        System.out.println(name +" is "+character);
        System.out.println(character+" attack with sword");
    }
}
class archer extends Game{
     archer(String name,String character){
          this.name=name;
          this.character=character;
    }
void display(){
         System.out.println(name +" is "+character);
        System.out.println(character+" attack with arrow");
    }

}
class mage extends Game{
    mage(String name,String character){
          this.name=name;
          this.character=character;
    }
void display(){
         System.out.println(name +" is "+character);
        System.out.print(character+" attack with magic");
    }
}
public class mini {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        String character=sc.next();
        Game g;

        switch(character){
            case "warrior":
                g=new warrior(name, character);
                g.display();break;
            
            case "archer":
                g=new archer(name, character);
                g.display();break;

             case "mage":
                g=new mage(name, character);
                g.display();break;
        }

      
        
     }
}
