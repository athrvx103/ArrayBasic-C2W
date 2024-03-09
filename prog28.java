
import java.util.*;
class abc{
	public static void main(String[] args){
		HashSet s=new HashSet();
		int arr[]=new int[]{1,2,3,1,4};
		for(int i=0;i<arr.length;i++){
			s.add(arr[i]);
		}
		s.toArray();
		System.out.println(s);
	}
}