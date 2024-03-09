
class abc{
	public static void main(String[] args){
		int arr[]=new int[]{3,4,2,1,5};
		int A=4;
		int B=5;
		int x=0;
		int y=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==A){
				x=i;
			}
			if(arr[i]==B){
				y=i;
			}

		}
		System.out.println("The total number between "+A+" & "+B+" are --> "+(y-(x+1)));
	}
}