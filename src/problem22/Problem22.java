package problem22;
//제일 작은 수 제거하기
// https://campus.programmers.co.kr/courses/16066/lessons/148382
// [4,3,2,1] [4,3,2]
// [10] [-1]
import common.Utils;

import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1){
            return new int[] {-1};
        }
        int num_to_remove = arr[0];
        for(int i=0; i<arr.length; i++){
            if(num_to_remove > arr[i]) // 1000 > 10
                num_to_remove = arr[i];
        }
        int[] answer = new int[arr.length - 1];
        int idx = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != num_to_remove)
                answer[idx++] = arr[i];
        }
        return answer;
    }
}

class Solution2 {
    public int[] solution(int[] arr) {
        if (arr.length == 1) return new int[]{-1};
        int min = IntStream.of(arr).min().getAsInt();
        return Arrays.stream(arr).filter(v -> v != min).toArray();
        //Arrays.stream(arr).filter(v -> { return v != min; } );
    }
}
class Solution3 {
    public int[] solution(int[] arr) {
        return arr.length == 1 ? new int[] {-1} :
                IntStream.of(arr).
                        filter(i -> i != IntStream.of(arr).min().getAsInt() ).toArray();
    }
}
public class Problem22 {
    public static void main(String[] args) {
        Utils.print(new Solution().solution( new int[]{4, 3, 2, 1}));
        Utils.print(new Solution().solution( new int[]{10}));
    }
}