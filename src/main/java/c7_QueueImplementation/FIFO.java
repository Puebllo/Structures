package c7_QueueImplementation;

import c6_LinkedList.model.ELEMENT;

import java.util.Vector;

public class FIFO<T extends Object> {
    private Vector<T> dataVector;
    private int queueCapacity = 0;
    private int head;
    private int tail;
    private int currentQueueSize;

    public FIFO(int queueCapacity) {
        this.queueCapacity = queueCapacity;
        dataVector = new Vector<>(this.queueCapacity);
        dataVector.setSize(this.queueCapacity);
        this.head = 0;
        this.tail = -1;
    }

    public void offer(T obj){
        //Check if queue capacity hasn't been exceeded
        if (currentQueueSize!=queueCapacity){
            //reset tail index
            if (tail==queueCapacity-1){
                tail = -1;
            }
            dataVector.setElementAt(obj,++tail);
            currentQueueSize++;
            System.out.println("Offering ["+obj.toString()+"] to queue");
        }else{
            System.out.println("Queue is full. Offering ["+obj.toString()+"] is impossible");
        }
    }

    public <T extends Object> T poll(){
        T toReturn = null;
        //Check if queue is not empty
        if (currentQueueSize!=0){
            toReturn = (T) dataVector.elementAt(head++);
          //  dataVector.remove(toReturn);
           if (head == queueCapacity){
               head = 0;
           }
            currentQueueSize--;
        }else{
            System.out.println("Queue is empty. Nothing to poll");
        }
        return toReturn;
    }

    public <T extends Object> T peek(){
        return (T) dataVector.elementAt(head);
    }

    public void printElements(){
        System.out.print("[");
        int k = head;
        for (int i = 0 ; i<currentQueueSize ; i++){
            if (k==queueCapacity){
                k = 0;
            }
            System.out.print((T)(dataVector.elementAt(k)).toString() + ",");
            k++;
        }

        System.out.print("]");
    }
}
