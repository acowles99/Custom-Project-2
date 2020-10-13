import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //This project is about creating your own character
  System.out.println("Welcome to your new world!");
  System.out.println(" ");
  //this is to make sure the words aren't jumbled up
  System.out.print("Today you will create your own avatar");//Dialogue to introduce the person

  System.out.println(", but keep in mind that you only have a certain amount of money.");

  System.out.println(" ");

  System.out.println("Sometimes options will be random, but if they are more expensive, it will be a better style.");
  //cut this out later
  System.out.println(" ");

  System.out.println("Choices to customize your characters body type will not cost money");
  System.out.println(" ");

  int credits = 200; //amount of money they can spend

  System.out.println("Total money = $" + credits);
  //Stop 1, everything from here works
  System.out.println(" ");

 Scanner scan = new Scanner(System.in);
 System.out.println("Begin by picking your gender");
 String gender = scan.next();
//scan 1 (it works)
 System.out.println("The list of different hair colors are below");
 System.out.println("1. Blonde");
 System.out.println("2. Brown");
 System.out.println("3. Dirty Blonde");
 System.out.println("4. Black");
 System.out.println(" ");
 System.out.println("Now pick 1 of the four options for your hair color");

 int count = 1;
  while (count <= 4)
  {
    System.out.println(count);
    count++;
  }//this loop works
 int optionSelected = scan.nextInt();
//this scan works

 int hairColor = 14;
 System.out.println("Your price for your hair color is $" + hairColor);

 System.out.println("Your hair color is option " +optionSelected);
 System.out.println(" ");

 System.out.print("credits: " + credits + " - " + hairColor + " = ");
 System.out.println(credits - hairColor);
 //subtracting credits from your original amount
 System.out.println(" ");

 System.out.println("Now you will randomly pick your eye color, ");


  for(int count1 = 1; count1 <= 2; count1++)
  {
    System.out.println(count1);
    
  }
   //this loop works


 Scanner scan1 = new Scanner(System.in);
 System.out.println("Pick your random eye color");
 String eyeColor = scan.next();


 boolean blue = true;
 boolean brown = false;

 if (blue)
   {
     System.out.println("Your eye color is blue");
    }
 else 
   {
     System.out.println("Your eye color is brown");
    }
    //this if statement works
 int eyeColor = 10;
 System.out.print("Current Credits = ");
 System.out.println(credits - eyeColor);


  }
}