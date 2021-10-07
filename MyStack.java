import java.util.*;

public class MyStack <E>{
    private Object[] objectArray;
    private int length;

    //constructor to creat stack with given length
    public MyStack(int length){
        objectArray = new Object[length];
    }

    //method checks if stack is empty and returns the finding as a boolean (True/False) value
    public boolean empty(){
        for (int i = 0 ; i < objectArray.length; i++) {
            if (objectArray[i] != null){
                return false;
            }
        }
        return true;
    }

    //method returns the top stack value
    public E peek(){
        
        return (E) objectArray[objectArray.length - 1];
    }

    //method returns the top stack value and removes the object from the Stack
    public E pop(){
        
        E topValue = (E)objectArray[objectArray.length - 1];
        Object[] newArray = new Object[objectArray.length -1]; 
        System.arraycopy(objectArray,0, newArray, 0, newArray.length);
        objectArray = newArray;
        newArray=null;
        return topValue;
    }
    

    //method adds new value to the stack and returns the new value
    public E push(E anyName){
        Object [] newArray = new Object[objectArray.length +1];
        System.arraycopy(objectArray,0, newArray, 0, newArray.length-1);
        newArray[objectArray.length] = anyName;
        objectArray = newArray;
        newArray = null;
        return anyName;
    } 
    
    //method searches in stack for value and returns the value's position in stack 
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
    
    //String method to format values of stack
    public String toString(){
        if (empty()==true) {
            return "The stack is Empty! The stack: " + Arrays.toString(objectArray);
        }else{
            return "The stack: "+ Arrays.toString(objectArray);
        }
    }
}
