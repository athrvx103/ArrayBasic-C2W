class abc{
	public static void main(String[] args){
		int arr[]=new int[]{1,2,1,3,6,7};

		int max=Integer.MIN_VALUE;
		int secmax=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=max){
				if(arr[i]>secmax){
					secmax=arr[i];
				}
			}
		}
		int pro=secmax*max;
		System.out.println("The largest product of 2 elements -->"+ pro);
	}
}
