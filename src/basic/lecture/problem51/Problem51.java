package basic.lecture.problem51;
//하샤드 수
// https://campus.programmers.co.kr/tryouts/63129/challenges
//
// 10 true
// 12 true
import common.Utils;
class Solution {
    public boolean solution(int x) {
        String str = String.valueOf(x); // 345 ->"345" -> "3" "4" "5"
        String[] numberArr = str.split("");
        int sum = 0;
        for(String num : numberArr) {
            sum += Integer.parseInt(num); // 3 + 4 + 5
        }
        return (x % sum == 0 ? true : false);
    }
}

class Solution2 {
    public boolean solution(int x) {
        int sum = 0;
        // 367 % 10 7 3 / 10
        int a = x;
        while (a>=1) {
            sum += a % 10;
            a /= 10;
        }
        return (x % sum == 0 ? true : false);
    }
}
public class Problem51 {
    public static void main(String[] args) {
        Utils.print(new Solution().solution(12));
    }
}

