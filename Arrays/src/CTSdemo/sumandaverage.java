package CTSdemo;

public class sumandaverage {
	public static void main(String[] args)
	{
		int a[]= {10,20,30,40};
		int i,sum=0,avg=0;
		for(i=0;i<=3;i++)
		{
			sum=sum+a[i];
		}
		avg=sum/i;
		System.out.println(sum);
		System.out.println(avg);
	}
}
