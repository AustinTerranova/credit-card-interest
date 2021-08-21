package creditcard;

import java.util.ArrayList;
import java.util.List;

public class Wallet  {

    private List<ICreditCard> creditCards = new ArrayList<>();
    
    public void addCard(ICreditCard creditCard){ 

        creditCards.add(creditCard); 

    }
        
    public double calcInterest(int index){

        return creditCards.get(index).calcInterestRate(); 

    }

    public int totalCards(){

        return creditCards.size();
        
    }
}
