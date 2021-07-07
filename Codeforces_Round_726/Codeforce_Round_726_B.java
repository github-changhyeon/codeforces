package com.algo.day210618;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Codeforce_Round_726_B {
	
	private static int inputR, inputC, posR, posC;
	
	private static void mySolve() {
		
		int maxDiff = -1;
		int maxR = -1;
		int maxC = -1;
		
		if(posR-1 + posC-1 > maxDiff) {
			maxDiff = posR-1 + posC-1;
			maxR = 1;
			maxC = 1;
		}
		if(posR-1 + inputC-posC > maxDiff) {
			maxDiff = posR-1 + inputC-posC;
			maxR = 1;
			maxC = inputC;
		}
		if(inputR-posR + posC-1 > maxDiff) {
			maxDiff = inputR-posR + posC-1;
			maxR = inputR;
			maxC = 1;
		}
		if(inputR-posR + inputC-posC > maxDiff) {
			maxDiff = inputR-posR + inputC-posC;
			maxR = inputR;
			maxC = inputC;
		}
		
		int secondR = 1;
		int secondC = 1;
		
		if(maxR == 1) {
			secondR = inputR;
		}
		if(maxC == 1) {
			secondC = inputC;
		}
		
		System.out.println(maxR + " " + maxC + " " + secondR + " " + secondC);
		
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testCase = Integer.parseInt(br.readLine().trim());
		while(testCase-- > 0) {
			
			StringTokenizer st = new StringTokenizer(br.readLine().trim(), " ");
			inputR = Integer.parseInt(st.nextToken());
			inputC = Integer.parseInt(st.nextToken());
			posR = Integer.parseInt(st.nextToken());
			posC = Integer.parseInt(st.nextToken());
			
			mySolve();
			
		}
		
	}

}
