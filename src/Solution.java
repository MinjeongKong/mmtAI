import java.util.Arrays;

public class Solution {

    public String solution(String s) {
        String answer = "";
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        answer = new StringBuilder(String.valueOf(arr)).reverse().toString();
        return answer;
    }
}
