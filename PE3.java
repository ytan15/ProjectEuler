
public class PE3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long A=600851475143L;
		long B=2;
		while (A>B)
			{if (A%B==0)
				A/=B;
			else 
			B++;}
		System.out.println(A);
		
			
		
		// TODO Auto-generated method stub

	}

}
