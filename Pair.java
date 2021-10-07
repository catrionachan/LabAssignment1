

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


}

