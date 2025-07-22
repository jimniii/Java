package Step3;

import java.io.*;

public class Main10 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		
		for(int i = 0; i<count ; i++) {
			for(int j = 1; j<=count-i-1 ; j++) {
				bw.write(" ");
			}
			for(int k =1; k<=i+1 ;k++) {
				bw.write("*");
			}
			bw.write("\n");			
		}
		
		
		
		
		bw.flush();
		br.close();
		bw.close();
		
	}
}
