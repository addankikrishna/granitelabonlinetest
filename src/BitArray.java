import java.util.Scanner;

public class BitArray {
	public static void main(String[] args) {
		
	try {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter array lenght:");
		int len=scan.nextInt();
		int arr[]=new int[len];
		System.out.println("Enter  number for  finding duplicate number");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		BitArray1.checkDuplicates(arr);
		
	} 
	catch (Exception e) {
	     System.out.println(e);
	}
		
	}

}
