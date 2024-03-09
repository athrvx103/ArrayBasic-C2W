import java.util.*;
class abc{
	public static void main(String[] args){
		int arr[]=new int[]{3,4,2,1,5};
		Arrays.sort(arr);
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum=sum+(arr[i]*i);
		}
		System.out.println(sum);
	}
}