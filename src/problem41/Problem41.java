package problem41;
// 내적
// https://campus.programmers.co.kr/tryouts/63124/challenges
// [1,2,3,4]	[-3,-1,0,2]	3
// [-1,0,1]	[1,0,-1]	-2
import common.Utils;

import java.util.stream.IntStream;

class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }
}
class Solution2 {
    public int solution(int[] a, int[] b) {
        return IntStream.range(0, a.length).map(i -> a[i]*b[i]).sum();
    }
}
public class Problem41 {
    public static void main(String[] args) {
        Utils.print(new Solution2().solution(
                new int[]{1,2,3,4},
                new int[]{-3,-1,0,2}
        ));
    }
}
