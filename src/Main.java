import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        float a,b;//有小數點(浮點數)要用float
        a=in.nextFloat();
        b=in.nextFloat();
        if(b==1)//"%.1f"取到小數第一位
            System.out.printf("%.1f\n",(a-80)*0.7);
        else
            System.out.printf("%.1f\n",(a-70)*0.6); 




    }
}
