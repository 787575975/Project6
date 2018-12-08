package array;

import java.util.Random;

public class UseRandom {
	public static void main(String[] args) {
		int [] list = new int[1000];
		Random random = new Random();
		for(int j=0; j<list.length; j++) {
			list[j] = random.nextInt(1000);
		}	
		for(int i=0; i<list.length; i++) {
            System.out.println(list[i]);
		}
	}
}
