
public class PalindromicCalculator {
	int i;
	int n;

	public void calculate() {

		for (int i = 0; i <= 1_000_001; i++) {
			String j = Integer.toString(i);
			StringBuilder k = new StringBuilder(j);
			k.reverse();
			String l = new String(k);
			int m = Integer.parseInt(l);

			if (i == m) {

				n += i;

			}

			else {

			}

		}
		System.out.println(n);
	}

}
