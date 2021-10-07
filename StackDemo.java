public class StackDemo{

   public static void main(String[] args){
       printHeader();
       MyStack stack = new MyStack(0);
       System.out.println(stack.toString());
       String[] array = {"251167970", "Zheng", "Felix", "251135537","Chan", "Catriona"};
       for (i)
       push(array);


       
   }
   
   //when called will print the header
   public static void printHeader (){
        System.out.println("*******************************************************\n" +
            "Names: Felix and Catriona.\n"+
            "Student Numbers: 251167970 and 251135537\n" +
            "Goal of this project: Create a data structure that will keep a record of keys and values\n" +
            "the keys and values would be the year number and names of the student leaders in the university student council.\n"+
            "*******************************************************\n");
   }
}