package basic.lecture.problem13;
//로또 번호 검출기
// https://campus.programmers.co.kr/courses/16066/lessons/148372
//입력1: [4, 7, 32, 43, 22, 19]
//출력1: true
//입력2: [3, 19, 34, 39, 39, 20]
//출력2: false

import common.Utils;

import java.util.*;
class Solution {
    public boolean solution(int[] lotto) {

        Set<Integer> s = new HashSet<>();
        for(int l : lotto) if ( l >= 1 && l<= 45) s.add(l);
        return s.size() == 6;
    }

    public boolean solution2(int[] lotto) {
        Set<Integer> s = new HashSet<>();
        for (int l : lotto)
            if(l>=1 && l<=45) s.add(l);
            else return false;
        return s.size() == 6;
    }
}

public class Problem13 {
    public static void main(String[] args) {
        Utils.print( new Solution().solution(
                new int[] {4, 7, 32, 43, 22, 19}
        ));
    }
}

