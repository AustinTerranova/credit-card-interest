package creditcard;

public class Visa implements ICreditCard{
 

   public double calcInterestRate(){

      return (balance * 0.10); 

   }
}
