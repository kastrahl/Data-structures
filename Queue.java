class Queue{
    private static int front,rear,capacity;
    private static int queue[];

    Queue(int size){
        front = rear = 0;
        capacity = size;                    //  left space in queue array
        queue = new int[capacity];          //  an array as queue 
    }

    public void enQueue(int item){
        if(capacity == rear){               //  if queue is full
            System.out.println("Queue is full");
        }
        else{                               //  insert element at the rear
            queue[rear] = item;
            rear++;
        }
        return;
    }
    public void deQueue(){               //  remove element from rear
        if(front==rear){
            System.out.println("Queueis empty");
            return ;
        }
        else{
            for(int i=0;i<rear-1;i++){      //  shift one element to right 
                queue[i] = queue[i+1];
            }

            if(rear < capacity)             //  clear the last element which is repeated in array
                queue[rear] = 0;

        rear--;                             //  decrease rear's flag 
        }
        return;
    }
    public void queueDisplay(){
        int i;
        if(front == rear){
            System.out.println("Queue is Empty");
            return;
        }

        for(i=front ; i<rear ; i++){        //  traverse from front to rear
            System.out.println(" %d, ",queue[i]);
        }
        return;
    }
    public void queueFront(){
        if(front==rear){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Queue front is",queue[front]);
        return;
    }
}

public class QueueArrayImplementation {
    public static void main(String[] args){
        Queue q = new Queue(4);
        System.out.println("initital Queue");
        q.queueDisplay();
        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);
        q.queueDisplay();
        q.queueFront();   
    }
}