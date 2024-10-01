import java.util.Scanner;
public class LinkedListMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        System.out.println("Enter the operation you want to perform: ");
        System.out.println("1.Insert element At Tail\n2.Insert element At Head" +
                "\n3.Insert element At Specific Position");
        int op = sc.nextInt();
        if(op==1){
            System.out.print("Enter the number of elements to be inserted: ");
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.print("Enter the element to be inserted: ");
                int element = sc.nextInt();
                list.InsertAtTail(element);
            }
            list.Display();
        }
        else if(op==2){
            System.out.print("Enter the number of elements to be inserted: ");
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.print("Enter the element to be inserted: ");
                int element = sc.nextInt();
                list.InsertAtHead(element);
            }
            list.Display();
        }
        else if(op==3){
            System.out.println("Input to List: ");
            System.out.print("Enter the number of elements to be inserted: ");
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.print("Enter the element to be inserted: ");
                int element = sc.nextInt();
                list.InsertAtTail(element);
            }
            list.Display();
            System.out.print("Enter the position where elemented has to be inserted: ");
            int pos = sc.nextInt();
            System.out.print("Enter the element to be inserted: ");
            int element = sc.nextInt();
            list.InsertAtPos(element,pos);
            list.Display();
        }
    }
}
