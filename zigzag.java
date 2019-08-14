package te;

;

public class zigzag {

	public static void zigzag(String input, int rows) {
		
		int i = 0, j =0, k = 1;
		
		int len = input.length();
		//int rownum = 0;
		
		
		
		StringBuilder temp = new StringBuilder();
		int index = 0;
		int left = 0;
		if(input!=null)
		temp.append(input.charAt(0));
		j = len/rows;
		j = j + (j-1);
		for(i = 0 ; i < rows ; i ++) {
		
			
			
			
			
			
			if( i ==0) {
				
				while(index < len && k <= j) {
					index = index + (rows - 2) + rows;
					if(index < len)
						temp.append(input.charAt(index));
					k++;
					
				}
			
				k = 1;
			}
			else {
				
				if(i == rows -1) {
					int down = i;
					if(down < len) {
						temp.append(input.charAt(down));

					}
					index = i ;
					while(index < len && k <= j) {
						index = index + (rows - 2) + rows;
						
//						left = index - (rows * 2);
//						if(left < len)
//						temp.append(input.charAt(left));
						if(index < len)
						temp.append(input.charAt(index));
						k++;
						
					}
					k = 1;
					
				}
			}
			
			if(i != 0 && i != rows -1) {
				index = i;
				int down = i;
				if(down < len) {
					temp.append(input.charAt(down));
				}
			while(index < len && k <= j) {
				

				
				index = index + (rows - 2) + rows;
				
				left = index - (down * 2);
				if(left < len)

				temp.append(input.charAt(left));
				if(index < len)

				temp.append(input.charAt(index));
				k++;
				
				
			}
			k = 1;
			}
				
				
				
			
			
			
			
			
			
			
			
	}
			
			
			
			
			
			
		System.out.println("temp:"+temp.toString());
			
			
			
				
				
				
			
			
		
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String input = "paypal";
		int rows = 3;
		zigzag(input, rows);

	}

	

}
