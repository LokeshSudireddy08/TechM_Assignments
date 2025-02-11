package sample;

public class task1 {
	public static void main(String args[]) {
		int[] arr= {1,2,3,4,5,6,7,8};
		int size=(arr.length+1)/2;
		int[] newarr=new int[size];
		int j=0;
		for(int i=0;i<arr.length;i+=2) {
			newarr[j++]=arr[i];
		}
		for(int i=0;i<newarr.length;i++) {
			System.out.println(newarr[i]);
		}
	}
}
