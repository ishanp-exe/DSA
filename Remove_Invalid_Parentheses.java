//https://leetcode.com/problems/remove-invalid-parentheses/description/?envType=daily-question&envId=2026-10-07

import java.util.*;
public class Remove_Invalid_Parentheses {
    private Set<String> st = new HashSet<>();
    private int n;
    private int maxLen;

    private void solve(String s, int i, StringBuilder curr, int count){
        if(count<0) //unbalanced parentheses
        return;

        if(i==n){
            if(count == 0){
                if(curr.length() > maxLen){ //found larger string
                    maxLen = curr.length();
                    st.clear();
                }
                if(curr.length() == maxLen){
                    st.add(curr.toString());
                }
            }
            return;
        }
        char c = s.charAt(i); //always push letters
        if(c!='(' &&  c!=')'){
            curr.append(c);
            solve(s, i+1, curr, count); //explore and store answe in set 
            curr.deleteCharAt(curr.length()-1); //undo for backtracking
            return;
        }
        curr.append(c);
        solve(s,i+1,curr,count + (c=='(' ? 1 :-1 ));
        curr.deleteCharAt(curr.length()-1);
        solve(s,i+1, curr, count);
    }
    public List<String> removeInvalidParentheses(String s) {
        n = s.length();
        maxLen=0;
        st.clear();

        solve(s,0, new StringBuilder(), 0);
        return new ArrayList<>(st);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Remove_Invalid_Parentheses obj = new Remove_Invalid_Parentheses();
        System.out.println(obj.removeInvalidParentheses(s));

        sc.close();
    }
    
}
