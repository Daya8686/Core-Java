package Example;

public class IntToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s=new Solution();
		System.out.println(s.setBits(545));

	}

}
class Solution {
    static int setBits(int N) {
        // code here
        int binary[]=new int[150];
        int temp=0;
        int count=0;
        while(N>0){
            int rem=N%2;
            N=N/2;
            
            binary[temp]=rem;
            temp=++temp;
            count++;
            
        }
        String res="";
        for(int i=0;i<count;i++){
            int m=binary[i];
             res=res+m+"";
        }
        int fin=Integer.parseInt(res);
        return fin;
    }
}
