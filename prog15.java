import java.util.Arrays;
class abc{
	public static void main(String[] args){
		int arr[]=new int[]{1,2,3,4,5};
		Arrays.sort(arr);			//O(N*log(N))
		int temp=0;
		for(int i=0;i<=arr.length-1;i=i+2){	//O(logN)
			if(i==arr.length-1){
				temp=temp+arr[i];
				break;
			}
			if(arr[i]!=arr[i+1]){	
				temp=temp+arr[i]+arr[i+1];
			}
			
		}
		System.out.println(temp);
	}
}