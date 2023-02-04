package week3.day1;

public class Automation extends MulipleLanguage implements Language,TestTool{
	
//	Assignment 5 on Abstraction
//	===========
//	Interface :Language
//	     Methods   :Java()
//	     Interface :TestTool
//	     Methods   :Selenium()
//	     AbstractClass :MultipleLangauge
//	     Methods   :python() and un implemented method as ruby()
//	  Execution class: Automation 
//	Implement all the methods of interface and abstract class in Automation class

	@Override
	public void ruby() {
	System.out.println("Ruby");
	}

	public void Selenium() {
		System.out.println("Selenium");		
	}

	public void Java() {
		System.out.println("Java");		
	}
	
	public static void main(String[] args) {
		Automation at = new Automation();
		at.python();
		at.ruby();
		at.Selenium();
		at.Java();
	}

}
