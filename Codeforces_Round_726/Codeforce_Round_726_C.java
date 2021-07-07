package com.algo.day210618;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Codeforce_Round_726_C {

	private static int inputN;
	private static ArrayList<Integer> heights = new ArrayList<>();
	
	private static void mySolve() {
		
		ArrayList<Integer> results = new ArrayList<>();
		
		Collections.sort(heights);
		
		int firstIdx = -1;
		int minDiff = Integer.MAX_VALUE;
		
		for(int i = 0; i < inputN-1; ++i) {
			
			int diff = heights.get(i+1) - heights.get(i);
			if(diff < minDiff) {
				minDiff = diff;
				firstIdx = i;
			}
			
		}
		
		results.add(heights.get(firstIdx));
		for(int i = firstIdx + 2; i < inputN; ++i) {
			results.add(heights.get(i));
		}
		for(int i = 0; i < firstIdx; ++i) {
			results.add(heights.get(i));
		}
		results.add(heights.get(firstIdx+1));
		
		for(int i = 0; i < results.size(); ++i) {
			System.out.print(results.get(i) + " ");
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int testCase = Integer.parseInt(br.readLine().trim());
		while(testCase-- > 0) {
			
			inputN = Integer.parseInt(br.readLine());
			heights.clear();
			StringTokenizer st = new StringTokenizer(br.readLine().trim(), " ");
			for(int i = 0; i < inputN; ++i) {
				heights.add(Integer.parseInt(st.nextToken()));
			}
			
			mySolve();
			
		}
		
	}

}
