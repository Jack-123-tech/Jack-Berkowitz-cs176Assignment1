
public class Arraytest {

	private static int[] numbers;

	public static void main(String[] args) {
		numbers = new int[] {17,-1,-1,-1,-1,-1,-1,-1,-1,29};
	numbers[0]++;
		numbers[1]++;
		numbers[2]++;
		numbers[3]++;
		numbers[4]++;
		numbers[5]++;
		numbers[6]++;
		numbers[7]++;
		numbers[8]++;
		numbers[9]++;
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		System.out.println(numbers[5]);
		System.out.println(numbers[6]);
		System.out.println(numbers[7]);
		System.out.println(numbers[8]);
		System.out.println(numbers[9]);
		
		System.out.println(java.util.Arrays.toString(numbers));
	}

}
