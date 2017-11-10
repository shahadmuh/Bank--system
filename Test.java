//shahad almuhizi
//436201525
import java.util.*;
public class Test {
static Scanner console=new Scanner (System.in);
public static void main (String[] args){

SaudiBank SB=new SaudiBank("Riyadh",50);
char choice;
String fname,lname,acc,account,type;
double bal,transfer,balance=0;
int num=0,numStand=0,numPlat=0;

do {
System.out.println("Choose from the following menu:\na)Add a new client.");
System.out.println("b)Display the number of the Standard Clients and the Platinum Clients.");
System.out.println("c)Display the balance of all Platinum Clients accounts.");
System.out.println("d)Display the transfer fee for a client.");
System.out.println("e)Display all the information of the SB Company.");
System.out.println("f)To exit the program.");
choice=console.next().charAt(0);
choice=Character.toLowerCase(choice);

switch (choice){

case 'a':
System.out.println("Enter the client first and last name, account number, and account balance:");
fname=console.next();
lname=console.next();
acc=console.next();
bal=console.nextDouble();
System.out.println("Choose 1) to add a Standard Client, or 2) to add a Platinum Client");
num=console.nextInt();
if (num==1){
Client stand=new StandardClient(fname,lname,acc,bal);
if (SB.addClient(stand))
System.out.println("The standard Client has been added successfully");
else
System.out.println("The standard Client has Not been added successfully");
System.out.println();}

if (num==2){
Client plat=new PlatinumClient(fname,lname,acc,bal);
if (SB.addClient(plat))
System.out.println("The platinum Client has been added successfully");
else
System.out.println("The platinum Client has Not been added successfully");}
System.out.println();
break;



case 'b':{
for (int i=0;i<SB.getNumOfClients();i++){
if (SB.getClients()[i] instanceof StandardClient)
numStand++;
if (SB.getClients()[i] instanceof PlatinumClient)
numPlat++;}
System.out.println("The number of Standard clients is: "+numStand);

System.out.println("The number of Platinum Clients is: "+numPlat);
System.out.println();
break;}



case 'c':
for (int i=0;i<SB.getNumOfClients();i++)
if (SB.getClients()[i] instanceof PlatinumClient)
balance+=((Client)SB.getClients()[i]).getBalance();
System.out.println("Total balance of all platinum clients: "+balance);
System.out.println();
break;


case 'd':
System.out.println("Enetr the account number of the client that you want to check his/her transfer fee: ");
account=console.next();
System.out.println("Enetr the type of transfer {local or global}: ");
type=console.next();
for (int s=0;s<SB.getNumOfClients();s++)
if (((Client)SB.getClients()[s]).getAccNum().equals(account)){
transfer=((Client)SB.getClients()[s]).transferFee(type);
System.out.println("The transfer fee is:"+transfer);}
System.out.println();
break;



case 'e':
SB.print();
break;
}


}while(choice!='f');
}}
