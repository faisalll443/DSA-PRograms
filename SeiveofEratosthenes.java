import java.util.Arrays;
class SeiveofEratosthenes
{
    public static void main(String[] args) {

        boolean isprime[]=SeiveofEratosthenes1(20);
        for (int index = 0; index < 20; index++) {
            System.out.println(index+" "+isprime[index]);
        }

        
    }


    static boolean[] SeiveofEratosthenes1(int n)
    {
        boolean isprime[]=new boolean[n+1];
        Arrays.fill(isprime,true);
        isprime[0]=false;
        isprime[1]=false;
        for (int i = 2; i*i <=n; i++)/*yahan i=root of n likhna tha aur ye uske equivalent hai*/ {

            for (int j = i*2; j <=n; j+=i) {
                isprime[j]=false;
            }
            
        }

        return isprime;
    }
}