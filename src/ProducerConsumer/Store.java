package ProducerConsumer;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private int maxSize;
    private List<Object> items;

    Store(int maxSize){
        this.maxSize = maxSize;
        items = new ArrayList<>();
    }

    public int getMaxSize() {
        return maxSize;
    }


    public List<Object> getItems() {
        return items;
    }

    public void addItem(Object item){
        System.out.println("Item is produced : " + items.size());
        items.add(item);
    }

    public void removeItem(){
        System.out.println("Item is consumed : " + items.size());
        items.remove(items.size()-1);
    }

}

