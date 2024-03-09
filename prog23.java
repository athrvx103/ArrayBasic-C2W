import java.util.*;
class abc{
	public static void main(String[] args){
		int arr[]=new int[]{1,2,1,3,6,7};

		int min=Integer.MAX_VALUE;
		int secmin=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<min){
				min=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=min){
				if(arr[i]<secmin){
					secmin=arr[i];
				}
			}
		}
		System.out.println(secmin+" & "+min);

/*--------------------------------------------------------------------------------------*/
//for kth minimun number 		
		int arr2[]=new int[5];
		Arrays.sort(arr);
		arr2[0]=arr[0];
		int z=1;
		int idx=3;
		for(int i=1;i<arr.length-1;i++){
			if(arr[i]!=arr[i-1]){
				arr2[z]=arr[i];
				z++;
			}
		}
		for(int x:arr2){
			System.out.print(x+" ");
		}
		System.out.println();
		
		for(int i=0;i<arr2.length;i++){
			if(idx==i){
				System.out.println(arr[i-1]);
			}
		}
	}
}