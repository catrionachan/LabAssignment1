import java.util.ArrayList;

public class Pair <Y,N>{
   private Y key;
   private N value;
   public Pair (Y key, N value){ //contructor with two parameters and set initial values
           this.key = key;
           this.value = value;
   }


   public void setKey (Y key){ //update key value
       key = this.key;
   }

   public void setValue (N value){ //update value
       value = this.value;
   }

   public Y getKey(){ //obtains key value
       return key;
   }

   public N getValue(){ // obtain value
       return value;
   }

   public static <Y, N> Pair[] getRep_FelixCatriona(Pair[] pa){ //method to get the year representatives with a Pair object array passed
        //Create two array lists for the year of the representative and name using Generic object type
        ArrayList<Y> year = new ArrayList<>(); 
        ArrayList<N> name = new ArrayList<>();
        
       //add the year and name to corresponding lists from the array parameter
       for (int i = 0; i < pa.length; i ++){
           if(year.contains(pa[i].getKey()) == false){
               year.add((Y) pa[i].getKey());
               name.add((N) pa[i].getValue());
           }    
       }
       //Create Pair object based on the values stored in the Array Lists
       Pair[] repArray = new Pair[year.size()];
       for(int i=0; i< year.size(); i++){
            Pair<Y, N> pair = new Pair<>(year.get(i), name.get(i));
            repArray[i] = pair;
       }
       return repArray; //returns the Pair object array  
   }
   
}

