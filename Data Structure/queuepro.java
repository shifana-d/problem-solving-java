public class queuepro {

    public static void main(String[] args) {
        Queue q = new Queue(10);

        // Enqueue elements
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();

        // Dequeue elements and display the queue after each dequeue
        q.dequeue();
        q.display();
        
        q.dequeue();
        q.display();
        
        q.dequeue();
        q.display();
        
        q.dequeue(); // Trying to dequeue from an empty queue
        q.display();
    }
}

class Queue {
    int rear, size;
    int[] a;

    // Constructor to initialize the queue
    Queue(int n) {
        rear = -1;
        a = new int[n];
        size = n;
    }

    // Enqueue operation: Adds an element to the queue
    void enqueue(int n) {
        if (rear == size - 1) {
            System.out.println("Queue full\n");
        } else {
            a[++rear] = n;
            System.out.println("Enqueued: " + n);
        }
    }

    // Display the current elements of the queue
    void display() {
        if (rear == -1) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue: ");
            for (int i = 0; i <= rear; i++) { // Only print valid elements
                System.out.print(a[i] + " ");
            }
            System.out.println("\n--------------------------");
        }
    }

    // Dequeue operation: Removes an element from the queue
    void dequeue() {
        if (rear == -1) {
            System.out.println("Queue empty\n");
        } else {
            System.out.println("Dequeued: " + a[0]);
            // Shift elements to the left
            for (int i = 0; i < rear; i++) {
                a[i] = a[i + 1];
            }
            a[rear] = 0; // Reset the last element to 0 (optional)
            rear--;
        }
    }
}
