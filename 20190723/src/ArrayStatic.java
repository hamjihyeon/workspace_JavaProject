
public class ArrayStatic {
	public static int[] concat(int[] a, int[] b) {
		int tmp[] = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			tmp[i] = a[i];
		} 
		for (int i = 0; i < a.length + b.length; i++) {
			tmp[i] = b[i - a.length];
		}
		return tmp;

	}

	public static void print(int[] a) {
		System.out.println("[");
		for (int i = 0; i < a.length; i++) {
			System.out.println(" " + a[i] + " ");
		}
		System.out.println("]");
	}

	public static void main(String[] args) {

	}

}
