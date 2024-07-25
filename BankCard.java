
/**
 * Write a description of class BankCard here.
 *
 * @author (22067698 Aastha Ghimire)
 * @version (1.0.0)
 */
public class BankCard
{
    //creating attributes of BankCard
    
    private int cardId;
    private String clientName;
    private String issuerBank;
    private String bankAccount;
    private int balanceAmount;
    
    //creating constructor
    
    public BankCard (int balanceAmount , int cardId , String bankAccount , String issuerBank){
        this.clientName="";    //client name initialized to an empty string
        this.balanceAmount = balanceAmount;
        this.cardId = cardId;
        this.bankAccount = bankAccount;
        this.issuerBank = issuerBank;
    }
    
    //creating corresponding accessor method for each attribute
    
    public int getcardId(){
        return this.cardId;
    }
    public String getclientName(){
        return this.clientName;
    }
    public String getissuerBank(){
        return this.issuerBank;
    }
    public String getbankAccount(){
        return this.bankAccount;
    }
    public int getbalanceAmount(){
        return this.balanceAmount;
    }
    
    //creating new methods to set client name and balance amount
    
    public void setclientName(String clientName){
        this.clientName = clientName;
    }
    public void setbalanceAmount(int balanceAmount){
        this.balanceAmount = balanceAmount; 
    }
    
    
    //display
    
    public void display(){
        if(clientName == " "){
            System.out.println("Client name is not assigned");
            
        }
        else{
            System.out.println("cardId" + cardId);
            System.out.println("clientName" + clientName);
            System.out.println("issuerBank" + issuerBank);
            System.out.println("bankAccount" + bankAccount);
            System.out.println("balanceAmount" + balanceAmount);
        }
    }
}
