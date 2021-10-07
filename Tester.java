
import java.util.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalTime;  
import java.util.ArrayList;
import java.util.Arrays;

public class Tester {
   public static void main(String[] args) {
       printHeader(); // print header
       ArrayList<Integer> yearOfStudy = new ArrayList(Arrays.asList(2,3,4,3,2,2)); //creates Array List for integers
       ArrayList<String> names = new ArrayList(Arrays.asList("Harry", "Lavender", "Ron", "Hermione", "Luna","Vincent"));//creates arrayList for names
       Pair[] pairing = new Pair[yearOfStudy.size()]; //Creates arrays of Pair objects
       for(int i=0; i< yearOfStudy.size();i++){ // for loop to populate the array based on year and name from array lists
           Pair<Integer, String> pair = new Pair<Integer, String>(yearOfStudy.get(i), names.get(i));
           pairing[i] = pair;
        }
        Pair.getRep_FelixCatriona(pairing);
        Scanner scan = new Scanner(System.in);
        
        int input;
        String stringInput;
        System.out.print("\nFrom which year you are looking for the names of the student leaders: ");
        while (true) {
            try {
                input = scan.nextInt();
                if (input >=2 && input <=4){
                    int count=0;
                    String list="";
                    Integer keyInput = input;
                    for (int i =0; i< pairing.length; i++){ //prints out the names of people in the academic year of user input
                        if (pairing[i].getKey() == keyInput){
                            count++;
                            list += (pairing[i].getValue() +"\n");
                        }

                    }
                    System.out.printf("\nWe found %d student leader(s) from year %d and here is the list:\n%s",count,input, list);
                    
                    scan.nextLine();
                    
                    System.out.print("\nDo you want to Continue (y/n):"); // asks user to continue the program
                    stringInput = scan.nextLine();
                    if (stringInput.equals("n")){
                            System.out.println("\nHere is the list of the class-reps.....");
                            Pair[] arr = Pair.getRep_FelixCatriona(pairing);
                            for (int i = 0 ; i < arr.length; i++){
                                System.out.println(arr[i].getKey()+" - "+arr[i].getValue());
                            }
                            break; //if user input a correct value, break out of the while loop
                        }
                    while (!stringInput.equals("y")){ //determine if it is a valid entry
                        System.out.print("\nInvalid Entry! Enter either y or n: ");
                        stringInput = scan.nextLine();
                        if (stringInput.equals("n")){
                            System.out.println("\nHere is the list of the class-reps.....");
                                Pair[] arr = Pair.getRep_FelixCatriona(pairing);
                                for (int i = 0 ; i < arr.length; i++){
                                    System.out.println(arr[i].getKey()+" - "+arr[i].getValue());
                                }
                                break; //if user input a correct value, break out of the while loop
                            }
                    }
                    if (stringInput.equals("n")){
                        System.out.println("\nHere is the list of the class-reps.....");
                        Pair[] arr = Pair.getRep_FelixCatriona(pairing);
                        for (int i = 0 ; i < arr.length; i++){
                            System.out.println(arr[i].getKey()+" - "+arr[i].getValue());
                        }
                        break; //if user input a correct value, break out of the while loop
                    }
                    System.out.print("\nFrom which year you are looking for the names of the student leaders: ");
                   
                }else{
                    throw new Exception();
                }

            }
            catch (Exception e){
                System.out.print("\nInvalid Entry! Enter a valid number between 2 and 4: ");
                scan.nextLine();
            }
            
        }
        printFooter();
       }

   //when called will print the header
   public static void printHeader (){
        System.out.println("\n*******************************************************\n" +
            "Names: Felix and Catriona.\n"+
            "Student Numbers: 251167970 and 251135537\n" +
            "Goal of this project: Create a data structure that will keep a record of keys and values\n" +
            "the keys and values would be the year number and names of the student leaders in the university student council.\n"+
            "*******************************************************");
   }

   //when called will print the footer message
   public static void printFooter (){
       // prints the following when called
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
       LocalTime today = LocalTime.now();
       String timeString = today.format(formatter);
       System.out.println("\n******************************************** \n"+
                        "This is "+ timeString + " on " + java.time.LocalDate.now() +
                        ".\nCompletion of Lab Assignment 1 is successful!\n" +
                        "Good bye! Catriona Chan and Felix Zheng." +
                        "\n********************************************");
   }

}
