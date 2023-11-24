package Example;

public class Pratice002 {


    static int minJumps(int[] arr){
        // your code here
        int count=0;
        int res=0;
        int a=arr.length-1;
        while(res<=a){
            res=arr[res];
            res+=1;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
    	int arr[]= {1,3,5,8,9,2,6,7,6,8,9};
    	System.out.println(minJumps(arr));
    }
}
