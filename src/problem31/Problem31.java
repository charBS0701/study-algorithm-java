package problem31;
//자릿수 더하기
// https://campus.programmers.co.kr/tryouts/63119/challenges
// 1234 10
// 930211 16
import common.Utils;
import java.util.* ;
import java.util.stream.*;
class Solution {
    public int solution(int n) {
        String s = Integer.toString(n); //int n을 String으로 변환
        int answer = 0;
        for(int i = 0; i<s.length(); i++){
            answer += Integer.parseInt(s.substring(i, i+1));
        }
        return answer;
    }
}
class Solution2 {
    public int solution(int n) {
        String s = Integer.toString(n); //int n을 String으로 변환
        int answer = 0;
        for(char c : s.toCharArray()) {
            answer += c - '0'; //'1'(o) 1(x) '1' - '0'
        }
        return answer;
    }
}
class Solution3 {
    public int solution(int n) {
        //
        // 746 / 10 -> 74, 6 6
        // 74/ 10 -> 7, 4 4
        // 7 / 10 -> 0, 7 7
        int answer = 0;
        while(n > 0){
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }
}

class Solution4 {
    // 756
    //s(756) return 6 + s(75) = return 6 + 5 + 7
    // s(75) return 5 + s(7) = return 5 + 7
    // s(7) return 7
    public int solution(int n) {
        if(n<10) return n;
        return (n%10) + solution(n/10);
    }
}
class Solution5 {
    // 756
    //s(756) return 6 + s(75) = return 6 + 5 + 7
    // s(75) return 5 + s(7) = return 5 + 7
    // s(7) return 7
    public int solution(int n) {
        return n<10 ? n : (n%10) + solution(n/10);
    }
}
public class Problem31 {
    public static void main(String[] args) {
        Utils.print(new Solution().solution(1234));
    }
}