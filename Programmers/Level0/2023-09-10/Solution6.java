//조건 문자열
public class Solution6 {
    public int solution(String ineq, String eq, int n, int m) {
        if(ineq.equals("<")) {
            if(eq.equals("=")){
                return n<=m?1:0;
            } else if(eq.equals("!")) {
                return n < m?1:0;
            }
        } else if(ineq.equals(">")) {
            if(eq.equals("=")){
                return n>=m?1:0;
            } else if(eq.equals("!")) {
                return n>m?1:0;
            }
        }
        return 0;
    }
}
