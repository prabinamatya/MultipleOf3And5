package prabin.practice.java.main;

public class Multiple3and5 {

	public int sumOfMultiplesOf3And5() {
		int sum = 0;
		for(int i = 0; i <10; i++ ) {
			if((i % 3 ==0) || (i % 5 == 0)) {
				sum = sum + i;
			}
		}
		return sum;
	}

}
