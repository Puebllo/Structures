package c7_StackImplementation;

import java.util.Vector;

public class StackImpl<T extends Object> {
    private Vector<T> vectorData;

    public StackImpl(int initialCapacity) {
        vectorData = new Vector<>(initialCapacity);
    }

    public void push(T obj){
        if (vectorData.size()<vectorData.capacity()){
            vectorData.add(obj);
            System.out.println("Element added to stack = " + obj.toString());
        }else{
            System.out.println("Stack is full. Object ["+obj.toString()+"] hasn't beed added");
        }
    }
    public <T extends Object> T pop() {
        T object = null;
        if (vectorData.size()>0){
            object = (T) vectorData.lastElement();
            vectorData.removeElementAt(vectorData.size()-1);
        }
        return object;
    }

    public int capacity(){
        return vectorData.capacity();
    }

    public int size(){
        return vectorData.size();
    }

    @Override
    public String toString() {
        return vectorData.toString();
    }

    public void clear(){
        vectorData.clear();
    }
}
