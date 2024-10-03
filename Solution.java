import java.util.*;
public class Solution {
  public int fib(int n){
    int[] memo=new int[n+1];
      Arrays.fill(memo,-1);
      return fib(n,memo);
  }

  private int fib(int n,int[] memo) {
    if(memo[n]!=-1){
      return memo[n];
    }
    if(n==0 || n == 1){
      int ans=n;
      memo[n]=ans;
      return ans;
    }else{
      int ans=fib(n-1,memo)+fib(n-2,memo);
      memo[n]=ans;
      return ans;
    }
  }

}