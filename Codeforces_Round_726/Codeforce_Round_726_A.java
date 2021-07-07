package com.algo.day210618;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Codeforce_Round_726_A {

	private static int inputN, sum;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testCase = Integer.parseInt(br.readLine().trim());
		while(testCase-- > 0) {
			
			inputN = Integer.parseInt(br.readLine().trim());
			sum = 0;
			StringTokenizer st = new StringTokenizer(br.readLine().trim(), " ");
			for(int i = 0; i < inputN; ++i) {
				sum += Integer.parseInt(st.nextToken());
			}
			
			if(sum >= inputN)
				System.out.println(sum-inputN);
			else
				System.out.println(1);
			
		}

	}

}
