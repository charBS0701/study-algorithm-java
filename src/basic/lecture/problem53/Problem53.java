package basic.lecture.problem53;
//나머지가 1이 되는 수 찾기
//https://campus.programmers.co.kr/tryouts/63131/challenges
//10	3
//12	11

import common.Utils;

class Solution {
    public int solution(int n) {
        for (int i = 2; i < n; i++)
            if (n % i == 1) return i;
        return -1;
    }
}



public class Problem53 {
    public static void main(String[] args) {
        Utils.print(new basic.lecture.problem53.Solution().solution(10));
        Utils.print(new basic.lecture.problem53.Solution().solution(12));
    }
}