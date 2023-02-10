package basic.lecture.problem34;
//모음 사전
// https://campus.programmers.co.kr/tryouts/63122/challenges
// "AAAAE" 6
// "AAAE" 10
// "I" 1563
// "EIO" 1189
import common.Utils;
import java.util.* ;

class Solution {
    char[] alphabet= {'A','E','I','O','U'};
    public int solution(String word) {
        int answer = 0;
        ArrayList<String> list= new ArrayList<>();
        combination(0, "", list);
        Collections.sort(list);
        answer= list.indexOf(word)+1;
        return answer;
    }
    public void combination(int index, String str, ArrayList<String> list){
        if(index>=5) return;
        for(int i=0; i<alphabet.length; i++){
            list.add(str+alphabet[i]);
            combination(index+1, str+alphabet[i], list);
        }
    }//comb
}
class Solution2 {
    static final String MAPPING = "AEIOU";
    // 156*5+1 31*5+1 6*5+1=31 1*5+1=6 1
    static final int[] RATE_OF_INCREASE = {781, 156, 31, 6, 1};
    public int solution(String word) {
        int answer = word.length();
        for (int i = 0; i < word.length(); i++) {
            answer += (RATE_OF_INCREASE[i] * MAPPING.indexOf(word.charAt(i)));
        }
        return answer;
    }
}
public class Problem34 {
    public static void main(String[] args) {
        Utils.print(new Solution().solution("AAAAE"));
        Utils.print(new Solution().solution("I"));
    }
}