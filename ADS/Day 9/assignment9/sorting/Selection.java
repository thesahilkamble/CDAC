package sorting;

public class Selection implements SortingAlgorithims {

	@Override
	public void sort(int[] arr) {
		for(int i = 0; i<arr.length; i++)
		{
			int minIndex = i;
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[j]<arr[minIndex]) {
					minIndex++;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i]=temp;
		}
		
	}

	@Override
	public void display(int arr[]) {
		for (int n : arr) {
			System.out.print(n + " ");
		}
	}


}
