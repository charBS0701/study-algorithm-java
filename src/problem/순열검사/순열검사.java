package problem.순열검사;
//순열 검사
//https://campus.programmers.co.kr/courses/16066/lessons/148367?language=java
//[4, 1, 3, 2]	true
//[4, 1, 3]	false
import common.Utils;

import java.util.Arrays;

class Solution {
    public boolean solution(int[] arr) {
        Arrays.sort(arr);    // 오름차순

        for (int i = 1; i <= arr.length; i++) {
            if(arr[i-1] != i) return false;
        }

        return true;
    }
}

public class 순열검사 {
    public static void main(String[] args) {
        Utils.print(new Solution().solution(new int[] {4, 1, 3, 2}));
        Utils.print(new Solution().solution(new int[] {4, 1, 3}));
    }
}
