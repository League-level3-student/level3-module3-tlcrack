import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class PracticeTestAnswers {
	int swapper;

	public static void main(String[] args) {
		ArrayList<Knife> knives = new ArrayList<Knife>(5);
		for(int i = 0; i< knives.size(); i++) {
		}
		for(int i = 0; i< knives.size(); i++) {
			knives.get(i).cut();
		}
			
			
			HashMap<Integer, String> leagueStudents = new HashMap<Integer, String>(); 
			leagueStudents.put(135, "John Johnson");
			leagueStudents.put(36, "Harry Pangsong");
			leagueStudents.put(72, "Gary Goldstein");
		
		
		char[] stringy = new char[5];
		stringy[0]='a';
		stringy[1]='x';
		stringy[2]='r';
		stringy[3]='o';
		stringy[4]='l';
		if(contains(stringy, 'o')) {
			System.out.println("Yay");
		}
		ArrayList<String> toppings = new ArrayList<String>();
		toppings.add("Pepperoni");
		toppings.add("Pineapple");
		toppings.add("Olives");
		//7. Recursion is when a method calls itself, or when it calls
		// another method that calls the original.
		
		//8. implements
		
		//9. 1
		//   2
		//   3
	
		Stack<String> locations = new Stack<String>();
		locations.push("Home");
		locations.push("Grocery Store");
		locations.push("Gym");
		
		//11. The code to make an object does not work w/ an abstract class.
	
		Double[] doubles = {0.0, 1.1, 2.2, 3.3};
		/*15. Sorting algorithms:
		Bubble sort, heap sort, insertion sort, merge sort, quick sort,
		and selection sort
		*/
		
		//16. goat and animal 
		
		//18.    Linear Search   none
		//       Binary Search   must be sorted
		//Interpolation Search   must be uniformly distributed
		//  Exponential Search   must be sorted
	}

	public static boolean contains(char[] list, char c){
		
		for(int i = 0; i < list.length; i++) {
			if(list[i]==c) {
				return true;
			}
		}
		
		return false;
	}
	
	/*void drawTriangle(Robot[] r) {
		for(int i = 0; i < r.length; i++) {
			r[i].penDown();
			r[i].move(30);
			r[i].turn(120);
			r[i].move(30);
			r[i].turn(120);
			r[i].move(30);
			r[i].turn(120);
		}
	}*/
	
	int[] sortNumbers(int[] nums){
		for(int i=1;i<nums.length+1;i++) {
			if(nums[i]<nums[i-1]) {
				swapper = nums[i];
				nums[i] = nums[i-1];
				nums[i-1] = swapper;
			}
		}
		for(int i=1;i<nums.length+1;i++) {
			if(nums[i]<nums[i-1]) {
				sortNumbers(nums);
			}
		}
		
		return nums;
	}
	
	int[] evenAndOddSwapper(int[] nums) {
		for(int i = 1; i < nums.length; i+=2) {
			swapper = nums[i];
			nums[i] = nums[i-1];
			nums[i-1] = swapper;
		}
		return nums;
	}
	
	
	
	
}
	

