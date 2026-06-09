package com.example.customqueue;

import java.util.List;

public class Queue {
    Object[] itemArray;
    int capacity;
    int numItems;
    
    public Queue(Object[] itemArray, int capacity, int numItems) {
        this.itemArray = itemArray;
        this.capacity = capacity;
        this.numItems = numItems;
    }

    public void add(Object item) throws Exception{
        /* 
        if numItems < capacity: 
            add item to "next available slot"
        else 
            throw message
        */
        if(numItems < capacity){
            itemArray[numItems] = item;
            numItems++;
        } else {
            throw new Exception("why didn't I understand this");
        }
    }
    

}
