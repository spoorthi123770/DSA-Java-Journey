class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int level = 0;
        for (int i = 0; i< s.length(); i++){
            char ch = s.charAt(i);
        
            if (ch == '('){
                if (level > 0){
                    result.append(ch);
            }
            level++;
            }else{
                level--;
                if(level > 0){
                    result.append(ch);
            }
        }
    }
        return result.toString();
        
    }
}