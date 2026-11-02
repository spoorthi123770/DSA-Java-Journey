class Solution {
    public int[] asteroidCollision(int[] asteroids) {
     int n=asteroids.length;
     int[] stack=new int[n];
     int top=-1;
     for(int a: asteroids){
        boolean alive=true;
        while(alive && a<0 && top>=0 && stack[top] >0){
            if(stack[top]<-a){
                top--;
            }
            else if(stack[top]==-a){
                top--;
                alive=false;
            }
            else{
                alive=false;
            }
        }
        if(alive){
            stack[++top]=a;
        }
     }
     return java.util.Arrays.copyOf(stack, top+1);
    }
}