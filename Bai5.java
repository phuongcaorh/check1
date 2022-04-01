import java.util.Scanner;
public class Bai5 {
    public static void main(String[] args){
        // khai bao bien
        double a,b;
        //nhap du lieu
        Scanner ip = new Scanner(System.in);
        System.out.println("nhap vao a =");
        a = ip.nextDouble();
        System.out.println("Nhap vao b = ");
        b = ip.nextDouble();

        double tong = a+b;
        System.out.println(a+" + "+b+" = "+tong);

        double hieu = a-b;
        System.out.println(a+" - "+b+" = "+hieu);

        double tich = a*b;
        System.out.println(a+" * "+b+" = "+tich);

        double thuong = a/b;
        System.out.println(a+" / "+b+" = "+thuong);
    }
    
}
