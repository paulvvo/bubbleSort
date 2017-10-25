package bubbleSort;

public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] testArray = {32, 53, 7,1,8,2,4,21,64,17,45,32};
		sort(testArray);
		
	}
	
	public static void sort(int[] unsorted) {
		
		
		
		for(int i=0; i<unsorted.length; i++) {
			int flag = 1;
			for(int j=0; j<unsorted.length-1; j++) {
				//check current and next
				if(unsorted[j] > unsorted[j+1]) {
					int temp = unsorted[j];
					unsorted[j] = unsorted[j+1];
					unsorted[j+1] =temp;
					flag = 0;
				}
			}
			if(flag ==1) {
				break;
			}
		}
		for(int p=0; p<unsorted.length;p++) {
			System.out.println(unsorted[p]);
		}
	}

}
