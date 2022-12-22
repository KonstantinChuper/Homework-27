import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("Введите трёхзначное число");
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        System.out.println("Сумма цифр числа равна");
        System.out.println((n % 10) + (n / 10) % 10 + (n / 100));
        System.out.println("");

        int a;
        int b=1;
        Scanner sc2=new Scanner(System.in);
        System.out.println("Введите число");
        a=sc2.nextInt();
        for(int i=a;i>0;i--){
            b*=i;}
        System.out.println("Факториал числа равен");
        System.out.println(b);

        System.out.println("");
        System.out.println("Таблица умножения на 3");
        for(int c=1 ; c<=9 ; c++) {
            int sum = 0;
            sum += c*3;
            System.out.println("3"+"*"+c+"="+sum);}

        System.out.println("");
        double z; int l;

        Scanner sc3=new Scanner(System.in);
        System.out.println("Введите зп");
        z=sc3.nextDouble();
        Scanner sc4=new Scanner(System.in);
        System.out.println("Введите количество лет");
        l=sc4.nextInt();

        if (l<=3) {
            z=z*1.1;}
        else {
            z=z*1.2;};
        if (z<4000) {System.out.println(z+1000);}
        else {System.out.println(z+500);}




    }
}