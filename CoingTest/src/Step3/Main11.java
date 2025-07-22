package Step3;

import java.io.*;
import java.util.ArrayList;

public class Main11 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int sum = 0;
		// int result = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i =0; sum>= 0 ; i++) {
				String [] input = br.readLine().split(" ");
				int a = Integer.parseInt(input[0]);
				int b = Integer.parseInt(input[1]);
				sum = a+b;
				if(sum == 0)
					break;
					list.add(sum);	
			
		}
		
		for(int num:list) {
			System.out.println(num);
		}
		
		
		bw.flush();
		bw.close();
		br.close();
		
		
		
	}
}
