// this is just a simple shopping cart program 
import java.util.Scanner;
public  class Main {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
   System.out.println("what do you like to buy? :");
      String item = sc.nextLine();
    System.out.println("what is the price for each? ($) :");
     double price = sc.nextDouble();
    System.out.println("how many would you like? (1,2,3...) :");
      int amount = sc.nextInt();
      Double result = amount * price;
    System.out.println("you have bought " + amount + item);
    System.out.println("your total is " + result + "$");

      sc.close()
        }
}
      
      
      
