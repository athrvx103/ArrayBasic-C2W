class abc{
	public static void main(String[] args){
		int A[] = new int[]{5,7,9,3,6,2};
		int B[]=new int[]{1,2,6,-1,0,9};
		
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<A.length;i++){
			if(A[i]>max){
				max=A[i];
			}
		}
		for(int i=0;i<B.length;i++){
			if(B[i]<min){
				min=B[i];
			}
		}
		
		System.out.println("Product ->"+(max*min));
	}
}