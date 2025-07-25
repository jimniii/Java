package Step3;

import java.io.*;

public class Main06 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		int[] result = new int[count];
		
		
		for(int i=0; i<count; i++) {
			String[] input = br.readLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			result[i] = a+b;
		}
		
		for (int num: result) {
			bw.write(num+"\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}



