class abc{
	public static void main(String[] args){
		int arr[]=new int[]{1,3,3,4};
		int X=6;
		int first=-1;
		int last=-1;
		for(int i=0;i<arr.length;i++){
			if(first!=-1 && arr[i]==X){
				last=i;
			}
			if(first==-1 && arr[i]==X){
				first=i;
				last=i;
			}
		}
		if(first==-1){
			System.out.println("Element not present in array !!");
		}else{
			System.out.println("First occurence -> "+first);
			System.out.println("Last occurence -> " + last);
		}
	}
}