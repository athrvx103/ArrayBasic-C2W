import java.util.*;
class abc{
	public static void main(String[] args){
		int arr[]=new int[]{1,2,3,4,5,6,7};
		int N=arr.length;
		int arr2[]=new int[N];
		Arrays.sort(arr);
		int z1=1;
		int z2=2;
		int mid=0;
		if(N%2==0){
			mid=N-1/2;
			arr[mid]=arr[0];
		}else{
			mid=N/2;
			arr2[mid]=arr[0];
		}
		
		for(int i=mid+1;i<N;i++){
			arr2[i]=arr[z1];
			z1=z1+2;
		}
		
		for(int i=mid-1;i>=0;i--){
			arr2[i]=arr[z2];
			z2=z2+2;
		}
		for(int x:arr2){
			System.out.print(x+" ");
		}
		System.out.println();
	}
}