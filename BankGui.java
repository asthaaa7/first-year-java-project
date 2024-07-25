
/**
 * Write a description of class BankGui here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.Color;

public class BankGui implements ActionListener
{

    //declaring all the components

    private JFrame frame;
    private ArrayList<BankCard> cards;


    //dec debit card components
    private JLabel bankLabel, DebitLabel, debclientNameLabel,debcardIdLabel,debbalanceAmountLabel,debbankAccountLabel,debissuerBankLabel,debpinNumberLabel,debwithdrawalAmountLabel,debdateOfWithdrawalLabel;

    private JTextField debclientNameText,debcardIdText,debbalanceAmountText,debbankAccountText,debissuerBankText,debpinNumberText,debwithdrawalAmountText;

    private JButton debaddButton, Withdraw, Clear, Display1;

    private JComboBox debdayCombo,debmonthCombo,debyearCombo;

    //dec credit card
    private JLabel credclientNameLabel,credcardIdLabel,credbalanceAmountLabel,credbankAccountLabel,credcvcNumberLabel,credinterestRateLabel,credexpirationDateLabel, graceperiodLabel,creditlimitLabel;
    
    private JTextField credclientNameText,credcardIdText,credbalanceAmountText,credbankAccountText, credissuerBankText,credcvcNumberText,credinterestRateText, graceperiodText,creditlimitText;

    private JComboBox expDayCombo,expMonthCombo,expYearCombo;

    private JButton AddCredit,SetCreditLimit,CancelCreditCard,Display2;

    ArrayList <BankCard> BankCardarray = new ArrayList<BankCard>();

    DebitCard obj1;
    CreditCard obj2;

    public BankGui(){
        //creating JF
        String Month [] = {"jan","feb","march","april","june","july","august","september","october","november","december"};
        String Day [] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        String Year []  = {"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024"};

        //creating debit card gui
        //step 1:

        frame = new JFrame("Bank Card");

        JLabel bankLabel = new JLabel("Bank Card");

        JLabel DebitLabel = new JLabel("Debit Card");

        debclientNameText = new JTextField();
        JLabel debclientNameLabel = new JLabel("Client Name");

        debcardIdText = new JTextField();
        JLabel debcardIdLabel = new JLabel("Card ID");

        debbalanceAmountText = new JTextField();
        JLabel debbalanceAmountLabel = new JLabel("Balance Amount");

        debbankAccountText = new JTextField();
        JLabel debbankAccountLabel = new JLabel("Bank Account");

        debissuerBankText = new JTextField();
        JLabel debissuerBankLabel = new JLabel("IssuerBank");

        debpinNumberText = new JTextField();
        JLabel debpinNumberLabel = new JLabel("PIN Number");

        debaddButton = new JButton("Add Debit Card");

        debwithdrawalAmountText = new JTextField();
        JLabel debwithdrawalAmountLabel = new JLabel("Withdraw Amount");

        JLabel debdateOfWithdrawalLabel = new JLabel("Date Of withdrawal");
        debdayCombo = new JComboBox(Day);
        debmonthCombo = new JComboBox(Month);
        debyearCombo = new JComboBox(Year);

        Withdraw = new JButton ("Withdraw");
        Clear = new JButton("Clear");
        Display1 = new JButton("Display");

        //Step 2: setting the bounds
        bankLabel.setBounds(416, 0, 147, 56);
        DebitLabel.setBounds(186, 87, 84, 34);
        debclientNameLabel.setBounds(77, 155, 84, 34);
        debclientNameText.setBounds(216, 155, 180, 32);
        debcardIdText.setBounds(216,212,180,32);
        debcardIdLabel.setBounds(77, 212, 84, 34);
        debbalanceAmountText.setBounds(216, 269, 180, 32);
        debbalanceAmountLabel.setBounds(77, 263, 104, 34);
        debbankAccountText.setBounds(216, 326, 180, 32);
        debbankAccountLabel.setBounds(77, 322, 92, 30);
        debissuerBankText.setBounds(216, 383, 180, 32);
        debissuerBankLabel.setBounds(77, 383, 84, 34);
        debpinNumberText.setBounds(216, 444, 180, 32);
        debpinNumberLabel.setBounds(77, 444, 84, 34);
        debaddButton.setBounds(156, 507, 120, 32);
        debwithdrawalAmountText.setBounds(223, 570, 180, 32);
        debwithdrawalAmountLabel.setBounds(77, 568, 132, 27);
        debdateOfWithdrawalLabel.setBounds(77, 624, 132, 27);
        debdayCombo.setBounds(223, 624, 72, 38);
        debmonthCombo.setBounds(313, 624, 72, 38);
        debyearCombo.setBounds(403, 624, 72, 38);
        Withdraw.setBounds(77, 680, 120, 32);
        Clear.setBounds(445, 743, 120, 31);
        Display1.setBounds(253, 680, 120, 32);

        //add

        frame.add(bankLabel);
        frame.add(DebitLabel);
        frame.add(debclientNameLabel);
        frame.add(debclientNameText);
        frame.add(debcardIdText);
        frame.add(debcardIdLabel);
        frame.add(debbalanceAmountText);
        frame.add(debbalanceAmountLabel);
        frame.add(debbankAccountText);
        frame.add(debbankAccountLabel);
        frame.add(debissuerBankText);
        frame.add(debissuerBankLabel);
        frame.add(debpinNumberText);
        frame.add(debpinNumberLabel);
        frame.add(debaddButton);
        frame.add(debwithdrawalAmountText);
        frame.add(debwithdrawalAmountLabel);
        frame.add(debdateOfWithdrawalLabel);
        frame.add(debdayCombo);
        frame.add(debmonthCombo);
        frame.add(debyearCombo);
        frame.add(Withdraw);
        frame.add(Clear);
        frame.add(Display1);

        debaddButton.addActionListener(this);
        Withdraw.addActionListener(this);
        Clear.addActionListener(this);
        Display1.addActionListener(this);
        //credit card

        JLabel CreditLabel = new JLabel("Credit Card");

        credclientNameText = new JTextField();
        JLabel credclientNameLabel = new JLabel("Client Name");

        credcardIdText = new JTextField();
        JLabel credcardIdLabel = new JLabel("Card ID");

        credbalanceAmountText = new JTextField();
        JLabel credbalanceAmountLabel = new JLabel("Balance Amount");

        credbankAccountText = new JTextField();
        JLabel credbankAccountLabel = new JLabel("Bank Account");

        credissuerBankText = new JTextField();
        JLabel credissuerBankLabel = new JLabel("Issuer Bank");

        credcvcNumberText = new JTextField();
        JLabel credcvcNumberLabel = new JLabel("CVC Number");

        credinterestRateText = new JTextField();
        JLabel credinterestRateLabel = new JLabel("Interest Rate");
        
        graceperiodText = new JTextField();
        JLabel graceperiodLabel = new JLabel("Grace Period");
        
        creditlimitText = new JTextField();
        JLabel creditlimitLabel = new JLabel("Credit Limit");
        

        JLabel credexpirationDateLabel = new JLabel("Expiration Date");
        expDayCombo = new JComboBox(Day);
        expMonthCombo = new JComboBox(Month);
        expYearCombo = new JComboBox(Year);

        AddCredit = new JButton("Add Credit");
        SetCreditLimit = new JButton("Set Credit Limit");
        CancelCreditCard = new JButton("Cancel Credit Card");
        Display2 = new JButton("Display");

        //set

        CreditLabel.setBounds(698, 82, 84, 34);
        credclientNameText.setBounds(736, 144, 180, 32);
        credclientNameLabel.setBounds(614, 144, 84, 34);
        credcardIdText.setBounds(736, 194, 180, 32);
        credcardIdLabel.setBounds(614, 194, 84, 34);
        credbalanceAmountText.setBounds(736, 244, 180, 32);
        credbalanceAmountLabel.setBounds(614, 244, 104, 34);
        credbankAccountText.setBounds(736, 294, 180, 32);
        credbankAccountLabel.setBounds(614, 294, 92, 30);
        credissuerBankText.setBounds(736, 344, 180, 32);
        credissuerBankLabel.setBounds(614, 340, 84, 34);
        credcvcNumberText.setBounds(736, 394, 180, 32);
        credcvcNumberLabel.setBounds(614, 390, 84, 34);
        credinterestRateText.setBounds(736, 444, 180, 32);
        credinterestRateLabel.setBounds(614, 440, 84, 34);
        graceperiodLabel.setBounds(614, 540, 84, 34);
        graceperiodText.setBounds(736, 544, 180, 32);
        creditlimitLabel.setBounds(614, 490, 84, 34);
        creditlimitText.setBounds(736, 494, 180, 32);
        credexpirationDateLabel.setBounds(614, 608, 104, 34);
        expDayCombo.setBounds(730, 608, 72, 38);
        expMonthCombo.setBounds(826, 608, 72, 38);
        expYearCombo.setBounds(922, 608, 72, 38);
        AddCredit.setBounds(722, 666, 120, 32);
        SetCreditLimit.setBounds(586, 666, 120, 32);
        CancelCreditCard.setBounds(858, 666, 120, 32);
        Display2.setBounds(722, 718, 120, 32);

        //add

        frame.add(CreditLabel);
        frame.add(credclientNameText);
        frame.add(credclientNameLabel);
        frame.add(credcardIdText);
        frame.add(credcardIdLabel);
        frame.add(credbalanceAmountText);
        frame.add(credbalanceAmountLabel);
        frame.add(credbankAccountText);
        frame.add(credbankAccountLabel);
        frame.add(credissuerBankText);
        frame.add(credissuerBankLabel);
        frame.add(credcvcNumberText);
        frame.add(credcvcNumberLabel);
        frame.add(credinterestRateText);
        frame.add(credinterestRateLabel);
        frame.add(credexpirationDateLabel);
        frame.add(graceperiodLabel);
        frame.add(graceperiodText);
        frame.add(creditlimitLabel);
        frame.add(creditlimitText);
        frame.add(expDayCombo);
        frame.add(expMonthCombo);
        frame.add(expYearCombo);
        frame.add(AddCredit);
        frame.add(SetCreditLimit);
        frame.add(CancelCreditCard);
        frame.add(Display2);

        AddCredit.addActionListener(this);
        SetCreditLimit.addActionListener(this);
        CancelCreditCard.addActionListener(this);
        Display2.addActionListener(this);

        
        frame.setSize(1010, 850);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        Color color=new Color(175, 169, 209);
        frame.getContentPane().setBackground(color);

    }



    //implement the method

    //action listener

    public void actionPerformed (ActionEvent e){
        if(e.getSource() == debaddButton){
            if(debclientNameText.getText().isEmpty() ||
            debcardIdText.getText().isEmpty() ||
            debissuerBankText.getText().isEmpty()||
            debbankAccountText.getText().isEmpty() ||
            debpinNumberText.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Please fill the details.");
            }
            else{
                try{
                    int cardid = Integer.parseInt(debcardIdText.getText());
                    String clientName = debclientNameText.getText();
                    int balanceAmount = Integer.parseInt(debbalanceAmountText.getText());
                    String bankAccount = debbankAccountText.getText();
                    String issuerBank = debissuerBankText.getText();
                    int pinNumber = Integer.parseInt(debpinNumberText.getText());
                    
                    String balance = String.valueOf(balanceAmount);
                    String card = String.valueOf(cardid);
                    String pin = String.valueOf(pinNumber);
                    
                    String sumValues = "Balance Amount: " + balance + "\nCardID: " + card + "\nIssuer Bank: " + issuerBank + "\nBank account: " + bankAccount + "\nClient Name: " + clientName + "\nPin Number" + pinNumber;
                    obj1 = new DebitCard(balanceAmount, cardid, bankAccount, issuerBank, clientName, pinNumber);
                    
                    boolean iscardIdUnique = true;
                    for(BankCard obj1 : BankCardarray)
                    {
                        if(obj1 instanceof DebitCard){
                            DebitCard dc_obj = (DebitCard) obj1;
                            if(obj1.getcardId() == cardid){
                                iscardIdUnique = false;
                                break;
                            }
                        }
                    }
                    if(iscardIdUnique){
                        BankCardarray.add(obj1);
                        JOptionPane.showMessageDialog(null, "Debit Card succefully added! \n" +sumValues);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "This ID already exist.");
                    }
                }
                catch(NumberFormatException nfe)
                {
                  JOptionPane.showMessageDialog(null, "Something went wrong. Please try to put correct information.");  
                }
            }
        }
        
        if(e.getSource() == Withdraw){
            int cardId = Integer.parseInt(debcardIdText.getText());
            int withdrawalAmount = Integer.parseInt(debwithdrawalAmountText.getText());
            String day = (String) debdayCombo.getSelectedItem();
            String month = (String) debmonthCombo.getSelectedItem();
            String year = (String) debyearCombo.getSelectedItem();
            String withdrawalDate = day + "_" + month + "_" + year;
            int pinNumber = Integer.parseInt(debpinNumberText.getText());
            
            boolean isCardidvalid = false;
            for(BankCard b_card : BankCardarray){
                if(b_card instanceof DebitCard){
                    DebitCard d_card = (DebitCard) b_card;
                    if(d_card.getcardId() == cardId){
                        d_card.withdraw(withdrawalAmount, withdrawalDate, pinNumber);
                        isCardidvalid = true;
                        break;
                    }
                }
            }
            if (isCardidvalid){
                JOptionPane.showMessageDialog(null, "Withdraw done successfully!");
            }else{
                JOptionPane.showMessageDialog(null, "Inavlid Card Id!");
            }
        }
        
        if(e.getSource() == AddCredit){
            if(credcardIdText.getText().isEmpty() ||
            credclientNameText.getText().isEmpty() ||
            credissuerBankText.getText().isEmpty() ||
            credbankAccountText.getText().isEmpty() ||
            credcvcNumberText.getText().isEmpty() ||
            credinterestRateText.getText().isEmpty())
            {
                JOptionPane. showMessageDialog(null, "Please fill all thje details.Thank You!");
            }
            else{
                try{
                    int cardId = Integer.parseInt(credcardIdText.getText());
                    String clientName = credclientNameText.getText();
                    String issuerbank = credissuerBankText.getText();
                    int CVCnumber = Integer.parseInt(credcvcNumberText.getText());
                    double interestRate = Double.parseDouble(credinterestRateText.getText());
                    String bankAccount = credbankAccountText.getText();
                    int balanceAmount = Integer.parseInt(credbalanceAmountText.getText());
                    
                    String InterestRate = String.valueOf(interestRate);
                    String card = String.valueOf(cardId);
                    String CVC = String.valueOf(CVCnumber);
                    String balance = String.valueOf(balanceAmount);
                    
                    String year = (String) expYearCombo.getSelectedItem();
                    String month = (String) expMonthCombo.getSelectedItem();
                    String day = (String) expDayCombo.getSelectedItem();
                    
                    String expirationDate = day + "_" + month + "_" + year;
                    String sumValues1 = "Card Id : " + card + "\nClient Name :" + clientName + "\n Balance Amount" + balance + "\n Issuer Bank :" + issuerbank + "\n CVC number" + CVC + "\nInterest Rate"+ InterestRate;
                    obj2 = new CreditCard(balanceAmount, cardId, bankAccount, issuerbank, clientName, CVCnumber, interestRate, expirationDate );
                    
                    boolean isCcardIdexists = true;
                    for(BankCard obj2 : BankCardarray)
                    {
                        if(obj2 instanceof CreditCard){
                            CreditCard cc_obj = (CreditCard) obj2;
                            if(obj2.getcardId() == cardId)
                            {
                                isCcardIdexists = false;
                                break;
                            }
                        }
                    }
                    
                    if(isCcardIdexists)
                    {
                        BankCardarray.add(obj2);
                        JOptionPane.showMessageDialog(null, "Credit Card successfully added! \n" +sumValues1);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "This Id already exists");
                    }
                }
                catch(NumberFormatException nfe){
                    JOptionPane.showMessageDialog(null, "Something went wrong. Please try again.");
                }
            }
        }
        
        if(e.getSource() == Clear){
            debclientNameText.setText("");
            debcardIdText.setText("");
            debbalanceAmountText.setText("");
            debbankAccountText.setText("");
            debissuerBankText.setText("");
            debpinNumberText.setText("");
            debwithdrawalAmountText.setText("");
            credclientNameText.setText("");
            credcardIdText.setText("");
            credbalanceAmountText.setText("");
            credbankAccountText.setText("");
            credissuerBankText.setText("");
            credcvcNumberText.setText("");
            credinterestRateText.setText("");
            graceperiodText.setText("");
            creditlimitText.setText("");
        }
        
        if(e.getSource() == SetCreditLimit){
            if(credcardIdText.getText().isEmpty() ||
            credclientNameText.getText().isEmpty() ||
            credissuerBankText.getText().isEmpty() ||
            credbankAccountText.getText().isEmpty() ||
            credcvcNumberText.getText().isEmpty() ||
            credinterestRateText.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Please fill all the details.");
            }
            else{
                try{
                    int ccardID = Integer.parseInt(credcardIdText.getText());
                    double ccreditlimit = Double.parseDouble(creditlimitText.getText());
                    int cgraceperiod = Integer.parseInt(graceperiodText.getText());
                    
                    boolean iscardIdEqual = false;
                    for(BankCard obj2 : BankCardarray){
                        if (obj2 instanceof CreditCard) {
                            CreditCard obj = (CreditCard) obj2;
                            if(obj.getcardId() == ccardID){
                                if(ccreditlimit <= obj.getbalanceAmount()*2.5){
                                    obj.setcreditLimit(ccreditlimit, cgraceperiod);
                                    iscardIdEqual = true;
                                    JOptionPane.showMessageDialog(null, "Credit limit set successfully!");
                                    break;
                                }
                                else{
                                    JOptionPane.showMessageDialog(null, "Credit limit must be less or equal to balance amount. Please try again.");
                                    break;
                                }
                            }

                        }
                        if(!iscardIdEqual){
                            JOptionPane.showMessageDialog(null, "Invalid Card ID! Please try again.");
                        }
                    }
                }
                catch(NumberFormatException nfe){
                    JOptionPane.showMessageDialog(null, "Something went wrong. Please try again.");
                }
            }
        }
        
        if(e.getSource() == CancelCreditCard){
            if(credcardIdText.getText().isEmpty() ||
            credclientNameText.getText().isEmpty() ||
            credissuerBankText.getText().isEmpty() ||
            credbankAccountText.getText().isEmpty() ||
            credcvcNumberText.getText().isEmpty() ||
            credinterestRateText.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Please enter all the details");
            }
            else{
                try{
                    int cardId = Integer.parseInt(credcardIdText.getText());
                    double ccreditlimit = Double.parseDouble(creditlimitText.getText());
                    int cgraceperiod = Integer.parseInt(graceperiodText.getText());
                    
                    boolean iscardIdEqual = false;
                    for(BankCard Credit : BankCardarray){
                        if(Credit instanceof CreditCard){
                            CreditCard o_c = (CreditCard) Credit;
                            if(o_c.getcardId() == cardId){
                                o_c.cancelCreditCard();
                                iscardIdEqual = true;
                                JOptionPane.showMessageDialog(null, "Credit Cancelled successfully." , "Message", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "Invalid card ID. Please try again.");
                        }
                        
                    }
                }
                catch(NumberFormatException nfe){
                    JOptionPane.showMessageDialog(null, "Something went wrong please try again.");
                }
            }
        }
        
        if(e.getSource() == Display1){
            if(debclientNameText.getText().isEmpty() ||
            debcardIdText.getText().isEmpty() ||
            debissuerBankText.getText().isEmpty()||
            debbankAccountText.getText().isEmpty() ||
            debpinNumberText.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Please fill the details.");
            }else{
                try{
                    int balanceamount = Integer.parseInt(debbalanceAmountText.getText());
                    int cardid = Integer.parseInt(debcardIdText.getText());
                    String issuerbank = debissuerBankText.getText();
                    String bankaccount = debbankAccountText.getText();
                    String clientname = debclientNameText.getText();
                    int pinnumber = Integer.parseInt(debpinNumberText.getText());
                    
                    String Balance = String.valueOf(balanceamount);
                    String Card = String.valueOf(cardid);
                    String Pin = String.valueOf(pinnumber);
                    
                    String SumValues = "Balance Amount :" + Balance + "\nCard ID :" + Card + "\nIssuer Bank" + issuerbank + "\nBank Account" + bankaccount + "\nClientName :" + clientname + "\nPin Number" +Pin;
                    obj1 = new DebitCard(balanceamount, cardid, bankaccount, issuerbank, clientname, pinnumber);
                    
                    for(BankCard obj1 : BankCardarray){
                        if(obj1 instanceof DebitCard){
                            DebitCard d_display = (DebitCard) obj1;
                            d_display.display();
                        }
                    }
                }
                catch(NumberFormatException nfe){
                    JOptionPane.showMessageDialog(null, "Something went wrong. Please try again.");
                }
            }
        }
        
        if(e.getSource() == Display2){
            if(credcardIdText.getText().isEmpty() ||
            credclientNameText.getText().isEmpty() ||
            credissuerBankText.getText().isEmpty() ||
            credbankAccountText.getText().isEmpty() ||
            credcvcNumberText.getText().isEmpty() ||
            credinterestRateText.getText().isEmpty())
            {
                JOptionPane. showMessageDialog(null, "Please fill all the details.Thank You!");
            }else{
                try{
                    int cardId = Integer.parseInt(credcardIdText.getText());
                    String clientName = credclientNameText.getText();
                    String issuerbank = credissuerBankText.getText();
                    int CVCnumber = Integer.parseInt(credcvcNumberText.getText());
                    double interestRate = Double.parseDouble(credinterestRateText.getText());
                    String bankAccount = credbankAccountText.getText();
                    int balanceAmount = Integer.parseInt(credbalanceAmountText.getText());
                    
                    String InterestRate = String.valueOf(interestRate);
                    String card = String.valueOf(cardId);
                    String CVC = String.valueOf(CVCnumber);
                    String balance = String.valueOf(balanceAmount);
                    
                    String year = (String) expYearCombo.getSelectedItem();
                    String month = (String) expMonthCombo.getSelectedItem();
                    String day = (String) expDayCombo.getSelectedItem();
                    
                    String expirationDate = expDayCombo + "_" + expMonthCombo + "_" + expYearCombo;
                    String sumValues1 = "Card Id : " + card + "\nClient Name :" + clientName + "\n Balance Amount" + balance + "\n Issuer Bank :" + issuerbank + "\n CVC number" + CVC + "\nInterest Rate"+ InterestRate;
                    obj2 = new CreditCard(balanceAmount, cardId, bankAccount, issuerbank, clientName, CVCnumber, interestRate, expirationDate );
                    
                    for(BankCard obj2 : BankCardarray){
                        if(obj2 instanceof CreditCard){
                            CreditCard c_display = (CreditCard) obj2;
                            c_display.display();
                        }
                    }
                }
                catch(NumberFormatException nfe){
                    JOptionPane.showMessageDialog(null, "Something went wrong. Please try again.");
                }
            }
        }
        
        
    }
    
    public static void main(String[] args){
        BankGui obj = new BankGui();
    }
}
