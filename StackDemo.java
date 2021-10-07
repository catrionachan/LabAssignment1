public class StackDemo{

   public static void main(String[] args){
       printHeader();
       System.out.println("Revisiting the concept of Stack.....");
       MyStack<String> stack = new MyStack<>(0);
       System.out.println(stack.toString());
       System.out.println("Pushing the String values to the stack....");
       String[] array = {"251167970", "Zheng", "Felix", "251135537","Chan", "Catriona"};
       for (int i =0; i<array.length; i++){
           stack.push(array[i]);
       }
       System.out.println(stack.toString());
       System.out.println("The value at the top is: "+ stack.peek());
       System.out.println("Searching for studentNumber1....");

       String distance = (stack.search("251135537")) +"";
       System.out.println("The item has been found in distance "+distance+" with reference to the top");
       int studentNum= Integer.parseInt("251135537");
       System.out.println(studentNum);
       int lastNum = studentNum%10;
       int firstNum = studentNum/100000000;
       System.out.println("The first number in the student ID is "+firstNum);
       System.out.println("The last number in the student ID is "+lastNum);
       double avg = ((double)firstNum+lastNum)/2;
       System.out.println("The average of these two numbers is: "+avg);
       System.out.println("Team Member 1 info.....");
       System.out.println("First Name: " + stack.pop());
       System.out.println("Last Name: " + stack.pop());
       System.out.println("Student Number: " + stack.pop());
       System.out.println("Team Member 2 info.....");
       System.out.println("First Name: " + stack.pop());
       System.out.println("Last Name: " + stack.pop());
       System.out.println("Student Number: " + stack.pop());
       System.out.println("Here is the status of the Stack...");
       System.out.println(stack.toString());
       printFooter();




       
   }
   
   //when called will print the header
   public static void printHeader (){
        System.out.println("*******************************************************\n" +
            "Names: Felix and Catriona.\n"+
            "Student Numbers: 251167970 and 251135537\n" +
            "Goal of this project: Create a generic class to represent a stack memory\n" +
            "and testing the memory using student numbers and names.\n"+
            "*******************************************************\n");
   }
   public static void printFooter (){
    // prints the following when called
    System.out.println("Goodbye!");
}
}