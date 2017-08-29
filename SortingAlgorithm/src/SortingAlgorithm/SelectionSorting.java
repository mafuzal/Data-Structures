package SortingAlgorithm;

public class SelectionSorting {
	static void SelectionSorting(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) {
					if (arr[j] < arr[index])
						index = j;
				}
				if(index!=i) {
					int temp = arr[index];
					arr[index] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,50,30,10,60,80};
		System.out.println("Before Sort");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
			
		}
		SelectionSorting(arr);
		System.out.println("\nAfter Sort");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
			
		}
			
	}
}

