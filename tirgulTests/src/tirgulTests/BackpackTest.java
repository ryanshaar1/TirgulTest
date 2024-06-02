package tirgulTests;

public class BackpackTest{

    public static void main(String[] args){
        Backpack backpack1 = new Backpack(5);
        Backpack backpack2 = new Backpack(5);

        backpack1.addItem(1, 3);
        backpack1.addItem(2, 5);
        backpack1.addItem(3, 2);

        backpack2.addItem(1, 2);
        backpack2.addItem(2, 4);
        backpack2.addItem(4, 1);




        // שימוש במתודות של המחלקה Backpack
        System.out.println("Quantity of item 2 in Backpack 1: " + backpack1.getQuantity(2));
        backpack1.updateItemQuantity(2, 6);
        System.out.println("Updated quantity of item 2 in Backpack 1: " + backpack1.getQuantity(2));
        
        backpack1.removeItem(3);
        System.out.println("Backpack 1 after removing item 3:");


        // השוואה בין שני התיקים באמצעות המתודות החדשות והדפסת התוצאות
        System.out.println("Backpack 1 is same as Backpack 2: " + backpack1.isSameAs(backpack2));
        System.out.println("Backpack 1 has more items than Backpack 2: " + backpack1.hasMoreItemsThan(backpack2));
    }
}