public class StandardClient extends Client{

public StandardClient(String f,String l,String account,double b){
super(f,l,account,b);}

public StandardClient(StandardClient sc){
super(sc);}

public double transferFee(String type){
String t=type.toLowerCase();
if (t.equals("local"))
return 7.0;
else
return 50.0;}



public void displayInfo(){
System.out.println("First Name:"+fName+"\nLast Name:"+lName+"\nAccount Number:"+accountNum+"\nAccount Balance:"+balance+"\nClient type:Standard Client");}}