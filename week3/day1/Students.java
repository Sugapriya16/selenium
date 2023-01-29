package week3.day1;

public class Students {
	
	public void getStudentInfo(int  id) {
		System.out.println("Student Id is :"+id);		
	}
	public void getStudentInfo(int  id,String Name) {
		System.out.println("Student Id is :"+id+ " and Student name is :"+Name);	
	}
	public void getStudentInfo(String Email,String PhNumber) {
		System.out.println("Student Email is :"+Email+ " and Student Phone Number is :"+PhNumber);	
	}

	public static void main(String[] args) {
		Students stud = new Students();
		stud.getStudentInfo(1234);
		stud.getStudentInfo(567, "Sugapriya");
		stud.getStudentInfo("suga@gmail.com", "234516789");
     
	}

}
