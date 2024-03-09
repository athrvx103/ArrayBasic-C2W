import java.util.*;
class abc{
	public static void main(String[] args){
		int arr[]=new int[]{50,50,30,20,10,100,200,300,500,1000,300,300,300};
		int arr2[]=new int[arr.length];

		Arrays.sort(arr);
		int z=1;
		int k=4;
		arr2[0]=arr[arr.length-1];
		for(int j=arr.length-2;j>=0;j--){
			 if(arr[j]<arr[j+1]){
				arr2[z]=arr[j];
				z++;
			}
		}
		for(int x:arr2){
			System.out.print(x+" ");
		}
		System.out.println();
		
		for(int i=0;i<arr2.length;i++){
			if(i==k){
				System.out.println("Your "+k+" largest element is --> "+arr2[i-1]);
			}
		}
		
	}
}
