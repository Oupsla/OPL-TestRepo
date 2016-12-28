package main;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	A a = new A();
    	B b = new B(a);
    	
	    int result = b.fooB(5);
        System.out.println(result);
 
    }
}
