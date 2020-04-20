package SwitchCase;
import java.util.*;

public class SwitchCase {

  public static void main(String[] args) {
   int choice;
   System.out.println("Pick one:1. Hi\t2. Hey\t3. Hello\t");
   Scanner s=new Scanner(System.in);
   choice=s.nextInt();
   switch(choice);
   {
     Case1:System.out.println("You said Hi");
     break;
     Case2:System.out.println("You said Hey");
     break;
     Case3:System.out.println("You said Hello");
     default:System.out.println("Invalid choice");
   }
  }
}
