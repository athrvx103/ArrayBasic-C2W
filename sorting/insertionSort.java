class abc{
	public static void main(String[] args){
		int arr[]=new int[]{2,10,60,3,5,77,18};
		for(int i=0;i<arr.length;i++){
			int ele=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>ele){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=ele;
		}
		for(int x:arr){
			System.out.println(x);
		}
	}
}