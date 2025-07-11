package Step3;

import java.io.*;

public class Main07 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int count = Integer.parseInt(br.readLine());
//		System.out.println(count);
		int[] sum = new int[count];
		
		
		for(int i=0; i<count ; i++) {
			String[] input = br.readLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			sum[i] = a+b;
			
		}
		
		int result = 1;
		
		for(int num:sum) {
			System.out.printf("Case #%d: %d\n",result,num);	
			result++;
			
		}
		
		bw.flush();
		bw.close();
		br.close();

	}
}
