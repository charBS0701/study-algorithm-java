
package problem21;
// 문자열 내 p와 y의 개수
// https://campus.programmers.co.kr/app/courses/16066/parts/37165/lessons/148380/
// "pPoooyY" true
// "Pyy" false
import common.Utils;
import java.util.*;
class Solution {
    boolean solution(String s) {
        int p_num = 0, y_num = 0;
        for(int i = 0;i < s.length(); i++) {
            if((s.charAt(i)=='p')||(s.charAt(i)=='P')) p_num++;
            else if((s.charAt(i)=='y')||(s.charAt(i)=='Y')) y_num++;
        }
// if ( p_num == y_num) return true;
// else return false;
//
// return p_num == y_num ? true : false;
        return p_num == y_num;
    }
}
class Solution2 {
    boolean solution(String s) {
        int sum = 0;
        for(int i = 0;i < s.length(); i++) {
            if((s.charAt(i)=='p')||(s.charAt(i)=='P')) sum++;
            else if((s.charAt(i)=='y')||(s.charAt(i)=='Y')) sum--;
        }
// if ( p_num == y_num) return true;
// else return false;
//
// return p_num == y_num ? true : false;
        return sum == 0;
    }
}
public class Problem21 {
    public static void main(String[] args) {
        Utils.print( new Solution2().solution("pPoooyY") );
        Utils.print( new Solution2().solution("Pyy") );
    }
}