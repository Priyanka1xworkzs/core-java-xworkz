class WashingMachineTesrter{
	

 public static void main(String test[]){
 System.out.println("Main started");
 //click on button
WashingMachine.name ="";
 boolean connected = WashingMachine.onOrOff();
 System.out.println("Is WashingMachine connected"+ connected);
 WashingMachine.increaseSpeed();
 WashingMachine.increaseSpeed();
 WashingMachine.increaseSpeed();
 WashingMachine.increaseSpeed();
System.out.println("Is WashingMachine connected"+ connected1);
 WashingMachine.decreaseSpeed();
 WashingMachine.decreaseSpeed();
 WashingMachine.decreaseSpeed();
 WashingMachine.decreaseSpeed();
 boolean connected1 = WashingMachine.onOrOff();
 System.out.println("Is WashingMachine connected"+ connected1);
  System.out.println("Main ended");
 }




}