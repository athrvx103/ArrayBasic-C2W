class abc{
	public static void main(String[] args){
		int arr[]=new int[]{1,10,6,7,9,8,2,1,4,5,6};
		int X=7;
		int ceiling=Integer.MAX_VALUE;
		int floor=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<X){
				if(arr[i]>floor){
					floor=arr[i];
				}
			}else if(arr[i]>X){
				if(arr[i]<ceiling){
					ceiling=arr[i];
				}
			}
		}
		System.out.println(ceiling);
		System.out.println(floor);
		
	}
}