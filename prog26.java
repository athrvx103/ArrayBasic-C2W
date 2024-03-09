class abc{
	public static void main(String[] args){
		int arr[]=new int[]{-1,2,-3,4,-5,6,-7,8};
		int N=arr.length;
		int arr2[]=new int[(N+1)/2];
		int arr3[]=new int[arr2.length];
		int x=0;
		int y=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>0){
				arr2[x]=arr[i];
				x++;
			}
			else if(arr[i]<0){
				arr3[y]=arr[i];
				y++;
			}
		}
		for(int z:arr2){
			System.out.print(z+" ");
		}
		System.out.println();		
		for(int z:arr3){
			System.out.print(z+" ");
		}
		System.out.println();	
	}
}