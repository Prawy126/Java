// 1 Zadanie

public class Test {

    public static int F(int n) { // można double, ale ponieważ w poleceniu nie ma aby go używać użyłem integer (poniewaz i tak dzialamy na liczbach całkowitych)
        int[] f = new int[n + 1];
        f[1] = 1;
        f[2] = 2;
        f[3] = 3;

        for (int i = 4; i <= n; i++) {
            if (i % 2 == 0) {
                f[i] = f[i-1]*f[i-3];
            }else if(i % 2 == 1){
//                    f[i]=(int)Math.pow(f[i-2],2); // można użyć tego, jeśli chcemy użyć biblioteki javy.
                f[i]=f[i-2]*f[i-2];
            }
        }
        return f[n];
    }

    public static void main(String[] args) {
        int n = 10; // <- tu ustawiamy wyraz ciagu.
        System.out.println(n+" wyraz ciągu wynosi: " + F(n));
    }
}