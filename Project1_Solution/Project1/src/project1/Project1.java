package project1;

import java.util.Scanner;

public class Project1 {

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Did you want to sue an ArrayBad or LinkedOBject Bag today?");

        String bagType = keyboard.nextLine();
        BagInterface<Item> bag;

        if(bagType.equalsIgnoreCase("arraybag"))
        {
            bag = new BagArray<Item>();
        }
        else{
            bag = new BagLinkedObjects<Item>();
        }

        ShoppingCart cart = new ShoppingCart(bag);

        String stop = "No";

        while (!stop.equalsIgnoreCase("yes"))
        {

            String option = "";
            //Show menu stay in menu until valid result
            while(!option.equals("1") &&
                    !option.equals("2") && !option.equals("3")
                    && !option.equals("4") && !option.equals("5"))
            {
                System.out.println("Welcome to shopping cart what do you want to do?");
                System.out.println("1 - Add Item");
                System.out.println("2 - Remove random item");
                System.out.println("3 - Remove specific item");
                System.out.println("4 - Get number of items in cart");
                System.out.println("5 - Abandon the cart");
                option = keyboard.nextLine();
            }


            if(option.equals("1")){
                System.out.println("Enter the name:");
                String name = keyboard.nextLine();
                System.out.println("Enter the item price: ");
                double price = Double.parseDouble(keyboard.nextLine());
                Item item = new Item(name,price);

                cart.addItem(item);
            }
            else if(option.equals("2")){
                System.out.println("Removed: "+cart.removeItem());
            }
            else if(option.equals("3")){
                System.out.println("Enter the name:");
                String name = keyboard.nextLine();
                System.out.println("Enter the item price: ");
                double price = Double.parseDouble(keyboard.nextLine());
                Item item = new Item(name,price);



                if(cart.removeItem(item)){
                    System.out.println("removed successfully");
                }
                else
                {
                    System.out.println("Couldn't find that item in the cart");
                }
            }
            else if(option.equals("4")){
                System.out.println(String.format("You have %d items in your cart",
                cart.getNumberOfItems()));

            }
            else if(option.equals("5")){
               cart.abandon();
               System.out.println("You abandon your cart, you should be ashamed!");
            }


            System.out.println("Do you want to check out? Yes/No");

            stop = keyboard.nextLine();

        }
            System.out.println(cart.receipt());
    }
}
