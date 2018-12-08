package array;

import java.util.Scanner;

public class UseArray {

	public static void main(String[] args) {
		int [] list = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Plz enter some integer value: ");
		for(int j=0; j<list.length; j++) {
			list[j] = sc.nextInt();
		}
		for(int i=0; i<list.length; i++) {
            System.out.println(list[i]);
		}
		sc.close();
	}

}
