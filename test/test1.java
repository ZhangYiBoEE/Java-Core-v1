package test;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import test1.ProtectedTest;

public class test1 extends ProtectedTest{
	int getB(){
		return a;
	}
	public static void main(String[] args) {
		List<String> a = new LinkedList<>();
		a.add("A");
		System.out.println(a);
	}
	
}
