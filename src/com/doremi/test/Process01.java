package com.doremi.test;

import java.util.Arrays;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Process01 {

	// 引数のテキストファイルを読み、ソートされた英単語のみを出力する
	public static void main(String[] args) throws IOException {
		
		String regex = "^[a-z]+$";
		Pattern p = Pattern.compile(regex);
		
		List<String> words = new ArrayList<String>();
		
		BufferedReader br = new BufferedReader(new FileReader(args[0]));

		String line = null;
		while((line = br.readLine()) != null) {
//			System.out.println(line);
			
			String[] tokens = line.split("[ |\\.|:|,]");
			
			for (int i=0; i < tokens.length; ++i) {
				if ( tokens[i].length() > 0 && 0 > words.indexOf(tokens[i]) ) {
					String s = tokens[i].toLowerCase();
					
					Matcher m = p.matcher(s);
					if (m.find() && words.indexOf(s) < 0 ){
						words.add(s);
					}
					
				}
			}
		}
		
		br.close();
		
		String[] wordsArray = new String[words.size()];
		words.toArray(wordsArray);
		Arrays.sort(wordsArray);
		
		
		for (int i=0; i < wordsArray.length; ++i) {
			System.out.println(wordsArray[i]);
		}
	}

}
