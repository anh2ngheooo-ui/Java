package DangNgocSon;

import java.util.Scanner;

class HangHoa{
    
    // thuoc tinh
    private String MaHang;
    private String TenHang;
    
    // phuong thuc khoi tao
    public HangHoa(){}
    public HangHoa(String MaHang, String TenHang){
        this.MaHang = MaHang;
        this.TenHang = TenHang; 
    }
    
    // phuong thuc nhap
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma hang: ");
        this.MaHang = sc.nextLine();
        System.out.println("Nhap ten hang : ");
        this.TenHang = sc.nextLine();    
    }
    
    // phuong thuc xuat
    public void xuat(){
        System.out.println("Ma hang : " + this.MaHang );
        System.out.println("Ten hang : " + this.TenHang );  
    }
}
    class DienThoai extends HangHoa{  // kế thừa đơn
        
        // thuộc tính
        private String NhaSX;
        private int SoLuong;
        private float GiaNhap;
        // thuoc tinh tinh
        private static float TiLeTrietKhau = 10;
        
        // khởi tạo
        public DienThoai(){}
        public DienThoai(String MaHang, String TenHang, String NhaSX, int SoLuong, float GiaNhap ){
            
            // gọi phương khởi tạo lớp cơ sở => biểu hiện kế thừa
            super(MaHang, TenHang);
            this.NhaSX = NhaSX;
            this.SoLuong = SoLuong;
            this.GiaNhap = GiaNhap; 
        }
        // phương thức nhập
        @Override
        public void nhap(){
            super.nhap();
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap nha san xuat: ");
            this.NhaSX = sc.nextLine();
            System.out.println("Nhap so luong: ");
            this.SoLuong = sc.nextInt();
            System.out.println("Gia nhap: ");
            this.GiaNhap = sc.nextFloat();
        }
        
        // phương thức xuất
        @Override
        public void xuat(){
            
            // Gọi phương thức của lớp cơ sở => biểu hiện kế thừa
            super.xuat();
            System.out.println("Nha san xuat : " + this.NhaSX );
            System.out.println("So luong : " + this.SoLuong );
            System.out.println("Gia nhap : " + this.GiaNhap );
            System.out.println("Gia nhap thuc te : " + this.GiaNhapThucTe());
        }
        
        public float GiaNhapThucTe(){
            return this.GiaNhap - this.GiaNhap*this.TiLeTrietKhau/ 100;
            
        }     
    }
public class DangNgocSon{
    public static void main(String[]args){
        
        
        // nhap xuat 1 doi tuong 
        HangHoa hh = new HangHoa();
        hh.nhap();
        hh.xuat();
       
        // nhap xuat mang doi tuong 
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n : ");
        n = sc.nextInt();
        
        
        DienThoai[] dt = new DienThoai[n];
        for( int i = 0; i < n; i ++ ){
            
            // khởi tạo phần tử mảng
            dt[i] = new DienThoai();
            dt[i].nhap();
        }
        for( int i = 0; i < n; i ++ ){
            dt[i].xuat();
        }
    }
}

