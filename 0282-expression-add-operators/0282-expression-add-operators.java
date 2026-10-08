class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> ans=new ArrayList<>();
        backtrack(num,target,0,0,0,"",ans);
        return ans;
        
    }
    public void backtrack(String num,int target,int index,long value,long prev,String expr,List<String> ans){
        if(index==num.length()){
            if(value==target){
                ans.add(expr);
            }
            return;
        }
        for(int i=index;i<num.length();i++){
            if(i>index && num.charAt(index)=='0'){
                break;
            }
            String part=num.substring(index,i+1);
            long number=Long.parseLong(part);
            if(index==0){
                backtrack(num,target,i+1,number,number,part,ans);
            }else{
                backtrack(num,target,i+1,value+number,number,expr+"+"+part,ans);
                backtrack(num,target,i+1,value-number,-number,expr+"-"+part,ans);
                backtrack(num,target,i+1,value-prev+prev*number,prev*number,expr+"*"+part,ans);
            }
        }
    }
}