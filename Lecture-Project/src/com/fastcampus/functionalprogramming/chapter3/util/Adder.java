package com.fastcampus.functionalprogramming.chapter3.util;

import java.util.function.Function;

public class Adder implements Function<String, String> {
								//   inputType, ReturnType
	public String apply(String x) {
		return x + "str";
	}
}
