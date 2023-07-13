class Telecomm3{

static String simNetworks[]={"BSNL",null,null,null,null,null,null,null};
 static int index=0;

public static boolean addsimNetworks(String simNetwork){
System.out.println("Invoking addsimNetworks");
System.out.println("No of parametrs : 1,type is String");
boolean isAdded = false;
if(simNetworks.length>index){
if(simNetwork!=null && simNetwork.length()>0){

 simNetworks[index++] = simNetwork;
 isAdded = true;

 }else{
 System.out.println("ohh..simNetworks thumba ede");
 
 }
}else{
System.out.println("simNetwork cannot be null");
}
return isAdded;

}
public static void getAllsimNetworks(){
	System.out.println("List of simNetworks are:");
	for(String simNetwork : simNetworks){
		System.out.println(simNetwork);
	}

}
public static boolean editsimNetworks(String updatedsimNetwork,String existingsimNetwork){
	System.out.println("Invoking editsimNetworks");
System.out.println("No of Parameters : 2,type of parameter:String,String");
boolean isUpdated = false;
for(int simIndex = 0; simIndex < simNetworks.length; simIndex++){
	if(simNetworks[simIndex].equals(existingsimNetwork)){   	
	       simNetworks[simIndex] = updatedsimNetwork;			
             isUpdated = true;	
}
}
return isUpdated;
}
public static int deletesimNetworks(String deletedsimNetwork){  
	System.out.println("Invoking editsimNetworks");
System.out.println("No of Parameters : 2,type of parameter:String,String");
boolean isDeleted = false;
int simsIndex;
int noOfElements = simNetworks.length;
for( simsIndex = 0; simsIndex < simNetworks.length; simsIndex++){
	if(simNetworks[simsIndex].equals(deletedsimNetwork)){   
	       break;
	}
}                                                                   	
  if(simsIndex<noOfElements){
	   noOfElements =  noOfElements-1;
	   for(int newsimIndex = simsIndex; newsimIndex<noOfElements; newsimIndex++){
		   simNetworks[newsimIndex] = simNetworks[newsimIndex+1];
	   }
  }
  return noOfElements;
 	  
}
public static void getAllsimNetworksPostDeletion(int newLength){
	for(int simIndex =0;simIndex <newLength;simIndex++){
		System.out.println(simNetworks[simIndex]);
}
}
}