public MultipleCatch {
	public static void main(String[] args) {
		try 
		{
			int a[] = new int[5];
			a[5] =30/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs.");

		}
		catch(ArraryIndexOutOfBondsException e) {
			System.out.println("Array Index Out of bounds exception occurs.");
		}
		catch(Exception e) {
			System.out.println("parents exception occurs.");
		}
	}System.out.println("rest of the code.");
}