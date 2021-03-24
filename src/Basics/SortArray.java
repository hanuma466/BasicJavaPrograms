package Basics;

public class SortArray {
	public static void main(String[] args) {
		post();
	}
	static void post() {
		
		int[] arr={7,1,1,2,0,1,0};
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
					
				}//System.out.println();
			}
			//System.out.println();
		}
		printarray(arr);
	}

	
	static void printarray(int[] arr) {
		for(int i:arr) {
			System.out.print(i);
		}
	}


}
