package main;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SumToANum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target = 50;	// a specific number
		int[] arr = {1, 2, 4, 5, 20, 25, 30, 25, 40};	// a given array of ints 
		
		// HashMap<Number in the given array, count of the Number found>
		HashMap<Integer, Integer> intMap = new HashMap<>();
		for(int tmp : arr) {
			if(intMap.containsKey(tmp)) {
				intMap.put(tmp, intMap.get(tmp) + 1);
			}
			else {
				intMap.put(tmp, 1);
			}
		}
		
//		Set<Integer> numSet = new HashSet<>();
		// Find pairs which sum up to the specific number
		for(Integer tmpInt : intMap.keySet()) {
			Integer num = new Integer(Math.abs(Integer.valueOf(target) - tmpInt));
			// if tmpInt == num, check if the count is at least two.
			// if intMap.containsKey(Num), print
			if(intMap.containsKey(num)) {//&&
//					(numSet.add(tmpInt) || numSet.add(num))) {	// doesn't work becuz if add(tmpInt) return true, add(num) will be skipped.
//				boolean tmpIntBool = numSet.add(tmpInt);
//				boolean numBool = numSet.add(num);
//				if(tmpIntBool || numBool) {
					if((tmpInt.compareTo(num) != 0)) {
						System.out.println("(" + tmpInt.toString() + ", " + num + ")");
					}
					else {
						 if((intMap.get(tmpInt).compareTo(1) > 0)) System.out.println("(" + tmpInt.toString() + ", " + num + ")");
					}
//				}
//				else {
//					
//				}
				
			}
		}
//		System.out.println(numSet.toString());
		
	}

}
