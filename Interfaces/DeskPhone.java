package Interfaces;

public class DeskPhone implements ITelephone {
	private int myNumber;
	private boolean isRinging;
	
	
	public DeskPhone(int myNumber) {
		this.myNumber = myNumber;
	}
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("No action taken, desk phone doesn't have power button");
	}
	@Override
	public void dial(int phoneNumber) {
		// TODO Auto-generated method stub
		System.out.println("Now ringing " + phoneNumber + " on desk phone");
	}
	@Override
	public void answer() {
		// TODO Auto-generated method stub
		if(isRinging) {
			System.out.println("Answering the desk phone");
			isRinging = false;
		}
		
	}
	@Override
	public boolean callPhone(int phoneNumber) {
		if(phoneNumber == myNumber) {
			isRinging = true;
		} else {
			isRinging = false;
		}
		return isRinging;
	}
	@Override
	public boolean isRinging() {
		// TODO Auto-generated method stub
		return isRinging;
	}
	
	
}
