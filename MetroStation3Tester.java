class MetroStation3Tester{
public static void main(String tester[]){
	
MetroStation3.addstationNames("Kengeri");
MetroStation3.addstationNames("KR Puram");
MetroStation3.addstationNames("Hebbal");
MetroStation3.addstationNames("Rajanukunte");
MetroStation3.addstationNames("JP Nagar");
MetroStation3.addstationNames("Basavapura");
MetroStation3.addstationNames("Magadi Road");
MetroStation3.addstationNames("Indiranagara");
//Read,get,fetch
MetroStation3.getAllstationNames();
System.out.println(" ");
//update,edit
MetroStation3.editstationNames("Halasuru","Magadi Road");   
 MetroStation3.getAllstationNames();
 int newLength = MetroStation3.deletestationNames("Hebbal"); 
 System.out.println("Calling getAllstationNamesPostDeletion");
 MetroStation3.getAllstationNamesPostDeletion(newLength);
 

}


}