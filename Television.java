class Television{
	

 static String name= "Sumsang";
         static int minVolume;
     static  int currentVolume;
	 static int maxVolume = 10;
	 static boolean isConnected;
	 //method
	 public static boolean onOrOff(){
	  
	 System.out.println("Invoking onOrOff()");
	 System.out.println("Parameter"+ 0);
	 // false == false
	 if(isConnected == false){
	     isConnected = true;
	 System.out.println("Speaker is Turned onnn.. Enjoyyy");
	 }
	 else if(isConnected == true){
	      isConnected = false;
		  System.out.println("Speaker  is Turned off...");		  
	 }
	 return isConnected;
     }

	 
  // increaseVolume
  public static void increaseVolume(){
	  
	  System.out.println("Start of increaseVolume");
	  
	  
	  
	 if(isConnected == true){
	 if(currentVolume < maxVolume){
		  currentVolume = currentVolume + 1;
		  System.out.println("The current Volume is"+currentVolume);
	  
  }else{
	  
	  System.out.println("Max Volume reached");
	  
  }
}else{
	System.out.println("Gubee...Television Connect Maadu firstu");
	  
}
  }
 

//decreseVolume   
  
 public static void decreaseVolume(){
	 //logic
 
 
 		  System.out.println("Invoking decreaseVolume");
	  		  System.out.println("list of parameters +2" );
	  
  
	 if(isConnected == true){
	 if(currentVolume > minVolume){
		  currentVolume = currentVolume - 1;
		  System.out.println("The current Volume is"+currentVolume);
	  
  }else{
	  
	  System.out.println("Min Volume reached");
	  
  }
}else{
	System.out.println("The Television turned off... can't decrease Volume");
}
System.out.println("End of decreaseVolume()");
	  
}
  }


