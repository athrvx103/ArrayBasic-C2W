class abc{
	public static void main(String[] args){
		int arr[]=new int[]{1,4,20,3,10,5};
		int N=arr.length;
		int sum=33;
		int start=0;
		int end=0;
		int prefix[]=new int[N];
		prefix[0]=arr[0];
		for(int i=1;i<N;i++){
			prefix[i]=prefix[i-1]+arr[i];
		}
		for(int k=1;k<arr.length;k++){
			for(int j=k;j<N;j++){
				if(prefix[j]-prefix[k-1]==sum){
					start=k;
					end=j;
					break;
				}
			}
		}
		System.out.print("Sum of elements btwn inices"+start+" and "+end+ " is -->[ ");
		for(int x=start;x<=end;x++){
			System.out.print(arr[x]+" ");
		}
		System.out.print("]");
		System.out.println();
		
	}
}