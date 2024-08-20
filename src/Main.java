import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static int sum(int a, int b){
        return a+b;
    }
    // Create obj Scanner to read data from keyboard
    public static Scanner scanner = new Scanner(System.in);
    public static int inputNumber(String name){
        int value = 0;
        while (true){
            try {
                System.out.printf("NHap %s cua ban: ", name);
                // Enter a integer number
                value = scanner.nextInt();
                scanner.nextLine();
                break;
            }
            catch (InputMismatchException e) {
                System.out.println("Lỗi vui long nhap so nguyen hop ly!");
                scanner.next(); // Xoa bo data khong hop le
            }
        }
        return value;
    }

    public static void nhapXuat(){
        System.out.print("Nhap ten cua ban: ");
        String name = scanner.nextLine();

        int age = 0, height = 0;
        age = inputNumber("tuoi");
        height = inputNumber("chieu cao");

        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Chieu cao: " + height);
    }

    // Viet phuong thuc cho biet cung hoang dao
    public static String timCungHoangDao(){
        int day = inputNumber("ngay");
        int month = inputNumber("thang");
        String name = "";
        switch (month){
            case 1:
                if (day >= 1 && day <= 19){
                    name = "Ma Kết";
                }
                else if (day > 19 && day <= 31){
                    name = "Bảo Bình";
                }
                break;

            case 2:
                if (day >= 1 && day <= 18){
                    name = "Bảo Bình";

                }
                else if (day > 18 && day <= 29){
                    name = "Song Ngư";
                }
                break;
            case 3:
                if (day >= 1 && day <= 20){
                    name = "Song Ngư";

                }
                else if (day > 20 && day <= 31){
                    name = "Bạch Dương";
                }
                break;
            case 4:
                if (day >= 1 && day <= 19){
                    name = "Bạch Dương";

                }
                else if (day > 20 && day <= 30){
                    name = "Kim Ngưu";
                }
                break;
            case 5:
                if (day >= 1 && day <= 20){
                    name = "Kim Ngưu";

                }
                else if (day > 20 && day <= 31){
                    name = "Song Tử";
                }
                break;
            case 6:
                if (day >= 1 && day <= 20){
                    name = "Song Tử";

                }
                else if (day > 20 && day <= 30){
                    name = "Cự Giải";
                }
                break;
            case 7:
                if (day >= 1 && day <= 22){
                    name = "Cự Giải";

                }
                else if (day > 22 && day <= 31){
                    name = "Sư Tử";
                }
                break;
            case 8:
                if (day >= 1 && day <= 22){
                    name = "Sư Tử";

                }
                else if (day > 22 && day <= 30){
                    name = "Xử Nữ";
                }
                break;
            case 9:
                if (day >= 1 && day <= 22){
                    name = "Xử Nữ";
                }
                else if (day > 22 && day <= 31){
                    name = "Thiên Bình";
                }
                break;
            case 10:
                if (day >= 1 && day <= 22){
                    name = "Thiên Bình";
                }
                else if (day > 22 && day <= 31){
                    name = "Bọ Cạp";
                }
                break;
            case 11:
                if (day >= 1 && day <= 21){
                    name = "Bọ Cạp";
                }
                else if (day > 21 && day <= 31) {
                    name = "Nhân Mã";
                }
                break;
            case 12:
                if (day >= 1 && day <= 22){
                    name = "Nhân Mã";
                }
                else if (day > 22 && day <= 31) {
                    name = "Ma Kết";
                }
                break;
            default:
                name="Ngay thang khong hop le";

        }
        return name;
    }


    public static void main(String[] args) {
//        nhapXuat();
//        System.out.println(timCungHoangDao());
        // Ep kieu
//        int a = 2, b = 3;
//        System.out.println("a + b = " + ((float)a + b) );
//        System.out.println("a / b =" + a / b * 1.0);
//        System.out.println("Tong a + b: "+ sum(a,b));

        // OOP
        HinhChuNhat h = new HinhChuNhat(7, 3);
        System.out.println("Dai: " + h.dai);
        System.out.println("Rong: " + h.rong);
        System.out.println("Chu vi hinh chu nhat: " + h.chuVi());
        System.out.println("Dien tich hinh chu nhat: " + h.dienTich());

        // Close object
        scanner.close();
    }
}