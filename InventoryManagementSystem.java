import java.util.Scanner;
/**
 * Write a description of class InventoryManagementSystem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InventoryManagementSystem
{
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       String[] productname={"T-shirt","Jacket","Shoes"};
       Double[] prices={600.00,400.00,300.00};
       int[] quantities={20,40,50};
       System.out.println("Product in Inventory Management System= ");
        for(int j=0; j< productname.length;j++){
            System.out.printf("%d.%s - price=$%.3f, Qty=%d%n",j + 1,productname[j],prices[j],quantities[j]);
        }
        System.out.println("\n Enter  product name to Search= ");
        String Search=sc.nextLine();
        boolean found = false;
        for (int j = 0; j < productname.length; j++){
            if(productname[j].equalsIgnoreCase(Search)){
                System.out.printf("found=%s - price=$%.2f - Qty: %d%n",productname[j],prices[j],quantities[j]);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.printf("Product is not found!");
        }
        System.out.print("\nEnter product name to update quantity= ");
        String update =sc.nextLine();
        found = false;
        for (int j = 0; j < productname.length; j++){
            if(productname[j].equalsIgnoreCase(update)){
                System.out.print("Enter  quantity to add= ");
                int addQty = sc.nextInt();
                quantities[j] += addQty;
                System.out.printf("Updated quantity of %s: %d%n", productname[j], quantities[j]);
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println(" Product of Quality  is not found!");
        }
  }
 }