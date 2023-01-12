package java_challenge;

public class Single_one {

	public static void main(String[] args) {
		int[] nums = {4,1,2,1,2};
		
		for (int i = 0; i < nums.length; i++) {
			// again loop start change result value to true
			boolean result = true;
			for (int j = 0; j < nums.length; j++) {
				
				if (nums[i]==nums[j] && i!=j) {
					result = false;
                      break;
				}
			}
		 //  i value which not fall under above if loop, so result will be remains true
		   if (result) {
				System.out.println("Elements appears once :" +nums[i]);
				
				}
			
			}
			
			
		}
}	

	


