
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeforces_Round_728_A {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine().trim());
		while(testCase-- > 0) {
			
			int inputN = Integer.parseInt(br.readLine().trim());
			if(inputN % 2 == 0) {
				for(int i = 1; i <= inputN/2; ++i) {
					System.out.print(2*i + " ");
					System.out.print(2*i - 1 + " ");
				}
			}
			else {
				for(int i = 1; i <= (inputN-3)/2; ++i) {
					System.out.print(2*i + " ");
					System.out.print(2*i - 1 + " ");
				}
				System.out.print(inputN + " ");
				System.out.print(inputN - 2 + " ");
				System.out.print(inputN - 1 + " ");
			}
			System.out.println();
		}
		
	}

}
