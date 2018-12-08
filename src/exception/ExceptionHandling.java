package exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		int num1 = 10;
		//try start here
		try {
		   int result = num1/0;
		   System.out.println(result);
		}catch(Exception ex){
			//ex.printStackTrace();
			System.out.println("You are not allowed to divide a number by zero, better learn Math");
		}
		//try block ends here
		System.out.println("Where is my result");
	}

}
