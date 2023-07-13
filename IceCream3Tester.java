class IceCream3Tester{
public static void main(String tester[]){
	//create,save,add
IceCream3.addflavorNames("Strawbery");
IceCream3.addflavorNames("Chocolate");
IceCream3.addflavorNames("Vanilla");
IceCream3.addflavorNames("Butter Pecan");
IceCream3.addflavorNames("Buttersoktch");
IceCream3.addflavorNames("Black Current");
IceCream3.addflavorNames("Fruit Overload");
IceCream3.addflavorNames("Cotton Candy");
//Read,get,fetch
IceCream3.getAllflavorNames();
System.out.println(" ");
//update,edit
IceCream3.editflavorNames("French Vanilla","Black Current");   
 IceCream3.getAllflavorNames();
 int newLength = IceCream3.deleteflavorNames("Cotton Candy"); 
 System.out.println("Calling getAllflavorNamesPostDeletion");
 IceCream3.getAllflavorNamesPostDeletion(newLength);
 

}


}