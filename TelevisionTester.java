class TelevisionTester{

 public static void main(String test[]){
 System.out.println("Main started");
 //click on button
Television.name ="";
 boolean connected = Television.onOrOff();
 System.out.println("Is Television connected"+ connected);
 Television.increaseVolume();
 Television.increaseVolume();
Television.increaseVolume();
Television.increaseVolume();
 boolean connected1 = Television.onOrOff();
  System.out.println("Is Television connected"+ connected1);
Television.decreaseVolume();
Television.decreaseVolume();
Television.decreaseVolume();
Television.decreaseVolume();
  System.out.println("Is Television. connected"+ connected1);
 System.out.println("Main ended");
 }




}