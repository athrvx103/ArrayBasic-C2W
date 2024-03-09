/*
Search a given element and return index

*/
import java.util.*;
class abc{
	static int arr[]=new int[]{1,2,3,4,5};
	static int data=0;
	static int flag=0;
	static int index(int arr[]){
		int i=0;
		
		for(;i<arr.length;i++){
			if(data==arr[i]){
				flag=1;
				break;
			}
		}
		return i;
	}
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element to search!!");
		data=sc.nextInt();
		int idx=index(arr);
		if(flag==1){
			System.out.println("Value present at index -> "+idx);
		}else{
			System.out.println("No valid value present!!");
		}
		
		
	}
}