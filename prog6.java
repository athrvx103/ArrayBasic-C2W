class abc{
	public static void main(String[] args){
		int arr[]=new int[]{4,4,2,5,3,8,3};
		int N=7;
		int A=2;
		int B=5;
		int count=0;
		int range=(B-A)+1;

		int i=0;
		for(;i<N;i++){
			if(A>B){
				break;
			}
			if(arr[i]==A){
				count++;
				A++;
				i=0;
			}
		}
		System.out.println(count);
		if(count==range){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}