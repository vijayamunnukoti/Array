import java.util.Scanner;

public class ArrayConcepts {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
System.out.println("enter the size ");
int size=sc.nextInt();
int n[]=new int[size];
System.out.println("enter values");
{
	for(int i=0;i<size;i++)

n[i]=sc.nextInt();}
int max=0;int min=0;// up to this is user given range in array
for(int i=0;i<size;i++) {
	if(n[i]>max) {
		max=n[i];
	}
	else {
		min=n[i];
	}
}
System.out.println("max  "+ max  + "\n min  "+min);
	}

}
