 class MetroStation3{

static String stationNames[]={"Kengeri",null,null,null,null,null,null,null};
 static int index=0;

public static boolean addstationNames(String stationName){
System.out.println("Invoking addstationNames");
System.out.println("No of parametrs : 1,type is String");
boolean isAdded = false;
if(stationNames.length>index){
if(stationName!=null && stationName.length()>0){

 stationNames[index++] = stationName;
 isAdded = true;

 }else{
 System.out.println("ohh..Elli stations thumba ede");
 
 }
}else{
System.out.println("stationName cannot be null");
}
return isAdded;

}
public static void getAllstationNames(){
	System.out.println("List of stationNames are:");
	for(String stationName : stationNames){
		System.out.println(stationName);
	}

}
public static boolean editstationNames(String updatedstationName,String existingstationName){
	System.out.println("Invoking editstationNames");
System.out.println("No of Parameters : 2,type of parameter:String,String");
boolean isUpdated = false;
for(int stationIndex = 0; stationIndex < stationNames.length; stationIndex++){
	if(stationNames[stationIndex].equals(existingstationName)){   	
	        stationNames[stationIndex] = updatedstationName;			
             isUpdated = true;	
}
}
return isUpdated;
}
public static int deletestationNames(String deletedstationName){  
	System.out.println("Invoking editstationNames");
System.out.println("No of Parameters : 2,type of parameter:String,String");
boolean isDeleted = false;
int stationsIndex;
int noOfElements = stationNames.length;
for( stationsIndex = 0; stationsIndex < stationNames.length; stationsIndex++){
	if(stationNames[stationsIndex].equals(deletedstationName)){   
	       break;
	}
}                                                                   	
  if(stationsIndex<noOfElements){
	   noOfElements =  noOfElements-1;
	   for(int newstationIndex = stationsIndex; newstationIndex<noOfElements; newstationIndex++){
		   stationNames[newstationIndex] = stationNames[newstationIndex+1];
	   }
  }
  return noOfElements;
 	  
}
public static void getAllstationNamesPostDeletion(int newLength){
	for(int stationIndex =0;stationIndex <newLength;stationIndex++){
		System.out.println(stationNames[stationIndex]);
}
}
	
}