class Telecomm3Tester{
public static void main(String tester[]){

Telecomm3.addsimNetworks("BSNL");
Telecomm3.addsimNetworks("Airtel");
Telecomm3.addsimNetworks("Jio");
Telecomm3.addsimNetworks("Vodaphone");
Telecomm3.addsimNetworks("Idea");
Telecomm3.addsimNetworks("Bharti Airtel");
Telecomm3.addsimNetworks("Verizon");
Telecomm3.addsimNetworks("Vodaphone Idea");
//Read,get,fetch
Telecomm3.getAllsimNetworks();
System.out.println(" ");
//update,edit
Telecomm3.editsimNetworks("Reliance","Vodaphone");   
 Telecomm3.getAllsimNetworks();
 int newLength = Telecomm3.deletesimNetworks("Verizon"); 
 System.out.println("Calling getAllsimNetworksPostDeletion");
 Telecomm3.getAllsimNetworksPostDeletion(newLength);
 

}


}