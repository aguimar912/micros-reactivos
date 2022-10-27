package ejemplo;

import java.util.List;

public class App {

	public static void main(String[] args) {
	
		List<Integer> numbers = List.of(18, 6, 4, 15, 55, 78, 12, 9, 8);
		
		//Esto sería sin programacion funcional:
		int count = 0;
		for(int number: numbers) {
			if(number > 10) count ++;
		}
		
		//long count = numbers.stream().filter(num -> num>10).count();

		
		System.out.println(count);
	}

}
