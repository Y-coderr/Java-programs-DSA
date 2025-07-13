class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb = new StringBuilder();
        StringBuilder tb = new StringBuilder();

        Stack<Character> sc = new Stack<>();
        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='#'){
                sc.push(s.charAt(i));
            }else{
                sc.pop();
            }
        }

        for(int i=0;i<t.length();i++){
            if(t.charAt(i)!='#'){
                st.push(t.charAt(i));
            }else{
                st.pop();
            }
        }

        while(!sc.isEmpty()){
            sb.append(sc.pop());
        }
        while(!st.isEmpty()){
            tb.append(st.pop());
        }

        String ans1 = sb.toString();
        String ans2= tb.toString();

        if(ans1 == ans2){
            return true;
        }
        return false;
    }
}