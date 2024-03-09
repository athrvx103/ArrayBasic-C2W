class abc{
	public static void main(String[] args){
		int arr[]=new int[]{1,10,6,7,9,8,2,1,2,5,6};
		int X=4;
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<X){
				if(arr[i]>max){
					max=arr[i];
				}
			}else if(arr[i]>X){
				if(arr[i]<min){
					min=arr[i];
				}
			}
		}
		if(X-max<min-X){
			System.out.println(max);
		}else{
			System.out.println(min);
		}
	}
}