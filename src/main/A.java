package main;

public class A {

	public A(){
		
	}
	
	public int fooA() throws Exception {
		throw new Exception();
	}

	public int barA(int value) throws Exception {
		return fooA() + value + 2;
	}
}
