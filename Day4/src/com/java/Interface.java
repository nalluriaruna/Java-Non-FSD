package com.java;
interface Mobile{
	  void PlayMusic();
	  void MakeACall();
}

 class Phone implements Mobile{
	
	public void PlayMusic() {
		System.out.println("music is playing...");
	}
	 public void MakeACall() {
		System.out.println("it's ringing..");
	}
}

public class Interface {
	public static void main(String args[]) {
		
		Phone P = new Phone();
		P.PlayMusic();
		P.MakeACall();
	}

}
