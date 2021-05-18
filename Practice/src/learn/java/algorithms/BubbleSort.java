package learn.java.algorithms;

/*
 * Algorithm
 * ---------
 * 
 * Step 1: Repeat Step 2 For i = 0 to N-1
   Step 2: Repeat For J = i + 1 to N - I
   Step 3: IF A[J] > A[i]
   
   SWAP A[J] and A[i]
   [END OF INNER LOOP]
   [END OF OUTER LOOP
   Step 4: EXIT
 * 
 */

public class BubbleSort {

	public static void main(String[] args) {  
	    int[] a = {10, 9, 7, 101, 23, 44, 12, 78, 34, 23};  
	    for(int i=0;i<10;i++)  
	    {  
	        for (int j=0;j<10;j++)  
	        {  
	            if(a[i]<a[j])  
	            {  
	                int temp = a[i];  
	                a[i]=a[j];  
	                a[j] = temp;   
	            }  
	        }  
	    }  
	    System.out.println("Bubble Sorted List ...");  
	    for(int i=0;i<10;i++)  
	    {  
	        System.out.println(a[i]);  
	    }  
	}  
	
}
