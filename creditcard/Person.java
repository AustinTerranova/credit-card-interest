package creditcard;
import java.util.ArrayList;
import java.util.List;

public class Person {

    List<Wallet> wallets = new ArrayList<>();
    
    public Person(int numWallets){

        for (int i = 0; i < numWallets; i++){

            wallets.add(new Wallet());

        }
    }
   
    public Wallet getWallet(int index){

        return wallets.get(index);
        
    }

}
