public class ArrayMethod {
    public enum Day{
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    };
    public static final double PI = 3.14;
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        for (int n : numbers){
            System.out.println(n);
        }

        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.println(matrix[i][j]);
            }
        }
        int tong = 0;
        for (int i = 0; i < matrix.length; i++){
            tong += matrix[i][i];
        }
        System.out.println("Tong duong cheo chinh: " + tong);
        Day day = Day.MONDAY;
    }
}
