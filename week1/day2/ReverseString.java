package week1.day2;

public class ReverseString {

	public static void main(String[] args) {
		String name = "TestLeaf";
		//convert the string into char array
		char[] ch=name.toCharArray(); 
		System.out.println(ch); 
		for(int i=ch.length-1;i>=0;i--)
		{  
		   System.out.println(ch[i]);  
		}  

	}

}
