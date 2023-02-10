package basic.lecture.problem12;
// 완주하지 못한 선수
//https://campus.programmers.co.kr/tryouts/63116/challenges?language=java
//participant completion return
// ["leo", "kiki", "eden"] ["eden", "kiki"] "leo"
// ["marina", "josipa", "nikola", "vinko", "filipa"] ["josipa", "filipa", "marina", "nikola"] "vinko"
// ["mislav", "stanko", "mislav", "ana"] ["stanko", "ana", "mislav"] "mislav"

import common.Utils;

import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {

        //1 참가자 목록 작성 , "이순신, 1"
        //HashMap<String, Integer> name = new HashMap<String, Integer>();
        //HashMap<String, Integer> name = new HashMap<>();
        //Map<String, Integer> name = new HashMap();
        HashMap<String, Integer> name = new HashMap();

//        for(String s : participant)
//            if(name.get(s) == null)     // 명단에 없으면
//                name.put(s, 1);
//            else
//                name.put(s, name.get(s) + 1);      // 기존값 + 1
        for(String s : participant)
            name.put(s, name.getOrDefault(s, 0)+1); // getOrDedault

        for(String s : completion)      // 완주한사람에서 1뺀다. 완주한사람은 0이됨
            name.put(s, name.get(s)-1);

        String answer = "";
        for(Map.Entry<String, Integer> e : name.entrySet())
            if(e.getValue() > 0) {
                answer = e.getKey();    // 이름
                break;
            }

        return answer;
    }

    public String solution2(String[] participant, String[] completion) {
        HashMap<String, Integer> name = new HashMap();
        for(String s : participant)
            name.put(s, name.getOrDefault(s, 0)+1);
        for(String s : completion)
            name.put(s, name.get(s)-1);
        String answer ="";
        for(Map.Entry<String, Integer> e : name.entrySet())
            if(e.getValue() > 0) {
                answer = e.getKey(); // 이름
                break;
            }
        return answer;
    }
}
public class Problem12 {
    public static void main(String[] args) {
        Utils.print( new Solution().solution(
                new String[] { "leo", "kiki", "eden"},
                new String[] { "eden", "kiki" }
        ));
    }
}
