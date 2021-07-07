package ExceptionHandlingDemo;

public class UserDefinedExceptions {

	public static void main(String[] args) {
		int i=10;
		
		try {
			if(i==8)
				throw new Exception("Error...");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		try {
			if(i>8)
				throw new MyException("user defined exception");
		}catch(MyException e) {
			e.printStackTrace();
		}
		
		finally {
			System.out.println("done");
		}
		
	}
}

class MyException extends Exception{
	MyException(String msg){
		System.out.println("user defined exception");
	}
}
