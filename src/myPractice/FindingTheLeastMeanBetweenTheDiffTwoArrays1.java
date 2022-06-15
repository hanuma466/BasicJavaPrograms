package myPractice;

public class FindingTheLeastMeanBetweenTheDiffTwoArrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={3,7,2};
		int[] b={9,5,6};
		int One=0;
		int Two=0;
		int diff=1000;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++){
				if(a[i]>b[j]){
					if((a[i]-b[j])<diff){
						One=a[i];
						Two=b[j];
						diff=a[i]-b[j];
					}
			}
			if(a[i]<b[j]){
				if((b[j]-a[i])<diff){
					One=a[i];
					Two=b[j];
					diff=b[j]-a[i];
				}
			}
			}
		
	}
		
		System.out.println(One +" - "+Two+" ="+diff);
}



	}


