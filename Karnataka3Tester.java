class Karnataka3Tester{
public static void main(String test[]){
Karnataka3.saveCityNames("Bangalore");
Karnataka3.saveCityNames("Udupi");
Karnataka3.saveCityNames("Kolar");
Karnataka3.saveCityNames("Mandya");
Karnataka3.saveCityNames("Chikmagalur");
Karnataka3.saveCityNames("Bidar");
Karnataka3.saveCityNames("Bangalore");
Karnataka3.getAllCityNames();

boolean isUpdated = Karnataka3.updateCityName("Bangalore","Bengaluru");  
     System.out.println("Is city name updated "+isUpdated);	 
     Karnataka.getAllCityNames();
	 
	 int newLength = Karnataka3.deleteCity("Udupi");
System.out.println("Calling all cityNames");

Karnataka3.getAllCityNamesPostDeletion(newLength);

}
}