package BasicJavaPrograms;

public class javaClassMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		myStatciMethod();
		javaClassMethods obj = new javaClassMethods();
		obj.myPublicMethod();
//		myPrivateMethod();
//		myProtectedMethod();
	}

	static void myStatciMethod()
	{
		System.out.println(" This is static method");
	}
	
	public void myPublicMethod()
	{
		System.out.println(" This is public method");
	}
	
	private void myPrivateMethod()
	{
		System.out.println(" This is private method");
	}
	
	protected void myProtectedMethod()
	{
		System.out.println(" This is protected method");
	}
	
//	static void myStatciMethod()
//	{
//		System.out.println(" This is static method");
//	}
	
}
