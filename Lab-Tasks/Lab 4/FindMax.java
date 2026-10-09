public class FindMax{
 
     public int MaxInt(int num1, int num2){
        int result=0;
       
         if(num1>num2)
            result=num1; 
         else if(num2>num1)
            result=num2;
         return result;
}


     public double MaxDouble(double num1, double num2){
         double result=0;
  
          if(num1>num2)
            result=num1; 
         else if(num2>num1)
            result=num2;
         return result;
}

     public String MaxString(String num1, String num2){
         String result="";

         if(num1.compareTo(num2)>0)
            result=num1;
         else if(num2.compareTo(num1)>0)
            result=num2;
         return result;

}
}

