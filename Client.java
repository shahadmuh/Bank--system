public abstract class Client implements Account{

protected String fName;
protected String lName;
protected String accountNum;
protected double balance;

public Client(String f,String l,String account,double b){
fName=f;
lName=l;
accountNum=account;
balance=b;}


public Client(Client c){
fName=c.fName;
lName=c.lName;
accountNum=c.accountNum;
balance=c.balance;

}

public String getAccNum(){
return accountNum;}

public double getBalance(){
return balance;}


public abstract double transferFee(String type);



public abstract void displayInfo();}
