
import java.util.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalTime;  

public class Tester {
   public static void main(String[] args) {
       printHeader(); // print header
       ArrayList<Integer> yearOfStudy = new ArrayList(Arrays.asList(2,3,4,3,2,2)); //creates Array List for integers
       ArrayList<String> names = new ArrayList(Arrays.asList("Harry", "Lavender", "Ron", "Hermione", "Luna","Vincent"));//creates arrayList for names of students
       Pair[] pairing = new Pair[yearOfStudy.size()]; //Creates arrays of Pair objects
       for(int i=0; i< yearOfStudy.size();i++){ // for loop to populate the array based on year and name from array lists
           Pair<Integer, String> pair = new Pair<Integer, String>(yearOfStudy.get(i), names.get(i)); //create a pair object with the year and name from the arrayList yearOfStudy and names
           pairing[i] = pair;
        }
        Scanner scan = new Scanner(System.in); //instantiate input Scanner for keyboard
        
        int input;
        String stringInput;
        System.out.print("\nFrom which year you are looking for the names of the student leaders: "); //gets the user input for year
        while (true) {
            try {//try catch block to obtain a list of students of a specified year
                input = scan.nextInt();
                if (input >=2 && input <=4){ //determines if input is an integer within 2 and 4
                    int count=0;
                    String list=""; //a string to hold all the pair values
                    Integer keyInput = input;//changes the input for key
                    for (int i =0; i< pairing.length; i++){ //prints out the names of people in the academic year of user input
                        if (pairing[i].getKey() == keyInput){
                            count++;
                            list += (pairing[i].getValue() +"\n"); //gets the name based on the pairs that have the year value
                        }

                    }
                    System.out.printf("\nWe found %d students from year %d and here is the list:\n%s",count,input, list);//print out the list and count of students from the year
                    
                    scan.nextLine();
                    
                    System.out.print("\nDo you want to Continue (y/n):"); // asks user to continue the program
                    stringInput = scan.nextLine();
                    if (stringInput.equals("n")){//determine if input is n to break out of the loop and print the code
                            System.out.println("\nHere is the list of the class-reps....."); //prints the class reps 
                            Pair[] arr = Pair.getRep_FelixCatriona(pairing); //create an array of Pair objects of year representatives 
                            for (int i = 0 ; i < arr.length; i++){
                                System.out.println(arr[i].getKey()+" - "+arr[i].getValue()); //prints out the year and names of student representatives
                            }
                            break; //if user input a correct value, break out of the while loop
                        }
                    while (!stringInput.equals("y")){ //determine if it is a valid entry
                        System.out.print("\nInvalid Entry! Enter either y or n: ");
                        stringInput = scan.nextLine();
                        if (stringInput.equals("n")){
                                break; //if user input a correct value of "n", break out of the while loop
                            }
                    }
                    if (stringInput.equals("n")){  
                        System.out.println("\nHere is the list of the class-reps.....");//prints the class reps 
                        Pair[] arr = Pair.getRep_FelixCatriona(pairing);//create an array of Pair objects of year representatives 
                        for (int i = 0 ; i < arr.length; i++){
                            System.out.println(arr[i].getKey()+" - "+arr[i].getValue()); //prints out the year and names of student representatives
                        }
                        break; //if user input a correct value, break out of the while loop
                    }
                    System.out.print("\nFrom which year you are looking for the names of the student leaders: ");//continues asking user for names of student leaders
                   
                }else{
                    throw new Exception(); //wrong input, throw new exception for the catch block
                }

            }
            catch (Exception e){
                System.out.print("\nInvalid Entry! Enter a valid number between 2 and 4: "); //exception if integer value is incorrect
                scan.nextLine(); //clears buffer
            }
            
        }
        printFooter();//prints the footer
       }

   //when called will print the header
   public static void printHeader (){
        System.out.println("\n*******************************************************\n" +
            "Names: Felix Zheng and Catriona Chan.\n"+
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
