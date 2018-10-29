package com.primitiveStreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadDataFromFile {
	public static void main(String[] args) throws IOException {
	Path path=Paths.get("C:\\Users\\Nisum\\Desktop\\gothru.txt");
	Stream<String> line=Files.lines(path);
	try {
		line.forEach(s -> System.out.println(s));
	} catch (Exception e) {
		System.out.println("Error");
	}
}
}
