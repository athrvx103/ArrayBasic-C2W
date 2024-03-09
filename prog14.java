import java.util.*;
class abc {
	public static void main(String[] args){
		int arr[]=new int[]{2,2,2};
		int k=3;
		int i=0;
		int count=0;
		int itr=0;
		int temp=0;
		int max=Integer.MIN_VALUE;
		for(;i<arr.length;i++){
			if(arr[itr]!=max){
				temp=arr[itr];
			}
			if(arr[i]==temp){
				arr[i]=max;
				count++;
			}
			if(i==arr.length-1){
				if(count!=0 && count!=k){
					System.out.println(temp);
					break;
				}
				
				itr++;
				if(itr<arr.length-1){
					i=0;
				}else{
					break;
				}
				count=0;
			}

		}
		if(count==0){
			System.out.println("element not in array");
		}
	}
}