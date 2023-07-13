class WashingMachine{

 static String name= "LG";
         static int minSpeed;
     static  int currentSpeed;
	 static int maxSpeed = 120;
	 static boolean isConnected;
	 //method
	 public static boolean onOrOff(){
	  
	 System.out.println("Invoking onOrOff()");
	 System.out.println("Parameter"+ 0);
	 // false == false
	 if(isConnected == false){
	     isConnected = true;
	 System.out.println(WashingMachine is Turned onnn.. Enjoyyy");
	 }
	 else if(isConnected == true){
	      isConnected = false;
		  System.out.println("WashingMachine is Turned off...");		  
	 }
	 return isConnected;
     }

	 
  // increaseSpeed
  public static void increaseSpeed(){
	  
	  System.out.println("Start of increaseSpeed");
	  
	  
	  
	 if(isConnected == true){
	 if(currentSpeed < maxSpeed){
		  currentSpeed = currentSpeed + 1;
		  System.out.println("The current Speed is"+currentSpeed);
	  
  }else{
	  
	  System.out.println("Max Volume reached");
	  
  }
}else{
	System.out.println("Gubee...Speed Connect Maadu firstu");
	  
}
  }
 

//decreseSpeed   
  
 public static void decreaseSpeed(){
	 //logic
 
 
 		  System.out.println("Invoking decreaseSpeed");
	  		  System.out.println("list of parameters +2" );
	  
  
	 if(isConnected == true){
	 if(currentSpeed > minSpeed){
		  currentSpeed = currentSpeed - 1;
		  System.out.println("The current Speed is"+currentSpeed);
	  
  }else{
	  
	  System.out.println("Min Speed reached");
	  
  }
}else{
	System.out.println("The WashingMachine turned off... can't decrease Speed");
}
System.out.println("End of decreaseSpeed()");
	  
}
  }


