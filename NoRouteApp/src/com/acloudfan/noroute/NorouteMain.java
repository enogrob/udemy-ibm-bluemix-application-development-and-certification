package com.acloudfan.noroute;

public class NorouteMain {
	public static void main(String[] args){
		int counter = 0;
		while(true) {
			System.out.println("Counter Value = " + counter);
			counter++;
			try{Thread.sleep(5000);} catch (Exception e){}
		}
	}

}
