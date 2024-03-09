//20]check if pair with given sum exists in arrays(2 sum) 
class abc{
	public static void main(String[] args){
		int arr[]=new int[]{0,-1,2,-3,1};
		int x=-2;
		for(int i=0;i<arr.length;i++){
			for(int j=i;j<arr.length;j++){
				if(arr[i]+arr[j]==x && i!=j){
					System.out.println("yess--> "+i+ " & "+j);
				}
			}
		}
	}
}