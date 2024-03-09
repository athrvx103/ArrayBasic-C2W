class abc{
	public static void main(String[] args){
		int arr[]=new int[]{9,12,23,10,12,12,15,23,14,12,15};
		int arr2[]=new int[arr.length];
		int temp=0;
		
		for(int i=0;i<arr.length;i++){
			temp=arr[i];
			int count=0;
			if(arr[i]!=0){
				for(int j=i;j<arr.length;j++){
					if(arr[j]==temp){
						arr[j]=0;
						count++;
					}
				}	
			}
			if(count!=0 && count%2==0){
				System.out.print(temp+" ");
			}
		}
		System.out.println();
		
	}
}