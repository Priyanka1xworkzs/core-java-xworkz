class Oven{

 static String name= "Bajaj";
         static int minTempreture;
     static  int currentTempreture;
	 static int maxTempreture = 120;
	 static boolean isConnected;
	 //method
	 public static boolean onOrOff(){
	  
	 System.out.println("Invoking onOrOff()");
	 System.out.println("Parameter"+ 0);
	 // false == false
	 if(isConnected == false){
	     isConnected = true;
	 System.out.println("Oven is Turned onnn.. Enjoyyy");
	 }
	 else if(isConnected == true){
	      isConnected = false;
		  System.out.println("Oven  is Turned off...");		  
	 }
	 return isConnected;
     }

	 
  // increaseTempreture
  public static void increaseTempreture(){
	  
	  System.out.println("Start of increaseTempreture");
	  
	  
	  
	 if(isConnected == true){
	 if(currentTempreture < maxTempreture){
		  currentTempreture = currentTempreture + 1;
		  System.out.println("The current Tempreture is"+currentTempreture);
	  
  }else{
	  
	  System.out.println("Max Tempreture reached");
	  
  }
}else{
	System.out.println("Gubee...Oven Connect Maadu firstu");
	  
}
  }
 

//decreseTempreture  
  
 public static void decreaseTempreture(){
	 //logic
 
 
 		  System.out.println("Invoking Tempreture");
	  		  System.out.println("list of parameters +2" );
	  
  
	 if(isConnected == true){
	 if(currentTempreture > minTempreture){
		  currentTempreture = currentTempreture - 1;
		  System.out.println("The current Tempreture is"+currentTempreture);
	  
  }else{
	  
	  System.out.println("Min Tempreture reached");
	  
  }
}else{
	System.out.println("The Oven turned off... can't decrease Tempreture");
}
System.out.println("End of decreaseTempreture()");
	  
}
  }



 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 