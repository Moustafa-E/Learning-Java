package org.example.customqueue;

public class Queue <T> {

    private Object[] items;
    private int capacity;
    private int numItems;

    public Queue(int capacity) {
        this.items = new Object[capacity];
        this.capacity = capacity;
        numItems = 0;
    }

    public void add(T item) throws Exception {
        if (numItems < capacity) {
            items[numItems] = item;
            numItems++;
        } else {
            throw new Exception("The queue is full");
        }
    }

    public T remove() throws Exception {
        if (numItems > 0) {
            T firstItem = (T) items[0];
            for (int i = 1; i  < numItems; i++) {
                items[i - 1] = items;
            }
            numItems--;
            return firstItem;
        } else {
            throw new Exception("The queue is empty");
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNumItems() {
        return numItems;
    }
}
