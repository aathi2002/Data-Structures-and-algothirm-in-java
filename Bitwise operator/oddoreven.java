import java.util.*;
public class oddoreven{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int Number=in.nextInt();
        int check=Number&1;//if i and with one one will remain one 0 will be zero so that i will take see to 2power0 is 1 or 0
        System.out.println(check==1?"odd":"even");
    }
}