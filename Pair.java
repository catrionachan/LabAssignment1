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

   public static <Y, N> Pair[] getRep_FelixCatriona(Pair[] pa){
       ArrayList<Y> year = new ArrayList<>();
       ArrayList<N> name = new ArrayList<>();
        
       
       for (int i = 0; i < pa.length; i ++){
           if(year.contains(pa[i].getKey()) == false){
               year.add((Y) pa[i].getKey());
               name.add((N) pa[i].getValue());
           }    
       }
       Pair[] repArray = new Pair[year.size()];
       for(int i=0; i< year.size(); i++){
            Pair<Y, N> pair = new Pair<>(year.get(i), name.get(i));
            repArray[i] = pair;
       }
       return repArray;
   }
   
}

