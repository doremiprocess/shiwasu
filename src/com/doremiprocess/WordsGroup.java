package com.doremiprocess;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WordsGroup {

	private String head;
	private String[] words;
	private List<WordsGroup> childGroupsList;
	

	public WordsGroup(String[] words)
	{
		this.head = "";
		this.words = words;
		this.childGroupsList = new ArrayList<WordsGroup>();
	}

	private static class Info {
		int startIndex = -1;
		int endIndex = -1;
	}
	
	private Info detectFirstGroup()
	{
		Info info = null;
		
		String pref = "";
		
		for ( int i= 0; i < words.length; ++i ) {
			//TODO
		}
		
		return info;
	}
	
	
	public static void process(WordsGroup gr)
	{
		
	}
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(
								new FileReader("a.out"));
		
		
		List<String> list = new ArrayList<String>();
		
		
		String line = null;
		while ( null != (line = br.readLine())) {
			list.add(line);
		}
		
		br.close();
		
		String[] words = new String[list.size()];
		list.toArray(words);
		
		WordsGroup rootGr = new WordsGroup(words);
		
		WordsGroup.process(rootGr);
	}

}
