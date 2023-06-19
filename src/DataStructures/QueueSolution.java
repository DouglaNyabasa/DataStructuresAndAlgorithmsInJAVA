package DataStructures;

class QueueImplementingArray{

    int capacity ;
     static int [] queue1;
    int front, rear;

    QueueImplementingArray(int size) {
        capacity= size;
        queue1 = new int[capacity];
    }

    void enQueue ( int element){
        if (rear == capacity) {
            System.out.println("Queue is not empty");
        }
        else
        {
            queue1[rear] = element;
            rear++;
            System.out.println("Inserted" + element);
        }
    }
    void deQueue () {
        if (rear == 0){
            System.out.println("Queue empty");
        }else {
            for (int i=0; i<rear-1;rear++){
                queue1[i]=queue1[i+1];
            }
            rear--;
        }
        }
        void display(){
        if (rear==0){
            System.out.println("queue is empty");
        }
        else {
            for (int i=0;i<rear;i++){
                System.out.println(queue1[i]);
            }
        }
        }

}
public class QueueSolution {

    public static void main(String[] args) {

        // enqueue && dequeue operations has a 0(1) COMPLEXITY

        QueueImplementingArray queue2 = new QueueImplementingArray(6);
        queue2.enQueue(1);
        queue2.enQueue(2);
        queue2.enQueue(3);
        queue2.enQueue(4);
        System.out.println("\n Queue AFTER enQueue ");
        queue2.display();
        System.out.println("\n Queue AFTER deQueue ");
        queue2.deQueue();
        queue2.display();
    }
}
