import java.util.Scanner;

public class  Shoppingcurt{
    public static void main(String[]args) {

        //Shopping curt program

        Scanner Shopping = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy: ");
        item = Shopping.nextLine();

        System.out.print("What is the price for each?: ");
        price = Shopping.nextDouble();

        System.out.print("How many would you like?: ");
        quantity = Shopping.nextInt();

        total = price * quantity;

        System.out.println("\nyou have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is " + currency + total);


        Shopping.close();
    }
    
}
