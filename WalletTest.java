import creditcard.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class WalletTest {

    @Test
    public void InterestTest1() {

        int numWallets = 1;
        Person person = new Person(numWallets);
        Wallet wallet = person.getWallet(0);
      
        wallet.addCard(new Discover());
        wallet.addCard(new MC());
        wallet.addCard(new Visa());
        
        double delta = 0.001;
      
        
        assertEquals(wallet.calcInterest(0), 1.00, delta);  
        assertEquals(wallet.calcInterest(1), 5.00, delta); 
        assertEquals(wallet.calcInterest(2), 10.00, delta); 

        double total = 0.0;
        for (int i = 0; i < wallet.totalCards(); i++)
            total += wallet.calcInterest(i);
        
        assertEquals(total, 16.00, delta);
    }

    @Test
    public void InterestTest2() {

        int numWallets = 2;
        Person person = new Person(numWallets);
        Wallet wallet1 = person.getWallet(0);
        Wallet wallet2 = person.getWallet(1);
              
        wallet1.addCard(new Discover());
        wallet1.addCard(new Visa());
       
        wallet2.addCard(new MC());
      
        double delta = 0.001;
        
        assertEquals(wallet1.calcInterest(0), 1.00, delta); 
        assertEquals(wallet1.calcInterest(1), 10.00, delta); 
        
      
        assertEquals(wallet2.calcInterest(0), 5.00, delta);
      
        double total = 0.0;

        for (int i = 0; i < wallet1.totalCards(); i++)
            total += wallet1.calcInterest(i);
       
     
        assertEquals(total, 11.00, delta);

        total += wallet2.calcInterest(0);

        assertEquals(total, 16.00, delta);
    }
  
    @Test
    public void InterestTest3() {
        int numWallets = 1;
        Person person1 = new Person(numWallets);
        Person person2 = new Person(numWallets);

        Wallet wallet1 = person1.getWallet(0);
        Wallet wallet2 = person2.getWallet(0);

    
        wallet1.addCard(new MC());
        wallet1.addCard(new Visa());

        wallet2.addCard(new MC());
        wallet2.addCard(new Visa());

        double delta = 0.001, total = 0.0;

        for (int i = 0; i < wallet1.totalCards(); i++)
            total += wallet1.calcInterest(i);
       
 
        assertEquals(total, 15.00, delta);

        total = 0.0;
        for (int i = 0; i < wallet2.totalCards(); i++)
            total += wallet2.calcInterest(i);

       
        assertEquals(total, 15.00, delta);
    }
}