package com.jobiak.ioc3;
public class B {
public void printingDesign() {
	A a = new A();//dependancy
	//1.they cause maintanance nightvare
	a.print();//2. Testing- mock objects(A)go and test B
	//Againist Azile Methodology
	//decouples the dependencies through interfaces,there by the classes are loosely coupled
}
}
