package te;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

    /*
     * Complete the 'countNonUnique' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY numbers as parameter.
     */

    public static int countNonUnique(List<Integer> numbers) {
    // Write your code here
    
    	int arr[] = new int[numbers.size()];
  for(int i = 0 ; i < numbers.size();i++) {
	  arr[i] = numbers.get(i);
	  
  }
  HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
  
  int count = 0 ;
  
  for(int i = 0 ; i < numbers.size(); i ++) {
	  
	  for (int j = i+1 ; j < numbers.size(); j ++) {
		  
		  if(arr[i] ==  arr[j]) {
			  mp.put(arr[i],  count++);
		  }
	  }
	  count = 0;
  }
  
    	for(int i =0 ; i < mp.size(); i++)
    	System.out.println("mp:"+mp.get(i));
    	
    	return mp.size();
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int numbersCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> numbers = new ArrayList<>();
//
//        for (int i = 0; i < numbersCount; i++) {
//            int numbersItem = Integer.parseInt(bufferedReader.readLine().trim());
//            numbers.add(numbersItem);
//        }
//
//        int result = Result.countNonUnique(numbers);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
    	
        //int numbersCount = Integer.parseInt(bufferedReader.readLine().trim());
        
                List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(1);
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        numbers.add(5);
        
        
                int result = Result.countNonUnique(numbers);
                System.out.println("result:"+result);
}
}

