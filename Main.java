import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //C(n r) = n! / ((n-r)! * r!)
        Scanner imp = new Scanner(System.in);
        System.out.println("N Değerini Giriniz: ");
        int n = imp.nextInt();

        System.out.println("R Değerini Giriniz: ");
        int r = imp.nextInt();
        int fakt1=1, fakt2=1, fakt3=1, fark= n-r;

        for (int i =1; i <= n; i++){
            fakt1 = fakt1*i;
        }
        System.out.println("N Sayısının Faktröriyeli: " + fakt1);

        for(int j=1; j<=r; j++ ){
            fakt2 = fakt2 * j;
        }
        System.out.println("R Sayısının Faktöriyeli: " + fakt2);

        for(int k = 1; k <= fark; k++){
            fakt3 = fakt3*k;
        }
        System.out.println("(N-R)! : " + fakt3);

        int carpim = fakt3*fakt2;
        int kombinasyon = fakt1 / carpim;

        System.out.println(n + " Sayısının " + r + "'li Kombinasyonu = " + kombinasyon);
    }
}
