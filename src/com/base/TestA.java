package com.base;

public class TestA {

	public int a =0;
	 public void fun(){
	        System.out.println("-----A-----");
	    }

	public static void main(String[] args) {
		TestA a = new B();
		System.out.println(a.a);
		a.fun();
		}
}
