class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m * k > bloomDay.length)
            return -1;
        int low=1;
        int high = 1000000000;
        while(low < high){
            int mid = low + (high - low) / 2;
            int count = 0;
            int bouquets = 0;
            for(int day: bloomDay){
                if(day <= mid){
                    count++;
                    if(count == k){
                        bouquets++;
                        count = 0;
                    }
                }else{
                    count = 0;
                }
            }
            if(bouquets >= m)
                high = mid;
            else
                low = mid + 1;
        }
        return low;
        
    }
}