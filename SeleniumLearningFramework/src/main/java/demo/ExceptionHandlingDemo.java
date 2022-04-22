package demo;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		
		
		try {
			demo();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void demo() throws Exception
	{
//		try {
			System.out.println("Welcome in Exception Handling");
			//throw  new ArithmeticException("Inavalid");
			int i=1/0;
			
			//System.out.println("Completed");
//		}
//		catch(Exception e) {
//			System.out.println("Message : "+e.getMessage());
//			System.out.println("Cause : "+e.getCause());
//			e.printStackTrace();
//		}
//		finally {
//			System.out.println("Inside finally block");
//		}
	}

}
