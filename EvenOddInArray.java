import java.util.Scanner;

public class EvenOddInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size ");
		int size=sc.nextInt();
		int n[]=new int[size];
		System.out.println("enter values");
		{
			for(int i=0;i<size;i++)

		n[i]=sc.nextInt();
		}
	for(int i=0;i<size;i++) 
	{
		int[] n1;
		if( n[i]%2==0) {
			System.out.println("the given num is even"+n[i]  );
		}}
		for(int i2=0;i2<size;i2++) 
		{
			int[] n2;
			if( n[i2]%2!=0) {
				System.out.println("the given odd  num is "+n[i2]  );
			}
}
		}}