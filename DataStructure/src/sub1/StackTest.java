package sub1;

/*
 * 날짜: 2025/07/07
 * 이름: 이지민
 * 내용: 자료구조 Stack 구현 
 * 
 */


public class StackTest {
	public static void main(String[] args) {
		int[] stack = new int[5];
		int top = -1; // top 포인터 위치 
	
		
		// 데이터 10 저장(push)
		stack[++top] = 10;
		stack[++top] = 20;
		stack[++top] = 30;
		stack[++top] = 40;
		stack[++top] = 50;
		
		System.out.println("현재 top:"+top);
		
		for(int i =0; i<stack.length;i++) {
			System.out.println("stack["+i+"]:" + stack[i]);
		}
		
		// 데이터 삭제 (pop)
		int removed = stack[top--];
		
		
		System.out.println("삭제 데이터:"+removed);
		
		
		
		
	}
}
