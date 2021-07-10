
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Codeforce_Round_727_A {

	private static long inputN, inputX, inputT;
	
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testCase = Integer.parseInt(br.readLine().trim());
		while(testCase-- > 0) {

			StringTokenizer st = new StringTokenizer(br.readLine().trim(), " ");
			inputN = Long.parseLong(st.nextToken());
			inputX = Long.parseLong(st.nextToken());
			inputT = Long.parseLong(st.nextToken());
			
			long groupSize = inputT / inputX;
			if(groupSize > inputN-1l)
				groupSize = inputN-1l;
			
			long sum1 = (inputN-1l-groupSize) * groupSize;
			long sum2 = (groupSize * (groupSize+1l))/2l;
			
			System.out.println(sum1 + sum2);
			
			
			
		}
		
	}

}
