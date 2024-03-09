/*
Find the min and max
*/
class abc{
	public static void main(String[] args){
		int arr[]=new int[]{1,5,8,72,41};
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println("Minimum element of array -> "+min);
	
		System.out.println("Maximum element of array -> "+max);
	}
}