package sorting;

public class Insertion implements SortingAlgorithims {

	@Override
	public void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int key = arr[i];
			int j = i-1;
			
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}

	}

	@Override
	public void display(int arr[]) {
		for (int n : arr) {
			System.out.print(n + " ");
		}
	}

}
