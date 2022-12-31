package rough;

public class Test1 {

	public static void main(String[] args) {
		System.out.println(check());

	}

	public static boolean check() {
		int a = 10;

		try {
			if (a < 50) {
				return true;
			}

			else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}

}
