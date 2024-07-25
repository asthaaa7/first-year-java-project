
/**
 * Write a description of class DebitCard here.
 *
 * @author (22067698 Aastha Ghimire)
 * @version (1.0.0)
 */
public class DebitCard extends BankCard
{
    //creating attributes of DebitCard
    
    private int pinNumber;
    private int withdrawalAmount;
    private String dateOfWithdrawal;
    private boolean hasWithdrawn;
    
    //creating constructor accepting six parameters
    public DebitCard(int balanceAmount,int cardId,String bankAccount,String issuerBank,String clientName,int pinNumber){
            //making a call to the superclass constructor with four parameters

        super(balanceAmount,cardId,bankAccount,issuerBank);
        setclientName(clientName);
        this.pinNumber = pinNumber;
        this.hasWithdrawn = false;
    }
    //CREATING MUTATOR METHOD OF withdrawalAmount
    public void setwithdrawalAmount(int withdrawalAmount){
        this.withdrawalAmount = withdrawalAmount;
    }
    //creating an accessor method for each attribute
   public int getpinNumber(){
       return this.pinNumber;
   }
   
   public int getwithdrawalAmount(){
       return this.withdrawalAmount;
   }
   public String getdateOfWithdrawal(){
       return this.dateOfWithdrawal;
   }
    
   public boolean gethasWithdrawn(){
       return this.hasWithdrawn;
   }
    //creating a method withdraw 
    public void withdraw(int withdrawalAmount,String dateOfWithdrawal,int pinNumber){
        if (this.pinNumber == pinNumber && super.getbalanceAmount() >= withdrawalAmount){
            //reducing the money from client's account
            super.setbalanceAmount(super.getbalanceAmount() - withdrawalAmount);
            this.dateOfWithdrawal = dateOfWithdrawal;
            this.hasWithdrawn = true;
            System.out.println("Withdrawal successful!");
            System.out.println("Total balance: " + super.getbalanceAmount());
            
        }
        else if(this.pinNumber != pinNumber){
            System.out.println("Sorry withdrawal unsucessful.Invalid PIN number.");
        }
        else{
            System.out.println("Sorry withdrawal unsuccessful.Insufficient balance amount.");
        }
    }
    
    //creating display method
    public void display(){
        super.display();
        System.out.println("Pin number: " + pinNumber);
        if(hasWithdrawn == true){
            System.out.println("Withdrawal amount: " + withdrawalAmount);
            System.out.println("Date of withdrawal: " +dateOfWithdrawal);
        }
        else{
            System.out.println("Withdrawal hasn't been made yet. ");
        }
    }
    
    
}
