public class Cart{
    public double total=0;
 

      public void addItem(double price,int quantity){
         if(price && quantity>0) total+=price * quantity;
               return total;
}
}


