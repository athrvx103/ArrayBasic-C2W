//find the largest element
class abc{

	static int largEle(int arr[]){
		int max=Integer.MIN_VALUE;;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
			
		}
		return max;
	}
	public static void main(String[] args){
		int arr[]=new int[]{1,5,8,72,41};
		
		int largeEle=largEle(arr);
	
		System.out.println("Maximum element of array -> "+largeEle);
	}
}