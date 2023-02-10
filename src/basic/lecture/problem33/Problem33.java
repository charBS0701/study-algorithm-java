package basic.lecture.problem33;

//정수 내림차순으로 배치하기
//https://campus.programmers.co.kr/tryouts/63121/challenges
//118372 873211
import common.Utils;

import java.util.* ;

class Solution {
    public long solution(long n) {
        // 176  "1" "7" "6" 1 6 7

        String[] str = Long.toString(n).split("");  // ["1","7","6"]
        Arrays.sort(str, Collections.reverseOrder());   //  ["7" "6" "1"]

        String answer = "";
        for(String s : str) answer += s;    // "761"
        return Long.parseLong(answer);      // 761

    }
}
class Solution2 {
    public long solution(long n) {

        String num = String.valueOf(n); // long -> String

        char [] arr = new char[num.length()];   // String -> char[]
        for (int i = 0; i<num.length(); i++) {  // String -> char[]
            arr[i] = num.charAt(i);
        }
        // arr = num.toCharArray();     // String -> char[]

        Arrays.sort(arr);   // '1', '6'. '7'    char[] asc sort

        String answer = ""; // String 생성
        for (int i = arr.length-1; i>=0; i--) { // desc로 String에 추가
            answer += arr[i];
        }   // "761"
        return Long.parseLong(answer);  // return long 761
    }
}

public class Problem33 {
        public static void main(String[] args) {
            Utils.print(new basic.lecture.problem33.Solution().solution(118372));
        }
}