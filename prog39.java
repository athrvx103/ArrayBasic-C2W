
class abc{
	public static void main(String[] args){
		int arr[]=new int[]{3,17,4,3,6,1,5};
		int X=arr[arr.length-1];
		
		for(int i=arr.length-1;i>=0;i--){
			if(arr[i]>X){
				System.out.print(X+" ");
				X=arr[i];
			}
			
		}
		System.out.print(X+" ");
		System.out.println();
	}
}