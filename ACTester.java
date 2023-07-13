class ACTester{

 public static void main(String test[]){
 System.out.println("Main started");
 //click on button
 AC.name ="";
 boolean connected = AC.onOrOff();
 System.out.println("Is AC connected"+ connected);
 AC.increaseTempreture();
 AC.increaseTempreture();
 AC.increaseTempreture();
 AC.increaseTempreture();
 boolean connected1 = AC.onOrOff();
  System.out.println("Is AC connected"+ connected1);
AC.decreaseTempreture();
AC.decreaseTempreture();
 AC.decreaseTempreture();
AC.decreaseTempreture();
  System.out.println("Is AC connected"+ connected1);
 System.out.println("Main ended");
 }




}