package problem24;
//타겟 넘버
// https://campus.programmers.co.kr/courses/16066/lessons/148387
// [1, 1, 1, 1, 1] 3 5
// [4, 1, 2, 1] 4 2
import common.Utils;
import java.util.* ;
import java.util.stream.*;
class Solution {
    int[] numbers;
    int answer = 0;
    int target;
    public int solution(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;
        dfs(0, 0); // depth, 누적sum
        return answer;
    }
    public void dfs(int idx, int sum) {
        if ( idx == numbers.length) {
            if ( sum == target ) answer++;
        } else {
            dfs(idx + 1, sum + numbers[idx]);
            dfs(idx + 1, sum - numbers[idx]);
        }
    }
}
public class Problem24 {
    public static void main(String[] args) {
        Utils.print(new Solution().solution( new int[]{1, 1, 1, 1, 1}, 3));
        Utils.print(new Solution().solution( new int[]{4, 1, 2, 1}, 4));
    }
}