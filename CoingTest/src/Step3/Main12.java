package Step3;

import java.io.*;
import java.util.StringTokenizer;

public class Main12 {
	public static void main(String[] args) throws IOException{
		
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		

		StringTokenizer st;
		String str;
		int sum = 0;
		
		
		while((str=br.readLine()) != null) {
			st = new StringTokenizer(str," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			bw.write(a+b + "\n");
		}
		
		
		
		
	}
}
