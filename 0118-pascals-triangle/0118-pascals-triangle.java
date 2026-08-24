class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    row.add(1);
                }else{
                    List<Integer> previousRow=triangle.get(i-1);
                    row.add(previousRow.get(j-1)+previousRow.get(j));
                }
            }
            triangle.add(row);
        }
        return triangle;
        
    }
}