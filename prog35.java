import java.util.*;
class abc{
	public static void main(String[] args){
		int arr[]=new int[]{3,4,2,1,5};
		Arrays.sort(arr);
		int mult=1;
		int k=3;
		for(int i=0;i<k;i++){
			mult=mult*arr[i];
		}
		System.out.println(mult);
	}
}