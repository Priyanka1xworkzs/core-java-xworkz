class Karnataka2Tester{
     public static void main(String karnataka[]){
	 
     	 
	 Karnataka2.addCity("Bangalore");
	 Karnataka2.addCity("Mysore");
	 Karnataka2.addCity("Hassan");
	 Karnataka2.addCity("Kolar");
	 Karnataka2.addCity("Ramnagar");
	 Karnataka2.addCity("Mandya");
	 Karnataka2.getAllCityNames();
	 boolean isUpdated = Karnataka2.updateCityName("Bangalore","Bengaluru");  
     System.out.println("Is city name updated "+isUpdated);	 
     Karnataka2.getAllCityNames();
	 }
}