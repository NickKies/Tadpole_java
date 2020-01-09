class Cellphone{
 String model = "Galaxy 18";
 String color;
 int capacity;
 
 Cellphone(String color, int capacity){
  this.color = color;
  this.capacity=capacity;
 }
 
}
public class Constructor1 {
	public static void main(String[] args) {
		  //Cellphone myphone1 = new Cellphone();
		  Cellphone myphone = new Cellphone("Sliver",64);
		  
		  System.out.println(myphone.model);
		  System.out.println(myphone.color);
		  System.out.println(myphone.capacity);
		 }
}
