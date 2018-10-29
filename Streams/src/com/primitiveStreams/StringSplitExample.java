package com.primitiveStreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class StringSplitExample {

	public static void main(String[] args) throws IOException {
		String str=  "abc,4dh,7jjj";
		Pattern.compile(",").splitAsStream(str).forEach(s -> System.out.println(s));
		
		
		
		

	}

}
