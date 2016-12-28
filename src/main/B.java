package main;

public class B {
	
	private A a;
	
	public B(A a){
		this.a = a;
	}
	
	public int fooB(int value) throws Exception {
		return a.fooA() + value;
	}

	public int barB(int value) throws Exception {
		return a.barA(value) + fooB(value);
	}
	
}
