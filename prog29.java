class abc{
	public static void main(String[] args){
		String s=new String("000100");
		char arr[]=new char[s.length()];
		int flag=0;
		for(int i=0;i<arr.length;i++){
			arr[i]=s.charAt(i);
		}
		for(int i=arr.length-1;i>=0;i--){
			if(arr[i]=='1'){
				System.out.println(i);
				flag=1;
				break;
			}
		}
		if(flag==0){
			System.out.println("-1");
		}
	}
}