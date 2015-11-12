import java.util.*;

public class Ex7 {
	
	public List<Integer> quicksort(List<Integer> list) {
		//Step 1: Initial action
		int size = list.size();
		if(size <= 1) {
			return list;
		}
		int pivot = list.get(0);
		
		//Step 2: Subproblem
		List<Integer> beforePivot = new ArrayList<Integer>();
		List<Integer> afterPivot = new ArrayList<Integer>();
		for(int i = 1; i < size; i++) {
			if(list.get(i) <= pivot) {
				beforePivot.add(list.get(i));
			} else {
				afterPivot.add(list.get(i));
			}
		}
		List<Integer> sortedBeforePivot = quicksort(beforePivot);
		List<Integer> sortedAfterPivot = quicksort(afterPivot);
		
		//Step 3: Integration
		List<Integer> output = new ArrayList<Integer>();
		output.addAll(sortedBeforePivot);
		output.add(pivot);
		output.addAll(sortedAfterPivot);
		return output;
	}
	
	public static void main(String[] args) {
		Ex7 test = new Ex7();
		test.launch();
	}
	
	private void launch() {
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(3);
		myList.add(1);
		myList.add(9);
		myList.add(5);
		myList.add(7);
		myList.add(11);
		List<Integer> sortedList = quicksort(myList);
		System.out.println(sortedList.toString());
	}
}