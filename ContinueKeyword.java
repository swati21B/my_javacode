package java_Code;

public class ContinueKeyword {

	public static void main(String[] args) {
		//continue keyword in java is used to skip particular iteration for for or while loop 
		//and continue to the next iteration.
		for(int i=0;i<=10;i++)
		{
			if(i==5)
			{
			continue;
			}
			System.out.println("\nobserve 5 is skipped->"+i);
		}
		int j =1;
		while(j<10)
		{
			if(j==8)
			{
				j++;
				continue;//skip the iteration for specified condition
			}
			System.out.println("\n 8 has been skipped->"+j);
			j++;
		}

	}

}
