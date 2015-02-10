
public class PE5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=2*3*5*7*11*13*17*19;
		while (i%2!=0)
			i*=2;
		while (i%3!=0)
			i*=3;
		while (i%4!=0)
			i*=2;
		while (i%5!=0)
			i*=5;
		while (i%6!=0)
			{if (i%9!=0)
				i*=3;
			else i*=2;}
		while (i%8!=0)
			i*=2;
		while (i%9!=0)
			i*=3;
		while (i%10!=0)
		{if (i%25!=0)
			i*=5;
		else i*=2;}
		while (i%12!=0)
		{if (i%9!=0)
			i*=3;
		else i*=2;}
		while (i%14!=0)
		{if (i%7!=0)
			i*=7;
		else i*=2;}
		while (i%15!=0)
		{if (i%5!=0)
			i*=25;
		else i*=3;}
		while (i%16!=0)
			i*=2;
		while (i%18!=0)
		{if (i%27!=0)
			i*=3;
		else i*=2;}
		while (i%20!=0)
		{if (i%25!=0)
			i*=5;
		else i*=2;}
		System.out.print(i);
	}

}
