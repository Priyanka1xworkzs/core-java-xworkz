 class MedicineStore3{

static String medicineNames[]={"Dolo",null,null,null,null,null,null,null};
 static int index=0;

public static boolean addmedicineNames(String  medicineName){
System.out.println("Invoking add medicineNames");
System.out.println("No of parametrs : 1,type is String");
boolean isAdded = false;
if( medicineNames.length>index){
if( medicineName!=null &&  medicineName.length()>0){

  medicineNames[index++] =  medicineName;
 isAdded = true;

 }else{
 System.out.println("ohh..Elli medicine kalli agide ");
 
 }
}else{
System.out.println(" medicineName cannot be null");
}
return isAdded;

}
public static void getAllmedicineNames(){
	System.out.println("List of  medicineNames are:");
	for(String  medicineName :  medicineNames){
		System.out.println( medicineName);
	}

}
public static boolean editmedicineNames(String updatedmedicineName,String existingmedicineName){
	System.out.println("Invoking edit medicineNames");
System.out.println("No of Parameters : 2,type of parameter:String,String");
boolean isUpdated = false;
for(int  medicineIndex = 0; medicineIndex < medicineNames.length; medicineIndex++){
	if( medicineNames[medicineIndex].equals(existingmedicineName)){   	
	         medicineNames[medicineIndex] = updatedmedicineName;			
             isUpdated = true;	
}
}
return isUpdated;
}
public static int deletemedicineNames(String deletedmedicineName){  
	System.out.println("Invoking editmedicineNames");
System.out.println("No of Parameters : 2,type of parameter:String,String");
boolean isDeleted = false;
int medicinesIndex;
int noOfElements = medicineNames.length;
for( medicinesIndex = 0; medicinesIndex < medicineNames.length; medicinesIndex++){
	if(medicineNames[medicinesIndex].equals(deletedmedicineName)){   
	       break;
	}
}                                                                   	
  if(medicinesIndex<noOfElements){
	   noOfElements =  noOfElements-1;
	   for(int newmedicineIndex = medicinesIndex; newmedicineIndex<noOfElements; newmedicineIndex++){
		   medicineNames[newmedicineIndex] = medicineNames[newmedicineIndex+1];
	   }
  }
  return noOfElements;
 	  
}
public static void getAllmedicineNamesPostDeletion(int newLength){
	for(int medicineIndex =0;medicineIndex <newLength;medicineIndex++){
		System.out.println(medicineNames[medicineIndex]);
}
}
	
}
