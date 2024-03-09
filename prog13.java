import java.util.Arrays;
class abc{
	public static void main(String[] args){
		int arr[]=new int[]{6,2,5,2,2,6,6};
		int k=3;
		Arrays.sort(arr);					 //O(N*log(N))
		for(int i=0;i<arr.length-1;i=i+k){			 //O(N)
			if(arr[i]!=arr[(i+k)-1]){
				System.out.println(arr[i]);
				break;
			}
		}
	}
}