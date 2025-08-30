import java.util.*;
public class collection {

  public static void main(String[] args){

    // create linkedlist
    LinkedList<String> animals = new LinkedList<>();

    // Add elements to LinkedList
    animals.add("Dog");
    animals.add("Cat");
    animals.add("Cow");
    System.out.println("LinkedList: " + animals);
      animals.set(2,"Lion" );
       System.out.println("LinkedList: " + animals);
       
       System.out.println("head : " + animals.getFirst());
       
       Collections.sort(animals);  
       
        System.out.println("LinkedList: " + animals);
    
  }
}
