import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        // phuong trinh bac 2: ax2 +bx+c =0
        // delta = b^2-4ac
        //B2: delta<0=>pt vo nghiem
        // delta==0=>pt co nghiem kep x1=x2=-b/2a
        // delta >0 =>pt co 2 nghiem
        double a,b,c,x1,x2, delta;
        Scanner in = new Scanner(System.in);

        System.out.println("Nhap vao a=");
        a = in.nextDouble();
        System.out.println("Nhap vao b = ");
        b = in.nextDouble();
        System.out.println("Nhap vao c = ");
        c = in.nextDouble();
        delta = Math.pow(b, 2) - 4*a*c;
        if(a==0){
            System.out.println("nhap du lieu sai, nhap a khac 0");
        }else{

        
        if(delta<0){
            // th delta<0
            System.out.println("Phuong trinh vo nghiem");
        }else if(delta==0){
            //TH delta==0
            x1 = -b/(2*a);
            System.out.println("Phuong trinh co nghiem kep x1=x2="+x1);
        }else{
            //TH delta>=0
            x1 = (-b- Math.sqrt(delta))/(2*a);
            x2 = (-b + Math.sqrt(delta))/(2*a);
            System.out.println("Phuong trinh co nghiem");
            System.out.println("x1="+x1);
            System.out.println("x2="+x2);
        }
        }
    }
}
