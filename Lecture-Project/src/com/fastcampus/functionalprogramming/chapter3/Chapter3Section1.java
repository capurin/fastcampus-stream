package com.fastcampus.functionalprogramming.chapter3;

import java.util.function.Function;

import com.fastcampus.functionalprogramming.chapter3.util.Adder;

public class Chapter3Section1 {

	public static void main(String[] args) {
		Function<String, String> myAdder = new Adder();
		String result = myAdder.apply("5");
		System.out.println(result);
	}

}
