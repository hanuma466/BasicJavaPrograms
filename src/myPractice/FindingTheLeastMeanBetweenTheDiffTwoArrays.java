package myPractice;

public class FindingTheLeastMeanBetweenTheDiffTwoArrays {
	public static void main(String[] args) {
		//3-9=6
		//3-5=2
		//3-6=3
		//7-9=2
		//7-5=2
		//7-6=1
		
		//answer is 1 lowest mean
		
		int[] a={3,7,2};
		int[] b={9,5,6};
		int first=0;
		int second=0;
		int diff=1000;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++){
				if(a[i]>b[j]){
					if((a[i]-b[j])<diff){
						first=a[i];
						second=b[j];
						diff=a[i]-b[j];
					}
			}
			if(a[i]<b[j]){
				if((b[j]-a[i])<diff){
					first=a[i];
					second=b[j];
					diff=b[j]-a[i];
				}
			}
			}
		
	}System.out.println(first +" - "+second+" ="+diff);
}
}
