package com.flatMapEx;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StartWith {

	public static void main(String[] args) {
		List<String> li = Arrays.asList("henk","heroku","hexagon","dfkh","hdhd");
		li.stream().flatMap(s -> Stream.of(s.startsWith("he"))).forEach(s-> System.out.println(s));
		li.stream().filter(s -> "henk".equals(li.get(0))).forEach(s -> System.out.println(s));
 	}

}
