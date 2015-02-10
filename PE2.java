
public class PE2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int sum=0;
	int a=1;
	int b=1;
	int c=a+b;
	while (c<4000000)
	{sum=sum+c;
	a=b+c;
	b=c+a;
	c=a+b;
	}
		
	

	System.out.println(sum);}
}
