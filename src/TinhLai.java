import java.util.Scanner;

public class TinhLai {
    public static void main(String[] args) {
        double money;
        int month =1;
        double set_rate= 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter money");
        money = input.nextDouble();
        System.out.println("Enter number of months: ");
        month = input.nextInt();
        System.out.println("Enter rate in percentage: ");
        set_rate = input.nextDouble();
        double total_interest =0;
        for(int i=0; i<month; i++){
            total_interest += money * (set_rate/100)/12 * month;
        }
        System.out.println("Total of interest: "+ total_interest);
    }
}
