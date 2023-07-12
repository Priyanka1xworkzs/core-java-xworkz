class Karnataka2{

 //array has limitation - size id fixed(drawback)
 static String cityNames[] = {null,null,null,null,null};  
 static int index;
 public static boolean addCity(String city){   //save, create, add 
	 boolean isAdded = false;
	 //validate cityName  //checks city is not null and should not be empty and to 
	 if(cityNames.length>index){  //to avoid exception and code shouldnot brk inbetween, as array has fixed limit size
	 if(city!=null && city.length()>0){    
		 cityNames[index]=city;
		 index++;
		 isAdded=true;
		 System.out.println("City added "+isAdded);
	 }else{
		 System.out.println("City name cannot be null");
	 }
	 }else{
		 System.out.println("Size is full,cannot add the value");
	 }
	 return isAdded;
 }

 public static void getAllCityNames(){ 
	 for(int cities=0;cities<cityNames.length;cities++){
		 String reference = cityNames[cities];
		 System.out.println("Accessing the city " + reference + " is "+cities);
	 }
 }
 
 public static boolean updateCityName(String existingCityName, String updatedCityName){
	 boolean isUpdated = false;
	 for(int cityIndex=0;cityIndex<cityNames.length;cityIndex++){
		 if(cityNames[cityIndex].equals(existingCityName)){    //.equals is used to compare
			 cityNames[cityIndex] = updatedCityName;
			 isUpdated = true;
		 } 
	 }
	 return isUpdated;
 }

}