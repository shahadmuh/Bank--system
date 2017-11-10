public class SaudiBank {
private String location;
private int numOfClients;
private Account[] clients;
public SaudiBank(String loc,int size){
location=loc;
numOfClients=0;
clients=new Account[size];}

public boolean addClient(Client c){
if (numOfClients<clients.length){
if (c instanceof StandardClient)
clients[numOfClients++]=new StandardClient((StandardClient) c);
if (c instanceof PlatinumClient)
clients[numOfClients++]=new PlatinumClient((PlatinumClient) c);
return true;}
else
return false;}

public int getNumOfClients(){
return numOfClients;}

public Account[] getClients(){
return clients;}

public void print(){

System.out.println("SaudiBank Location:"+location+"\nNumber of clients:"+numOfClients+"\nClients Information:");

for (int i=0;i<numOfClients;i++){
System.out.println("\nClient Information:");
((Client)clients[i]).displayInfo();
System.out.println(); 
}


}}