import java.util.*;
class abc{
	public static void main(String[] args){
		int arr[]=new int[]{3,4,2,1,5};
		int arr2[]=new int[]{4,4,2,0,4};
		int count1=0;
		int count2=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>arr2[i]){
				count1++;
			}else if(arr[i]<arr2[i]){
				count2++;
			}else{
				count1++;
				count2++;
			}
		}
		if(count1>count2){
			System.out.println("Country A won");
		}else if(count1<count2){
			System.out.println("Country B won");
		}else{
			System.out.println("Both countries lost");
		}
	}
}