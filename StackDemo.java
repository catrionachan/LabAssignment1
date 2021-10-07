public class StackDemo{
   public static void main(String[] args){
       printHeader();// prints header
       System.out.println("Revisiting the concept of Stack.....");
       MyStack<String> stack = new MyStack<>(0); //instantiate new stack with length 0
       System.out.println(stack.toString()); // prints the 0 length stack 
       System.out.println("Pushing the String values to the stack....");
       String[] array = {"251167970", "Zheng", "Felix", "251135537","Chan", "Catriona"};// creates new String array with student numbers and names
       for (int i =0; i<array.length; i++){//push the String array values to stack
           stack.push(array[i]);
       }
       System.out.println(stack.toString()); //Prints out stack value
       System.out.println("The value at the top is: "+ stack.peek());//prints the top value of the stack
       System.out.println("Searching for studentNumber1....");
       String distance = (stack.search("251135537")) +""; //searches for student number in stack
       System.out.println("The item has been found in distance "+distance+" with reference to the top"); //prints out the position where student number is found
       int studentNum= Integer.parseInt("251135537");//parse the string value into an integer number
       int lastNum = studentNum%10; //gets the last number of the studentNum variable
       int firstNum = studentNum/100000000; //gets the first number in the studentNum variable
       System.out.println("The first number in the student ID is "+firstNum); // prints out the first number in studentNum variable
       System.out.println("The last number in the student ID is "+lastNum);// prints out the last number in studentNum variable
       double avg = ((double)firstNum+lastNum)/2; //determine average of first and last number in student ID
       System.out.println("The average of these two numbers is: "+avg); //prints out average
       printFooter(stack);//print footer with stack parameter passed
   }
   
   //when called will print the header
   public static void printHeader (){
        System.out.println("*******************************************************\n" +
            "Names: Catriona Chan and Felix Zheng.\n"+
            "Student Numbers: 251135537 and 251167970\n" +
            "Goal of this project: Create a generic class to represent a stack memory\n" +
            "and testing the memory using student numbers and names.\n"+
            "*******************************************************\n");
   }
   
   //when called will print the footer
   public static void printFooter (MyStack <String> stack){
    //Print the first team member information and removes them from stack using pop
    System.out.println("Team Member 1 info.....");
    System.out.println("First Name: " + stack.pop());
    System.out.println("Last Name: " + stack.pop());
    System.out.println("Student Number: " + stack.pop());
    //Print the second team member information and removes them from stack using pop
    System.out.println("Team Member 2 info.....");
    System.out.println("First Name: " + stack.pop());
    System.out.println("Last Name: " + stack.pop());
    System.out.println("Student Number: " + stack.pop());
    //Print the status of the stack 
    System.out.println("Here is the status of the Stack...");
    System.out.println(stack.toString());
    System.out.println("Goodbye!");
}
}