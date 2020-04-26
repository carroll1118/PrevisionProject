package study1117;

public class CentralLimit {
	
	@SuppressWarnings("unused")
	private static int samplenum = 30;
	@SuppressWarnings("unused")
	private static int totalnum = 10000;
	@SuppressWarnings("unused")
	private static int[] dist;
	

	public static void main(String[] args) {
		
		 dist = new int[101];
		 for(int i = 0; i < totalnum; ++i) {
			 double sum = 0;
			 for(int j = 0; j < samplenum; ++j) {
				 sum += Math.random()*100;
			 }
			 dist[(int)(sum / samplenum)]++;
			 //System.out.println(dist[(int)(sum / samplenum)]++);
		 }
		 for(int i = 0; i<101; ++i) {
			 System.out.println(i + "," + dist[i]);
		 }

	}
	
}
