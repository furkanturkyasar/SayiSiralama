import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int a,b,c;

        System.out.print("Birinci sayi: ");
        a = input.nextInt();

        System.out.print("Ikinci sayi: ");
        b = input.nextInt();

        System.out.print("Ucuncu sayi: ");
        c = input.nextInt();


        if (a>b && a>c){
            if (b>c){
                System.out.print("a>b>c");
            }else {
                System.out.print("a>c>b");
            }
        }else if (b>a && b>c){
            if (a>c){
                System.out.print("b>a>c");
            }else{
                System.out.print("b>c>a");
            }

        }else if (c>a && c>b){
            if (a>b){
                System.out.print("c>a>b");
            }else {
                System.out.print("c>b>a");
            }
        }




    }


    }
