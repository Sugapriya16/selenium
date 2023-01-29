package org.system;

public class Desktop extends Computer {
	
	public void desktopSize (int size) {
		System.out.println("Size of Desktop is :"+size);
	}
	public static void main(String[] args) {
		Desktop call = new Desktop();
		call.computerModel("acer");
		call.desktopSize(14);
	}
}
