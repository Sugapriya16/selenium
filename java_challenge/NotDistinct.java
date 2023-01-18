package java_challenge;

public class NotDistinct {

	public static void main(String[] args) {
		int[] nums = {1,2,4,3};
		boolean result = true;
	      for (int i = 0; i < nums.length; i++) {
	    	  for (int j = 0; j < nums.length; j++) {
	    		  if (nums[i]==nums[j]&&i!=j) {
	    			  result = false;
	    		  }
			}break;
		}
		
      System.out.println(result);
	}

}
