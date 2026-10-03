class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<>();
        if(digits.length()==0){
            return result;
        }
        String[] phone={
            "","","abc","def","ghi",
            "jkl","mno","pqrs","tuv","wxyz"
    };
    backtrack(0,digits,"",phone,result);
    return result;
        

    }
    void backtrack(int index,String digits,String current, String[] phone,List<String> result){
        if(index==digits.length()){
            result.add(current);
            return;
        }
        int digit=digits.charAt(index)-'0';
        String letters=phone[digit];
        for(char ch:letters.toCharArray()){
            backtrack(index+1,digits,current+ch,phone,result);
        }
    }
}