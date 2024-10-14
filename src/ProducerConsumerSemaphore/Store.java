package ProducerConsumerSemaphore;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Store {
    private int maxSize;
//    This is not a thread safe DS
//
    private ConcurrentLinkedQueue<Object> items;

    Store(int maxSize){
        this.maxSize = maxSize;
        items = new ConcurrentLinkedQueue<>();
    }

    public int getMaxSize() {
        return maxSize;
    }


    public ConcurrentLinkedQueue<Object> getItems() {
        return items;
    }

    public void addItem(Object item){
        System.out.println("Item is produced : " + items.size());
        items.add(item);
    }

    public void removeItem(){
        System.out.println("Item is consumed : " + items.size());
        items.remove();
    }

}

