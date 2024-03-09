
class abc{
	public static void main(String[] args){
		int arr[]=new int[]{3,4,2,1,5,3,4,7};
		
		int max=Integer.MIN_VALUE;;
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]>max){
				if(arr[i]>arr[i+1] && arr[i]>arr[i-1]){
					max=arr[i];
				}
			}
		}
		System.out.println(max);
	}
}