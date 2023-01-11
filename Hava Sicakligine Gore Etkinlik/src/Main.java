import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temp;
        System.out.print("Sıcaklığı Giriniz: ");
        temp = input.nextInt();
        if (temp < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (temp <= 25) {
            if (temp <= 15) {
                System.out.println("Sinemaya gidebilirsiniz.");
            }if (temp >= 10){
                System.out.println("Piknik yapabilirsiniz.");
            }
        }
        else {
            System.out.println("Yüzmeye gidebilirsiniz.");}
    }
}