package searchingAlgorithm;
//Very Fast ~ Not Standard For Every Case
public class InterpolationSearch {
	public static void main(String[] args) {
		DataSet data = new DataSet(1000000);
		int Search = 999999;
		Boolean IsFound = false;
		int low = 0;
		int high = data.getSize()-1;
		int mid = 0;
		while(!IsFound) {
			if(low>high) {
				System.out.println("Number is not found");
			}
			mid = low+((high-low)/(data.data[high]-data.data[low]))*(Search-data.data[low]);
			data.NumberTry++;
			if(data.data[mid]==Search) {
				System.out.println("Number is found after " + data.NumberTry + " try.");
				break;
			}
			if(data.data[mid]<Search) {
				low = mid + 1;
			}
			if(data.data[mid]>Search) {
				low = mid - 1;
			}
		}
				
	}

}
