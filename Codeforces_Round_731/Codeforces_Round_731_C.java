
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Codeforces_Round_731_C {

	private static int inputK, inputN, inputM;
	private static Queue<Integer> mono = new LinkedList<>();
	private static Queue<Integer> poly = new LinkedList<>();
	private static ArrayList<Integer> answers = new ArrayList<>();

	
	private static boolean mySolve() {
		
		boolean isPossible = true;
		
		int lines = inputK;
		while(!mono.isEmpty() && !poly.isEmpty()) {
			int minNum = -1;
			if(mono.peek() <= poly.peek()) {
				minNum = mono.peek();
				mono.poll();
			} else {
				minNum = poly.peek();
				poly.poll();
			}
			answers.add(minNum);
			if(minNum == 0) {
				lines += 1;
			} else if(minNum > lines) {
				isPossible = false;
				break;
			}
		}
		
		while(!mono.isEmpty()) {
			int num = mono.peek();
			mono.poll();
			answers.add(num);
			if(num == 0) {
				lines += 1;
			} else if (num > lines){
				isPossible = false;
				break;
			}
		}
		
		while(!poly.isEmpty()) {
			int num = poly.peek();
			poly.poll();
			answers.add(num);
			if(num == 0) {
				lines += 1;
			} else if (num > lines){
				isPossible = false;
				break;
			}
		}
		
		return isPossible;
		
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine().trim());
		while(testCase-- > 0) {
			br.readLine().trim();
			StringTokenizer st = new StringTokenizer(br.readLine().trim(), " ");
			inputK = Integer.parseInt(st.nextToken());
			inputN = Integer.parseInt(st.nextToken());
			inputM = Integer.parseInt(st.nextToken());
			mono.clear();
			poly.clear();
			answers.clear();
			st = new StringTokenizer(br.readLine().trim(), " ");
			for(int i = 0; i < inputN; ++i) {
				mono.offer(Integer.parseInt(st.nextToken()));
			}
			st = new StringTokenizer(br.readLine().trim(), " ");
			for(int i = 0; i < inputM; ++i) {
				poly.offer(Integer.parseInt(st.nextToken()));
			}
			
			boolean isPossible = mySolve();
			if(isPossible) {
				for(int i = 0; i < answers.size(); ++i)
					System.out.print(answers.get(i) + " ");
				System.out.println();
			} else {
				System.out.println(-1);
			}
		}

	}

}
