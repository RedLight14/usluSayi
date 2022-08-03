import java.util.Scanner;

public class üslüSayi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a, b, c =1;

        System.out.print("Sayi giriniz : ");
        a = inp.nextInt();
        System.out.print("Üs giriniz : ");
        b = inp.nextInt();

        for(int i=1;i<=b;i++)
        {
            c*=a;
        }
        System.out.print(c);
    }
    }
