class abc{
	public static void main(String[] args){

		int arr[]=new int[]{9,0,1,3,0};
		int k=0;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			for(int j=i;j<arr.length;j++){
				if(arr[i]>max){
					max=arr[i];
				}
			}
			arr[k]=max;
			k++;	
		}	
		for(int x:arr){
			System.out.print(x+" ");
		}
		System.out.println();
	}
}