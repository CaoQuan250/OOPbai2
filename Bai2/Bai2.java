package OOP;


import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        String id;
        System.out.println("Nhập Mã Sinh Viên:");
        Scanner sc = new Scanner(System.in);
        id = sc.nextLine();
        if (id.matches("B\\d{7}"))
            System.out.println("Phù hợp");
        else
            System.out.println("Không Phù Hợp");
    }
}
