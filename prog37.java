
class abc{
	public static void main(String[] args){
		int arr[]=new int[]{-12,-3,9,-7,6,10,-11,74,5};
		int arr2[]=new int[arr.length];
		int z=0;
		int y=arr.length-1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<0){
				arr2[z]=arr[i];	
				z++;
			}else{
				arr2[y]=arr[i];
				y--;
			}
			
		}

		for(int x:arr2){
			System.out.print(x +" ");
		}
		System.out.println();
		
	}
}