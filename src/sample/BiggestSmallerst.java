package sample;

public class BiggestSmallerst {

	public static void main(String[] args) {
		int arr[]=new int[]{10,20,5,70};
		int sum=0;
		int biggest=0;
		int smallest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			if(arr[i]>biggest)
			{
				System.out.println("sum:"+sum);
				System.out.println("biggest:"+biggest);
				System.out.println("smallest:"+smallest);
			}
		}
	}

}
