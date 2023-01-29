package week3.day1;

public class Automation extends MulipleLanguage implements Language,TestTool{

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
