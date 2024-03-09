import java.util.*;
class abc{
	public static void main(String[] args){
		int num=100350;
		int N=num;
		int count=0;
		while(num!=0){
			num=num/10;
			count++;
		}
		int arr[]=new int[count];
		for(int i=arr.length-1;i>=0;i--){
			if(N%10==0){
				arr[i]=5;
				N=N/10;
			}else{
				arr[i]=N%10;
				N=N/10;
			}
		}
		for(int x:arr){
			System.out.print(x);
		}
	}
}