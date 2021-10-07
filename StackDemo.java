public class StackDemo{

   public static void main(String[] args){
       printHeader();
       MyStack stack = new MyStack(0);
       System.out.println(stack.toString());
       String[] array = {"251167970", "Zheng", "Felix", "251135537","Chan", "Catriona"};
       for (int i =0; i<array.length; i++){
           stack.push(array[i]);
       }
       System.out.println(stack.toString());
       System.out.println(stack.peek());
       String distance = (stack.search("251135537")) +"";
       System.out.println(distance);
        int studentNum= Integer.parseInt(distance);
       int lastNum = studentNum%10;
       int firstNum = studentNum/1000000;
       //System.out.println(lastNum);
       //System.out.println(firstNum);
       double avg = ((double)firstNum+lastNum)/2;
       //System.out.println(avg);



       
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