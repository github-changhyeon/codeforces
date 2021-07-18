
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Codeforces_Round_731_E {

	private static class Vertex implements Comparable<Vertex>{
		int pos, temperature;

		public Vertex(int pos, int temperature) {
			this.pos = pos;
			this.temperature = temperature;
		}
		
		@Override
		public int compareTo(Vertex v) {
			if(this.temperature < v.temperature)
				return -1;
			else if(this.temperature > v.temperature)
				return 1;
			return 0;
		}
		
	}
	
	private static int inputN, inputK;
	private static PriorityQueue<Vertex> myPQ = new PriorityQueue<>();
	private static ArrayList<Integer> positions = new ArrayList<>();
	private static int[] costArr = new int[300001];
	private static int[] dpos = {-1, 1};
	
	private static void mySolve() {
		
		while(!myPQ.isEmpty()) {
			
			int nowPos = myPQ.peek().pos;
			int minTemperature = myPQ.peek().temperature;
			myPQ.poll();
			if(costArr[nowPos] < minTemperature)
				continue;
			
			for(int dir = 0; dir < 2; ++dir) {
				
				int nextPos = nowPos + dpos[dir];
				int nextMinTemperature = minTemperature + 1;
				if(nextPos <= 0 || nextPos > inputN)
					continue;
				if(costArr[nextPos] > -1 && costArr[nextPos] <= nextMinTemperature)
					continue;
				myPQ.offer(new Vertex(nextPos, nextMinTemperature));
				costArr[nextPos] = nextMinTemperature;
				
			}
			
		}
		
	}
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine().trim());
		while(testCase-- > 0) {
			
			br.readLine().trim();
			positions.clear();
			myPQ.clear();
			StringTokenizer st = new StringTokenizer(br.readLine().trim(), " ");
			inputN = Integer.parseInt(st.nextToken());
			inputK = Integer.parseInt(st.nextToken());
			for(int i = 1; i <= inputN; ++i)
				costArr[i] = -1;
			st = new StringTokenizer(br.readLine().trim(), " ");
			for(int i = 0; i < inputK; ++i) {
				positions.add(Integer.parseInt(st.nextToken()));
			}
			st = new StringTokenizer(br.readLine().trim(), " ");
			for(int i = 0; i < inputK; ++i) {
				int temperature = Integer.parseInt(st.nextToken());
				costArr[positions.get(i)] = temperature;
				myPQ.offer(new Vertex(positions.get(i), temperature));
			}
			
			mySolve();
			
			for(int i = 1; i <= inputN; ++i)
				System.out.print(costArr[i] + " ");
			System.out.println();
		}
		
	}

}
