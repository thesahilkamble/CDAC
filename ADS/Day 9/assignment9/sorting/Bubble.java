package sorting;

public class Bubble implements SortingAlgorithims {

	@Override
	public void sort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}

	@Override
	public void display(int arr[]) {
		for (int n : arr) {
			System.out.print(n + " ");
		}
	}

}
