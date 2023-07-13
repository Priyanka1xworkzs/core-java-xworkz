class IceCream2{

static String flavorNames[]={"Strawberry",null,null,null,null,null,null,null};
 static int index=0;

public static boolean addflavorNames(String flavorName){
System.out.println("Invoking addflavorNames");
System.out.println("No of parametrs : 1,type is String");
boolean isAdded = false;
if(flavorNames.length>index){
if(flavorName!=null && flavorName.length()>0){

 flavorNames[index++] = flavorName;
 isAdded = true;

 }else{
 System.out.println("ohh..Elli flavor thumba ede");
 
 }
}else{
System.out.println("flavorNames cannot be null");
}
return isAdded;

}
public static void getAllflavorNames(){
	System.out.println("List of flavorNames are:");
	for(String flavorName : flavorNames){
		System.out.println(flavorName);
	}

}
public static boolean editflavorNames(String updatedflavorName,String existingflavorName){
	System.out.println("Invoking editflavorNames");
System.out.println("No of Parameters : 2,type of parameter:String,String");
boolean isUpdated = false;
for(int flavorIndex = 0; flavorIndex < flavorNames.length; flavorIndex++){
	if(flavorNames[flavorIndex].equals(existingflavorName)){   	
	        flavorNames[flavorIndex] = updatedflavorName;			
             isUpdated = true;	
}
}
return isUpdated;
}
public static int deleteflavorNames(String deletedflavorName){  
	System.out.println("Invoking editflavorNames");
System.out.println("No of Parameters : 2,type of parameter:String,String");
boolean isDeleted = false;
int flavorsIndex;
int noOfElements = flavorNames.length;
for( flavorsIndex = 0; flavorsIndex < flavorNames.length; flavorsIndex++){
	if(flavorNames[flavorsIndex].equals(deletedflavorName)){   
	       break;
	}
}                                                                   	
  if(flavorsIndex<noOfElements){
	   noOfElements =  noOfElements-1;
	   for(int newflavorIndex = flavorsIndex; newflavorIndex<noOfElements; newflavorIndex++){
		   flavorNames[newflavorIndex] = flavorNames[newflavorIndex+1];
	   }
  }
  return noOfElements;
 	  
}
public static void getAllflavorNamesPostDeletion(int newLength){
	for(int flavorIndex =0;flavorIndex <newLength;flavorIndex++){
		System.out.println(flavorNames[flavorIndex]);
}
}
	
}
