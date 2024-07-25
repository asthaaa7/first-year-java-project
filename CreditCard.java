
/**
 * Write a description of class CreditCard here.
 *
 * @author (22067698 Aastha Ghimire)
 * @version (1.0.0)
 */
public class CreditCard extends BankCard
{
    //creating attributes
 private int cvcNumber;
 private double creditLimit;
 private double interestRate;
 private String expirationDate;
 private int gracePeriod;
 private boolean isGranted;
 //creating constructor 
 public CreditCard(int balanceAmount,int cardId,String bankAccount,String issuerBank,String clientName,int cvcNumber,double interestRate,String expirationDate){
     super(balanceAmount,cardId,bankAccount,issuerBank);
     super.setclientName(clientName);
     this.cvcNumber = cvcNumber;
     this.interestRate = interestRate;
     this.expirationDate = expirationDate;
     this.isGranted = false;
 }
 //creating a getter method for each attribute
 public int getcvcNumber(){
     return this.cvcNumber;
 }
 
 public double getcreditLimit(){
     return this.creditLimit;
 }
 
 public double getinterestRate(){
     return this.interestRate;
 }
 
 public String getexpirationDate(){
     return this.expirationDate;
 }
 
 public int getgracePeriod(){
     return this.gracePeriod;
 }
 
 public boolean getisGranted(){
     return this.isGranted;
 }
 //creating a method to set the credit limit
 public void setcreditLimit(double creditLimit, int gracePeriod){
     if (creditLimit <= 2.5 * getbalanceAmount ()) {
         this.creditLimit = creditLimit;
         this.gracePeriod = gracePeriod;
         isGranted = true;
     }
     else{
         System.out.println("Sorry!Credit Card cannot be issued.");
     }
 }
 //creating a method cancelCreditCard to remove clients credit card.
 public void cancelCreditCard(){
     if (isGranted){
         cvcNumber = 0;
         creditLimit = 0;
         gracePeriod = 0;
         isGranted = false;
     }
 }
 //creating display method
 public void display(){
     if (isGranted == true){
         super.display();
         System.out.println("CVC Number: " + cvcNumber);
         System.out.println("Credit Limit: " + creditLimit);
         System.out.println("Interest Rate: " + interestRate);
         System.out.println("Expiration Date:" + expirationDate);
         System.out.println("Grace Period:" + gracePeriod);
     }
     else{
         super.display();
         System.out.println("CVC Number: " +cvcNumber);
         System.out.println("Interest Rate: " + interestRate);
         System.out.println("Expiration Date:" + expirationDate);
     }
 }
}
