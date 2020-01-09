package helloDay20;
interface Camera{
	 void Photo(); 
	}

	interface Call{
	 void calling();
	}

	interface Memo{
	 void write();
	}

	interface Clock{
	 void clock();
	}

	class MyCellPhone implements Camera,Call,Memo,Clock{

	 @Override
	 public void clock() {
	 }

	 @Override
	 public void write() {
	 }

	 @Override
	 public void calling() {
	 }

	 @Override
	 public void Photo() {
	 }
	}

	class PhoneUser{
	 void call(Call c) {
	  System.out.println("전화를 걸었습니다.");
	 }
	}
	
public class Interface4 {

	public static void main(String[] args) {
		 MyCellPhone phone1 = new MyCellPhone();
		  Camera phone2 = new MyCellPhone();
		  Call phone3 = new MyCellPhone();
		  Memo phone4 = new MyCellPhone();
		  Clock phone5 = new MyCellPhone();
		  PhoneUser user1 = new PhoneUser();
		  user1.call(phone3);
		  user1.call(phone1);

	}

}
