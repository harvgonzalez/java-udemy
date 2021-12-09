package Interfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ITelephone timsPhone = new DeskPhone(1234124);
		timsPhone.powerOn();
		timsPhone.callPhone(1234124);
		timsPhone.answer();
		
		
		timsPhone = new MobilePhone(1251251);
		timsPhone.powerOn();
		timsPhone.callPhone(1251251);
		timsPhone.answer();
	}

}
