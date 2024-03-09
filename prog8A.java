
class abc{
	public static void main(String[] args){
		int arr[]=new int[]{9,12,23,10,12,12,15,23,14,12,15};
		int arr2[]=new int[arr.length];
		int temp=0;
		int itr=0;
		int count=0;
		int avoid=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[itr]!=avoid){
				temp=arr[itr];
			}
			if(arr[i]==temp){
				arr[i]=avoid;		
				count++;
			}
			if(i==arr.length-1){
				if(count!=0 && count%2==0){
					count=0;
					System.out.print(temp+" ");
				}
				itr++;
				count=0;
				if(itr<arr.length-1){
					i=0;
				}else{
					break;
				}
			}
		}
		System.out.println();
	}
}