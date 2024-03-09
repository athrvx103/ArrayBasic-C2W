//22]Exceptionally odd
import java.util.*;
class abc{
	public static void main(String[] args){
		int arr[]=new int[]{1,2,3,2,3,1,3};
		HashMap<Integer,Integer>obj=new HashMap<>();
		int val=obj.get(arr[2]);
		obj.put(arr[2],val+1);
		System.out.println(obj);
		/*for(int i=0;i<arr.length;i++){
			if(obj.containsKeys(arr[i])){
				
			}
		}*/
	}
}