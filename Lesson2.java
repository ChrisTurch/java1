/**
 * Java. Level 1. Lesson 2. Homework
 *
 * @author Christina Turchina
 * @version dated Nov 26, 2018
 */
public class Lesson2 {
	public static void main(String[] args) {
		// task 1
		int[] a1 = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
		int[] a2 = { 1, 1, 1, 1, 1, 1 };
		int[] a3 = { 0, 0, 1, 0, 0 };
		inventArray(a1);
		inventArray(a2);
		inventArray(a3);
		// task 2
		fillArray();
		// task 3
		changeArray();
		// task 4
		fillDiagonal(2);
		fillDiagonal(5);
		fillDiagonal(8);
		// task 5
		int[] b1 = { 0, 3, 5, 16, 35, 11, 2, -8 };
		int[] b2 = { -100, -200, -80, -35 };
		int[] b3 = { 0, -8, -9, -20 };
		System.out.println(findMax(b1));
		System.out.println(findMax(b2));
		System.out.println(findMax(b3));
	}

	static void inventArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		// First array
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 1) {
				array[i] = 0;
			} else {
				array[i] = 1;
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		// Modified array
		System.out.println();
	}

	static void fillArray() {
		int[] array = new int[8];
		for (int i = 0; i < 8; i++) {
			array[i] = i * 3;
		}
		for (int i = 0; i < 8; i++) {
			System.out.print(array[i] + " ");
		}

	}

	static void changeArray() {
		int[] array = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 6) {
				array[i] = array[i] * 2;
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	static void fillDiagonal(int n) {
		int[][] array = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					array[i][j] = 1;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

	static int findMax(int[] array) {
		int maxel = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maxel) {
				maxel = array[i];
			}
		}
		return maxel;
	}
}
