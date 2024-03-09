class abc{
	public static void main(String[] args){
		int arr1[]=new int[]{1,5,10,20,40,80};
		int arr2[]=new int[]{6,7,20,80,100};
		int arr3[]=new int[]{3,4,15,20,30,70,80,120};
		int p=arr1.length;
		int q=arr2.length;
		int r=arr3.length;

		int temp[]=new int[10];
		int i=0;
		int j=0;
		int k=0;
		int x=0;
		while(true){
			if(arr1[i]<arr2[j]){
				i++;
			}else if(arr1[i]>arr2[j]){
				j++;
			}
			if(arr1[i]==arr2[j]){
				if(arr3[k]==arr1[i] || arr3[k]==arr2[j]){
					temp[x]=arr3[k];
					x++;
					k++;
					i++;
					j++;
				}else{
					k++;
				}
			}
			if(i==arr1.length){
				break;
			}
		}
		for(int z=0;z<temp.length;z++){
			if(temp[z]!=0){
				System.out.print(temp[z]+" ");
			}
		}
		System.out.println();
	}
}