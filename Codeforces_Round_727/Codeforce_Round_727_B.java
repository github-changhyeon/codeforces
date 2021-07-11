
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Codeforce_Round_727_B {

	private static int inputN, inputQ;
	private static String song;
	private static int[] orders = new int[26];
	private static int[] accumulatedSum = new int[100001];
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine().trim(), " ");
		inputN = Integer.parseInt(st.nextToken());
		inputQ = Integer.parseInt(st.nextToken());
		song = br.readLine().trim();
		
		for(int i = 0; i < 26; ++i) {
			orders[i] = i+1;
		}
		
		accumulatedSum[1] = orders[song.charAt(0)-'a'];
		for(int i = 2; i <= inputN; ++i) {
			accumulatedSum[i] = orders[song.charAt(i-1)-'a'] + accumulatedSum[i-1];
		}
		
		for(int i = 0; i < inputQ; ++i) {
			
			st = new StringTokenizer(br.readLine().trim(), " ");
			int left = Integer.parseInt(st.nextToken());
			int right = Integer.parseInt(st.nextToken());
			System.out.println(accumulatedSum[right] - accumulatedSum[left-1]);
			
		}
		
	}

}
