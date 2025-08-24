import java.util.Scanner;

class Order {
    int orderNumber;
    String itemName;
    double price;

    Order(int orderNumber, String itemName, double price) {
        this.orderNumber = orderNumber;
        this.itemName = itemName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[Order No: " + orderNumber + ", Item: " + itemName + ", Price: " + price + "]";
    }
}

class Node {
    Order data;
    Node next;

    Node(Order data) {
        this.data = data;
        this.next = null;
    }
}

class OrderLinkedList {
    Node head;

    // Insert order at end
    public void insert(Order order) {
        Node newNode = new Node(order);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Display all orders
    public void displayOrders() {
        Node temp = head;
        System.out.println("\nOrders List:");
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    // Calculate total revenue
    public double calculateTotal() {
        Node temp = head;
        double total = 0;
        while (temp != null) {
            total += temp.data.price;
            temp = temp.next;
        }
        return total;
    }
}

public class OnlineShopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OrderLinkedList list = new OrderLinkedList();

        System.out.print("Enter number of orders: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 1; i <= n; i++) {
            System.out.println("\nEnter details for Order " + i + ":");
            System.out.print("Item Name: ");
            String item = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine(); // consume newline

            list.insert(new Order(i, item, price));
        }

        // Display all orders
        list.displayOrders();

        // Show total revenue
        System.out.println("\nTotal Revenue = " + list.calculateTotal());

        sc.close();
    }
}