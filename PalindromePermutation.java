package te;

import java.util.HashMap;

public class PalindromePermutation {

	
	public static boolean findpermutation(String input) {
		
		
		HashMap <String, Integer> mp = new HashMap<String, Integer>();
		int len = input.length();
		
		boolean even = false;
		boolean pal = false;
		
		if(len % 2 == 0) {
			even = true;
		}
		
		int count = 1 ;
		
		int lim = 0;
		if(even)
			lim = len/2;
		else 
			lim = (len/2)+1;
			
		
		for(int i = 0 ; i < len ; i ++) {
			
			for(int j = i +1 ; j < len ; j ++) {
				
				
				
				if(input.charAt(i) ==  input.charAt(j)) {
					count++;
				}
				
				
					
					
				
			}
			if(!mp.containsKey(input.charAt(i)+"")) {
				mp.put(input.charAt(i)+"", count);
				count = 1;
			}
			
		}
		
		
			count = 0;
			int count1 = 0;
			for(String key : mp.keySet()) {
				
				
				
				if(mp.get(key) >= 2) {
					
					count++;
					
				}
				
				if((mp.get(key) % 2) ==  1) {
					count1++;
					
				
				}
				
					
				
				
			}

			
			if(count >= 0  && count1 >= 0 && count1 %2 != 0)
				pal = true;
			
		
		
		
		
		
		return pal;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String input = "ab";
		
		
		System.out.println("Input String :"+input );
		
		boolean isPermutation = findpermutation(input);
		System.out.println("Is string is permutation of palindrome?"+isPermutation);
		
	}

}
