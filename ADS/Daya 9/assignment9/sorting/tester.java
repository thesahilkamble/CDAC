package sorting;

public class tester {

	static SortingAlgorithims bubble = new Bubble();
	static SortingAlgorithims selection = new Selection();
	static SortingAlgorithims insertion = new Insertion();
	

	public static void main(String[] args) {

		int arr[] = { 23,1,10,5,2 };
		bubble.sort(arr);
		bubble.display(arr);
		System.out.println();
		selection.sort(arr);
		selection.display(arr);
		System.out.println();
		insertion.sort(arr);
		insertion.display(arr);
	}

}
