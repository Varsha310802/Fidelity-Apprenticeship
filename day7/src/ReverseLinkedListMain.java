import java.util.Scanner;

public class ReverseLinkedListMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReverseLinkedList list = new ReverseLinkedList();
        System.out.print("Enter the number of elements to be inserted: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element to be inserted: ");
            int element = sc.nextInt();
            list.InsertAtTail(element);
        }
        list.Display();
        list.reverse();
        System.out.println("Reversed List: ");
        list.Display();
    }
}
