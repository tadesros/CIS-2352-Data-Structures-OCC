package project1;

public class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    //Good place check for negative
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return name + " $" + price;
    }

    @Override
    public boolean equals(Object other) {
        //If they don't match return false
        if (other.getClass() != getClass()) {
            return false;
        }
        //If they do match cast
        Item otherItem = (Item)other;
        return name.equalsIgnoreCase(otherItem.name) && price == otherItem.price;
    }
/*

    public String getNameOfItem() {
        return nameOfItem;
    }

    public void setNameOfItem(String nameOfItem) {
        this.nameOfItem = nameOfItem;
    }
    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
   public boolean equals(Item I) {
      //Check if values are equal
        if((this.getItemPrice() == I.getItemPrice()) && (this.getNameOfItem() == I.getNameOfItem()))
        {
            return true;
        }
        return false;
    }
*/
}

