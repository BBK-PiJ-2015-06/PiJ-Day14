import java.util.*;

public class Ex4 {
	public List<Integer> getSortedList(int listSize) {
		SortedSet<Integer> sorted = new TreeSet();
		List<Integer> sortedList = new ArrayList<Integer>();
		for(int i = 0; i < listSize; i++) {
			sorted.add((int)Math.abs(1000 * Math.random()));
		}
		for(int j = 0; j < sorted.size(); j++) {
			sortedList.add(sorted.first());
			sorted = sorted.tailSet((sorted.first() + 1));
		}
		return sortedList;
	}
	
	public boolean contains(int n, List<Integer> list) {
		if(list == null || list.size() == 0) {
			return false;
		} else if(list.get(list.size() / 2) == n) {
			return true;
		} else if(list.get(list.size() / 2) > n) {
			list = list.subList(0, (list.size() / 2)); 
			return contains(n, list);
		} else {
			list = list.subList(list.size() / 2), list.size());
			return contains(n, list);
		}
	}
	
	public static void main(String[] args) {
		Ex4 test = new Ex4();
		test.launch();
	}
	
	public void launch() {
		List<Integer> myList = getSortedList(15);
		System.out.println(myList.toString());
	}
}
