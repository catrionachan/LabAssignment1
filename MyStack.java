import java.util.*;
import java.lang.*;

public class MyStack <E>{
    private Object[] objectArray;
    private int length;

    public MyStack(int length){
        objectArray = new Object[length];
    }

    public boolean empty(){
        for (int i = 0 ; i < objectArray.length; i++) {
            if (objectArray[i] != null){
                return false;
            }
        }
        return true;
    }

    public E peek(){
        return (E) objectArray[objectArray.length - 1];
    }

    public E pop(){
        
        E topValue = (E)objectArray[objectArray.length - 1];
        objectArray = new Object[objectArray.length -1];

        return topValue;
    }
    

    public E push(E anyName){
        Object [] newArray = new Object[objectArray.length +1];
        System.arraycopy(objectArray,0, newArray, 0, newArray.length-1);
        newArray[objectArray.length] = anyName;
        objectArray = newArray;
        return (E) objectArray;
    } 
    

    public int search(Object anyName){
        int counter =0;
        for (int i=objectArray.length -1;i>=0; i--){
            counter++;
            if (objectArray[i].equals(anyName)){
                return counter; 
            } 
        }
        return counter;
    } 
    
    public String toString(){
        if (empty()==true) {
            return "The stack is Empty! The stack: " + Arrays.toString(objectArray);
        }else{
            return Arrays.toString(objectArray);
        }
    }
}
