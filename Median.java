package te;

public class Median {
	
	//finding the median of two sorted arrays

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	class Solution {
	    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        
	        int size1 = nums1.length;
	        int size2 = nums2.length;
	        if(size1 == 0 && size2 == 0)
	            return 0;
	        
	        int size3 = size1+size2;
	        
	        
	        int[] nums3 = new int[size3];
	        
	        int k = 0 ;
	        int i = 0 ; int j = 0;
	        while( i< size1 && j < size2){
	            
	            if(nums1[i] < nums2[j]){
	                nums3[k] = nums1[i];
	                k++;
	                i++;
	            }
	            else{
	                nums3[k] = nums2[j];
	                k++;
	                j++;
	            }
	            
	            
	        }
	              while(i < size1){
	                  nums3[k] = nums1[i];
	                  i++; k++;
	              }
	               while(j < size2){
	                  nums3[k] = nums2[j];
	                  j++; k++;
	              }
	        
	        int medianPointer = (size1+size2)/2;
	             
	        if(size1 == 1 && size2 == 1){
	            
	            return Double.valueOf((nums3[0] + nums3[1])/2.0);
	                
	            
	        }
	        //odd length
	        if(medianPointer < size3 && size3%2 == 1){
	            
	            double median = Double.valueOf(nums3[medianPointer]); 
	            return median;
	        }
	        
	        
	        //evenlength
	        if(medianPointer < size3 && size3%2 == 0){
	            
	            double median =  Double.valueOf((nums3[medianPointer] + nums3[medianPointer - 1]) / 2.0);
	            //System.out.println(nums3[medianPointer] + " " + nums3[medianPointer-1]);
	            return median;
	            
	        }
	        else
	            return 0;
	        
	        
	      
	    }
	}

}
