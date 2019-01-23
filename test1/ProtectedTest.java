package test1;

import test.test1;

public class ProtectedTest {
	protected int a = 5;
	protected int getA() {
		return a;
	}
	//static father f = new father();
	private jb j1;
	public static void main(String[] args) throws CloneNotSupportedException {
		sun s = new sun();
		s.clone();
		ProtectedTest p = new ProtectedTest();
		p.clone();
		jb j = new jb();
		//j.clone();
		test1 t = new test1();
		t.clone();
	}
	public void pt() {
		//j1.clone();
	}
}

class sun extends ProtectedTest {
}

class jb {
}