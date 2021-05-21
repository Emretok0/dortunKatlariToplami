import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int i,total=0;
        do {
            System.out.print("Sayı giriniz: ");
            i = in.nextInt();
            if (i%4==0){
                total+=i;
            }
        }while (i%2==0);
        System.out.println(total);
    }
}
