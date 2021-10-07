import java.util.*;

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
        

        return (E) objectArray;
    } 
    

    public int search(Object anyName){
        return 1;
    } 
    
    public String toString(){
        if (empty()==true) {
            return "The stack is Empty! The stack: " + Arrays.toString(objectArray);
        }else{
            return Arrays.toString(objectArray);
        }
    }
}
