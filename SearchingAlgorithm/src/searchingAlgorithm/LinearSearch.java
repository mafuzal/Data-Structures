package searchingAlgorithm;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataSet data = new DataSet(1000000);
		int Search = 999999;
		Boolean IsFound = false;
		for(int i=0;i<data.getSize();i++) {
			data.NumberTry++;
			if(data.data[i] == Search) {
				System.out.println("Element is found after try " + data.NumberTry);
				IsFound = true;
				break;
			}
		}
		 if(IsFound == false) {
			 System.out.println("Element is not found or outside RANGE");
		 }

	}

}
