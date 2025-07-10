package sub3;

import java.util.Arrays;

public class SelectionSortTest {
    public static void main(String[] args) {
        int arr[] = {4, 2, 1, 5, 3};

        // 선택 정렬
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            System.out.printf("%d 회전: %s\n", i, Arrays.toString(arr));
        }

        
        
        
        // 정렬 결과 출력
        System.out.println("최종 배열: " + Arrays.toString(arr));

        
        
        
        // 하나씩 출력
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
