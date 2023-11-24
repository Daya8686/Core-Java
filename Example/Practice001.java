package Example;

import java.util.ArrayList;

public class Practice001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int n=10;
		int s=15;
		System.out.println(subarraySum(arr,n,s));

	}
	
	    //Function to find a continuous sub-array which adds up to a given number.
	    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
	    {
	        // Your code here
//	         int f=1;
//	         int res=0;
//	         int i;
//	        
//	         for( i=f;i<n;i++){
//	             res=res+arr[i];
//	             if(res>15){
//	                 f++;
//	                 break;
//	               
//	             }
//	         }
//	         ArrayList<Integer> num=new ArrayList<Integer>();
//	         num.add(f);
//	         num.add(i);
//	         return (num);
	    
	        
	    
//	    int res=0;
//	    int i=0;
//	    int j=0;
//	    ArrayList<Integer> aa=new ArrayList<>();
//	    boolean f=true;
//	        while(f){
//	            res=res+arr[j];
//	           if(res==s){
//	               
//	               aa.add(i+1);
//	               aa.add(j+1);
//	               f=false;
//	           } 
//	           j++;
//	           if(res>s){
//	               i++;
//	               j=i;
//	               res=0;
//	           }
//	        }
//	        return aa;
	    	
	    	
	    	ArrayList <Integer> ar=new ArrayList<>();
	    	int l=0;int r=0;
	    	int sum=arr[0];
	    	boolean f=false;
	    	while(r<n) {
	    		if(sum==s) {
	    			f=true;
	    			break;
	    		}
	    		else if(sum<s) {
	    			r++;
	    			if(r<n)
	    			sum+=arr[r];
	    			
	    		}
	    		else {
	    			sum-=arr[l];
	    			l++;
	    		}
	    		
	    	}
	    	if(f) {
	    		ar.add(l+1);
	    		ar.add(r+1);
	    	return ar;
	    	}
	    	ar.add(-1);
	    	return ar;
	    }
	}


