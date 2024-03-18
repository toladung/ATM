import java.util.Scanner;

public class Khach_hang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bạn muốn chọn gì:");
        System.out.println("1.Gửi tiền");
        System.out.println("2.Rút tiền ");
        System.out.println("3.Kiểm tra số tài khoản");
        System.out.println("4. Thoát chương trình");
        System.out.println("Bạn muốn chọn gì:");
        int a = scanner.nextInt();
        int sotien=100000;
        int tientru;int tiencong;
        switch (a){
            case 1:
                System.out.println("Bạn muốn gửi số tiền là");
                int tiengui = scanner.nextInt();
                System.out.println("Số tiền của bạn là:");
                sotien = sotien+tiengui;
                System.out.println(sotien +"VND");
                break;
            case 2:
                System.out.println("Bạn muốn rút số tiền :");
                int ruttien = scanner.nextInt();
                if(ruttien>sotien){
                    System.out.println("Số tiền rút không thể lớn hơn số tiền hiện có");
                } else {sotien = sotien - ruttien;
                    System.out.println("Số tiền của bạn là:"+ sotien + "VND");
                };
                break;
            case 3:
                System.out.println("Số tiền bạn hiện có là:"+ sotien + "VND");
                break;
            case 4:
            default: System.exit(0);


        }
    }
}
