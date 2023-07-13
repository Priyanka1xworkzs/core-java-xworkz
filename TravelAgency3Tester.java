class TravelAgency3Tester{
public static void main(String tester[]){
	//create,save,add
TravelAgency3.addtouristPlaces("Mysore");
TravelAgency3.addtouristPlaces("Udupi");
TravelAgency3.addtouristPlaces("Gokarna");
TravelAgency3.addtouristPlaces("Delhi");
TravelAgency3.addtouristPlaces("Hassan");
TravelAgency3.addtouristPlaces("Chikmangaluru");
TravelAgency3.addtouristPlaces("Murudeswara");
TravelAgency3.addtouristPlaces("Chamrajpete");
//Read,get,fetch
TravelAgency3.getAlltouristPlaces();
System.out.println(" ");
//update,edit
TravelAgency3.edittouristPlaces("Pondicherry","Delhi");   
 TravelAgency3.getAlltouristPlaces();
 int newLength = TravelAgency3.deletetouristPlaces("Chikmangaluru"); 
 System.out.println("Calling getAlltouristPlacesPostDeletion");
 TravelAgency3.getAlltouristPlacesPostDeletion(newLength);
 

}


}