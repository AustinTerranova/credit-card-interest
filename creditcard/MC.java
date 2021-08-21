package creditcard;

public class MC implements ICreditCard{
    
  
   public double calcInterestRate(){

      return(balance * 0.05);
       
   }
}
