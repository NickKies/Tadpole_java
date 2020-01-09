interface Vehicle{

 void run();
 
}

interface Bus extends Vehicle{
 void run();
}

interface Truck extends Vehicle{
 void run();
}

class BusImpl implements Bus{

 @Override
 public void run() {
  System.out.println("버스가 달리고 있습니다.");
 }
}

class TruckImpl implements Truck{

 @Override
 public void run() {
  System.out.println("트럭이 달리고 있습니다.");
 }
}

class Ride{
 void ride(Vehicle v) {
  v.run();
 }
}
public class PolyTestOfInterface {

	public static void main(String[] args) {
		 Bus bus1 = new BusImpl();   //구현 객체
		  Truck truck1 = new TruckImpl();
		  
		  Ride ride1 = new Ride();
		  ride1.ride(bus1);
		  ride1.ride(truck1);

	}

}
