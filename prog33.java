import java.util.*;
class abc{
	public static void main(String[] args){
		int arr[]=new int[]{1,2,3};
		int N=arr.length;
		int X=(N+1)/2;
		int sum1=0;
		int sum2=0;
		for(int i=0;i<X;i++){
			sum1=sum1+arr[i];
		}
		System.out.println(sum1);
		for(int i=X;i<N;i++){
			sum2=sum2+arr[i];
		}
		System.out.println(sum2);
		System.out.println(sum1*sum2);
	}
}