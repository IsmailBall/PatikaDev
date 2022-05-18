
import java.lang.reflect.Array;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Asus
 */
public class MyList<T> {

    private int size;
    private int capacity;
    private T[] data;

    public MyList() {
        this.size = 0;
        this.capacity = 10;
        this.data = setArray(capacity);
    }

    public MyList(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        this.data = setArray(capacity);
    }

    private T[] setArray(int capacity) {
        return (T[]) (new Object[capacity]);
    }

    public int size() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(T data) {
        if (size() < getCapacity()) {
            this.data[size++] = data;
            return;
        }

        capacity *= 2;
        T[] newData = setArray(capacity);

        for (int i = 0; i < size; i++) {
            newData[i] = this.data[i];
        }

        newData[size++] = data;
        this.data = newData;
    }

    public T get(int index) {
        if (isFaultyIndex(index)) {
            return null;
        }
        return this.data[index];
    }

    public T remove(int index) {
        if (isFaultyIndex(index)) {
            return null;
        }

        T temp = this.data[index];
        shiftData(index);
        size--;
        return temp;
    }

    public T set(int index, T data) {
        if (isFaultyIndex(index)) {
            return null;
        }

        this.data[index] = data;
        return data;
    }
    
    public int indexOf(T data)
    {
        if(isEmpty())
            return -1;
        
        for (int i = 0; i < size; i++) {
            if(this.data[i] == data)
                return i;
        }
        
        return -1;
    }
    
    public int lastIndexOf(T data)
    {
        if(isEmpty())
            return -1;
        
        int index = -1;
        for (int i = 0; i < size; i++) {
            if(this.data[i] == data)
                index = i;
        }
        
        return index;
    }
    
    public T[] toArray()
    {
        T[] newArray = setArray(size);
        for (int i = 0; i < size; i++) {
           newArray[i] = this.data[i];
        }
        
        return newArray;
    }
    
    public void clear()
    {
        this.size = 0;
        this.data = setArray(capacity);
    }
    
    public MyList<T> subList(int start,int finish){
        if(isFaultyIndex(finish) || isFaultyIndex(start))
            return null;
        
        MyList<T> myList = new MyList<T>();
        for (int i = start; i <= finish; i++) {
            myList.add(this.data[i]);
        }
        return myList;
    }
    
    public boolean contains(T data)
    {
        for (int i = 0; i < size; i++) {
            if(this.data[i] == data)
                return true;
        }
        return false;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private boolean isFaultyIndex(int index) {
        return index < 0 || index >= size;
    }

    private void shiftData(int index) {
        for (int i = index; i < size - 1; i++) {
            this.data[i] = this.data[i + 1];
        }
    }

    @Override
    public String toString() {
        
        if(isEmpty())
            return "";
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
             sb.append(this.data[i].toString());
             if(i != size - 1)
                sb.append(",");
        }
        sb.append("]");
        return sb.toString();
    }
    
}
