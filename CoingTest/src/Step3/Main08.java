package Step3;


import java.io.*;

public class Main08 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());

	
		
		
		for(int i =1 ; i<=count ; i++) {
			
			String[] nums = br.readLine().split(" ");
			int a = Integer.parseInt(nums[0]);
			int b = Integer.parseInt(nums[1]);
			
			bw.write("Case #"+i+": "+a+" + "+b+" = "+(a+b)+"\n");
			

		}
		
		bw.flush();
		bw.close();
		br.close();

		
	}
}
