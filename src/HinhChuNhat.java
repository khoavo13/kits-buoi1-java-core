public class HinhChuNhat {
    public float dai;
    public float rong;

    public HinhChuNhat(){
        this.dai = 0;
        this.rong = 0;
    }

    public HinhChuNhat(int d, int r){
        this.dai = d;
        this.rong = r;
    }

    public float chuVi(){
        return 2 * (this.dai + this.rong);
    }
    public float dienTich(){
        return this.dai * this.rong;
    }
}
