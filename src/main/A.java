package main;

public class A {

	public A(){
		
	}
	
	public int fooA() throws Exception {
		return 1;
	}

	public int barA(int value) throws Exception {
		return fooA() + value + 2;
	}
}
