class abc{
	public static void main(String[] args){
		int arr[]=new int[]{33,8,45,7,12,50};
		for(int i=0;i<arr.length-1;i++){
			int mid=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[mid]){
					mid=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[mid];
			arr[mid]=temp;
		}
		for(int x:arr){
			System.out.println(x);
		}
	}
}