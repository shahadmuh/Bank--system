public class PlatinumClient extends Client{

public PlatinumClient(String f,String l,String account,double b){
super(f,l,account,b);}

public PlatinumClient(PlatinumClient pc){
super(pc);}

public double transferFee(String type){
String t=type.toLowerCase();
if (t.equals("local"))
return 0.0;
else
return 10.0;
}



public void displayInfo(){
System.out.println("First Name:"+fName+"\nLast Name:"+lName+"\nAccount Number:"+accountNum+"\nAccount Balance:"+balance+"\nClient Type:Platinum Client");}}
