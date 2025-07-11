package Step3;

import java.io.*;

public class Main10 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		
		for(int i = 0; i<count ; i++) {
			for(int j = 0; j<i ; j++) {
				bw.write(" ");
			for(int k =0; k<=i ;k++) {
				bw.write("*");
				}
			
			}
		System.out.print("\n");		
		}
		
		
		
		
		bw.flush();
		br.close();
		bw.close();
		
	}
}
