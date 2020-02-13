public class tryCatch {
	public static void main(String[] args) {
		try 
		{
			int data = 50/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		System.out.println("rest of the code.");

			
	}
}