import java.util.Scanner;

import org.graalvm.compiler.nodes.debug.BlackholeNode;
import org.graalvm.compiler.replacements.nodes.BitScanForwardNode;

import sun.jvm.hotspot.runtime.BasicLock;

class Main {
  public static void main(String[] args) {
    //This project is about creating your own character
  System.out.println("Welcome to your new world!");
  System.out.print("Today you will create your own avatar");//Dialogue to introduce the person

  System.out.println(", but keep in mind that you only have a certain amount of money.");

  System.out.println("Sometimes options will be random, but if they are more expensive, it will be a better style.");

  System.out.println("Choices to customize your characters body type will not cost money");

  int credits = 200; //amount of money they can spend

  System.out.println("Total money = $" + credits);
  //Stop 1, everything from here works

 Scanner scan = new Scanner(System.in);
 System.out.println("Begin by picking your gender");
 String gender = scan.next();
//scan 1 (it works)
 System.out.println("Now pick 1 of the four options for your hair color");
 int count = 1;
  while (count <= 4)
  {
    System.out.println(count);
    count++;
  }//this loop works
  int optionSelected = scan.nextInt();
//this scan works

 System.out.println("Your price for your hair color is $14");


string hair1 = blonde;
string hair2 = black;
string hair3 = brown;
string hair4 = silver;




  }
}