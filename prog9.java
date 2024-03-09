class abc{
	public static void main(String[] args){
		int arr[]=new int[]{1,2,3,4,5};
		int N=5;
		int indexR=2;
		for(int i=0;i<arr.length;i++){
			if(i==indexR){
				arr[i]=0;
				continue;
			}else{
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		for(int i=0;i<arr.length-1;i++){
			if(i>=indexR){
				arr[i]=arr[i+1];
				System.out.print(arr[i]+" ");
			}else{
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		
	}
}