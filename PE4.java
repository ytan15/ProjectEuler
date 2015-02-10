
public class PE4 {
	public static void main(String[] args) {
			int max = 0;
			for (int i = 100; i < 1000; i++) {
				for (int j = 100; j < 1000; j++) {
					int k = i * j;
					String z = String.valueOf(k);
					if (new StringBuffer(z).reverse().toString().equals(z) && k > max) {
						max = k;
					}
				}
			}
			System.out.println(max);
		}

	}
