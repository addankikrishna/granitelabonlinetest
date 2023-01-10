
public class BitArray1 {
	
	private int n;
	public BitArray1(int n)
	{
		this.setN(n);
	}
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	static void checkDuplicates(int [] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate numbers are:"+arr[i]);
				}
			}
		}
	}


}
