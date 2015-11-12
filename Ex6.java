import java.util.*;

public class Ex6 {
	
	public List<Integer> mergesort(List<Integer> list) {
		if(list.size() == 0 || list.size() == 1) {
			return list;
		} else {
			int size = list.size();
			List<Integer> leftList = list.subList(0, (size / 2));
			List<Integer> rightList = list.subList((size / 2), size);
			
			List<Integer> sortedLeftList = mergesort(leftList);
			List<Integer> sortedRightList = mergesort(rightList);
				
			List<Integer> output = new ArrayList<Integer>();
			while(sortedLeftList.size() != 0 && sortedRightList.size() != 0) {
				if(sortedLeftList.get(0) <= sortedRightList.get(0)) {
					output.add(sortedLeftList.get(0));
					sortedLeftList = sortedLeftList.subList(1, sortedLeftList.size());
				} else {
					output.add(sortedRightList.get(0));
					sortedRightList = sortedRightList.subList(1, sortedRightList.size());
				}
			}
			if(sortedRightList.size() != 0) {
				output.addAll(sortedRightList);
			}
			if(sortedLeftList.size() != 0) {
				output.addAll(sortedLeftList);
			}
			return output;
		}
	}
	
	public static void main(String[] args) {
		Ex6 test = new Ex6();
		test.launch();
	}
	
	private void launch() {
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(9);
		myList.add(2);
		myList.add(5);
		myList.add(3);
		myList.add(10);
		myList.add(9);
		List<Integer> sortedList = mergesort(myList);
		System.out.println(sortedList.toString());
	}
}