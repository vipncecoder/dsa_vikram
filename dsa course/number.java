// Number Theory starts

/*some basic terminology
1. Natural number 
2. Integer
different number system

Fundamental Theorem of Arithmatic

 */

import java.util.Arrays;

public class number {
    static boolean[] primeSieve(int n){
        boolean isprime[]= new boolean[n+1];
        Arrays.fill(isprime,true);
        isprime[0] = isprime[1] =true;
    for (int i=2;i*i<=n;++i){
    if(!isprime[i]||(long)i*i>(long)n)
    continue;
    for(int j=i*i;j<=n;j+=i)
isprime[j]=false;
    }
    return isprime;
    }
    public static void main(String[] args) {
        boolean[] ans =primeSieve(30);
for(int i=1;i<ans.length;++i)
System.out.println(i + "->" + ans[i]);
    }
    
}
