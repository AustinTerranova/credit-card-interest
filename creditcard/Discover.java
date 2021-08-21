package creditcard;

public class Discover implements ICreditCard{
  
    public double calcInterestRate(){

       return (balance * 0.01); 
       
    }
   
}
