package sample;

public class binarynuumber0and1 {

	public static void main(String[] args) {
		int arr[]=new int[] {1,0,1,0,1,0,1};
		int temp[]=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==1)
			{
				temp[j]=1;
				j++;
			}
		}
		for(int value:temp)
		{
			System.out.println(value);
		}
	}
}