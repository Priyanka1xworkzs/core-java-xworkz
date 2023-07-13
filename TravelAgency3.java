class TravelAgency3{

static String touristPlaces[]={"Mysore",null,null,null,null,null,null,null};
 static int index=0;

public static boolean addtouristPlaces(String touristPlace){
System.out.println("Invoking addtouristPlaces");
System.out.println("No of parametrs : 1,type is String");
boolean isAdded = false;
if(touristPlaces.length>index){
if(touristPlace!=null && touristPlace.length()>0){

 touristPlaces[index++] = touristPlace;
 isAdded = true;

 }else{
 System.out.println("ohh..Elli touristPlaces thumba ede");
 
 }
}else{
System.out.println("touristPlace cannot be null");
}
return isAdded;

}
public static void getAlltouristPlaces(){
	System.out.println("List of touristPlaces are:");
	for(String touristPlace : touristPlaces){
		System.out.println(touristPlace);
	}

}
public static boolean edittouristPlaces(String updatedtouristPlace,String existingtouristPlace){
	System.out.println("Invoking edittouristPlaces");
System.out.println("No of Parameters : 2,type of parameter:String,String");
boolean isUpdated = false;
for(int touristIndex = 0; touristIndex < touristPlaces.length; touristIndex++){
	if(touristPlaces[touristIndex].equals(existingtouristPlace)){   	
	        touristPlaces[touristIndex] = updatedtouristPlace;			
             isUpdated = true;	
}
}
return isUpdated;
}
public static int deletetouristPlaces(String deletedtouristPlace){  
	System.out.println("Invoking edittouristPlaces");
System.out.println("No of Parameters : 2,type of parameter:String,String");
boolean isDeleted = false;
int touristsIndex;
int noOfElements = touristPlaces.length;
for( touristsIndex = 0; touristsIndex < touristPlaces.length; touristsIndex++){
	if(touristPlaces[touristsIndex].equals(deletedtouristPlace)){   
	       break;
	}
}                                                                   	
  if(touristsIndex<noOfElements){
	   noOfElements =  noOfElements-1;
	   for(int newtouristIndex = touristsIndex; newtouristIndex<noOfElements; newtouristIndex++){
		   touristPlaces[newtouristIndex] = touristPlaces[newtouristIndex+1];
	   }
  }
  return noOfElements;
 	  
}
public static void getAlltouristPlacesPostDeletion(int newLength){
	for(int touristIndex =0;touristIndex <newLength;touristIndex++){
		System.out.println(touristPlaces[touristIndex]);
}
}
}