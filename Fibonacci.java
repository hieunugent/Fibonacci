class Fibonacci{
  public static int getFib(int n){
    if(n == 1){ return 0;}
    else if (n == 2 ){ return 1;}
    return getFib(n-2) + getFib(n-1);
  }
}
