import java.util.Scanner;

public class p2 {
    public static int bill(int pizza,int puffs,int pepsi){
        int total=0;
        int pizza_price=200;
        int puffs_prize=40;
        int pepsi_price=120;

        int total_pizza=pizza*pizza_price;
        int total_puffs=puffs*puffs_prize;
        int total_pepsi=pepsi*pepsi_price;
        System.out.println("Pizza "+"\t" + pizza+"\t\t" + total_pizza);
        System.out.println("Puffs " +"\t" + puffs +"\t\t" +total_puffs);
        System.out.println("Pepsi " +"\t"+ pepsi +"\t\t"+ total_pepsi);
        total=total_pizza+total_puffs+total_pepsi;
        return total;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int pizza,puffs,pepsi;
        System.out.println("Enter the number of pizzas purchased");
        pizza=sc.nextInt();
        System.out.println("Enter the number of puffs purchased");
        puffs=sc.nextInt();
        System.out.println("Enter the number of pepsi purchased");
        pepsi=sc.nextInt();
        System.out.println("********BILL DETAILS*********");
        System.out.println("NAME " + " QUANTITY "  + " TOTAL ");
        int grand_total=bill(pizza,puffs,pepsi);
        System.out.println("Grand Total  "+"\t" + grand_total);
    }
    }


