class Mixer1Tesrter{
	

 public static void main(String test[]){
 System.out.println("Main started");
 //click on button
 Mixer1.name ="";
 boolean connected = Mixer1.onOrOff();
 System.out.println("Is Mixer1 connected"+ connected);
 Mixer1.increaseSpeed();
 Mixer1.increaseSpeed();
 Mixer1.increaseSpeed();
 Mixer1.increaseSpeed();
System.out.println("Is Mixer1 connected"+ connected1);
 Mixer1.decreaseSpeed();
 Mixer1.decreaseSpeed();
 Mixer1.decreaseSpeed();
 Mixer1.decreaseSpeed();
 boolean connected1 = Mixer1.onOrOff();
  System.out.println("Is Mixer connected"+ connected1);
  System.out.println("Main ended");
 }




}