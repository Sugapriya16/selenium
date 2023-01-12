package java_challenge;

public class Single_one {

	public static void main(String[] args) {
		int[] nums = {4,1,2,1,2};
		
		for (int i = 0; i < nums.length; i++) {
			boolean result = true;
			for (int j = 0; j < nums.length; j++) {
				
				if (nums[i]==nums[j] && i!=j) {
					result = false;
                      break;
				}
			}
		
		   if (result) {
				System.out.println("Elements appears once :" +nums[i]);
				
				}
			
			}
			
			
		}
}	

	


