
package project1;

public class ShoppingCart {
    BagInterface<Item> bag;
    public ShoppingCart(BagInterface<Item> bag){
        this.bag = bag;
    }
    public String receipt()
    {
        //Let's you add more things to buffer
        StringBuilder builder = new StringBuilder();
        //Must have object array to use toArray method
        Object[] result = bag.toArray();

        for(Object object :result)
        {
            Item item = (Item)object;
            builder.append(item.toString());
            builder.append("\n");
        }
        builder.append(String.format("Total: $%.2f",getTotalCost()));
        return builder.toString();
    }
    public double getTotalCost()
    {
        double total = 0;
        Object[] result = bag.toArray();
        for(Object object: result)
        {
            //Casting needed
            Item item = (Item)object;
            total += item.getPrice();
        }
        return total;
    }
    public boolean addItem(Item item)
    {
       return bag.add(item);
    }
    public Item removeItem()
    {
      return bag.remove();
    }
   public boolean removeItem(Item item){
       return bag.remove(item);
    }
   public int getNumberOfItems(){
        return bag.getCurrentSize();
  }
   public void abandon(){
        bag.clear();
}
    public Object[] toArray()
    {
        Object[] result = bag.toArray();
        return result;
    }

 /*   public void printReceipt()
    {
        double total =0;
        Object[] result = bag.toArray();
        Item thisItem;

        System.out.println("\n--Shopping Bag Receipt---");
        //iterating over an array
        for (int i = 0; i < result.length; i++) {
            // accessing each element of array
            thisItem = (Item) result[i];

            System.out.println("Item Number: "+ i);
            System.out.println("Name: "+ thisItem.getNameOfItem());
            System.out.println("Price: $"+ thisItem.getItemPrice());
            System.out.println("--------------------");

            total = total + thisItem.getItemPrice();
        }

        System.out.println("--------------------");
        System.out.println("Cart Total: $"+total);
        System.out.println("---------------------");
    }


    public boolean removeSpecificItem(Item item)
    {
       return bag.remove(item);
    }
    public int getCurrentSize()
    {
      return bag.getCurrentSize();
    }
    */
}
