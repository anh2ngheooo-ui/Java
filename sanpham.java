import java.util.Scanner;


 // lớp cha sanpham
class SanPham{
    private String masp;
    private String tensp;
    private String mota;
    private double dongia;
      
    // phương thức khởi tạo
    public SanPham(){
        masp = "";
        tensp = "";
        mota = "";
        dongia = 0.0;
    
}
    
    
    // phương thức nhập
    public void nhap(){
        Scanner sc = new Scanner(System.in);  // mở cổng nhập dữ liệu từ bàn phím
        System.out.println("Nhap ma san pham: ");
        masp = sc.nextLine();
        System.out.println("Nhap ten san pham: ");
        tensp = sc.nextLine();
        System.out.println("Nhap mo ta san pham: ");
        mota = sc.nextLine();
        System.out.println("Nhap don gia: ");
        dongia = sc.nextDouble();
        sc.nextLine();
    }
    
    
    // phương thức xuât 
    public void xuat(){
        System.out.println(" Ma san pham: " + masp + " | Ten san pham: " + tensp + " | Mo ta: " + mota + " | Don gia: " + dongia );
           
    }
    
    // phương thức lấy đơn giá
    public double laydongia(){
        return dongia;
    }
}
      
class ThoiTrang extends SanPham{
        // thuộc tính riêng
        private String mausac;
        private String co; 
        private double giagiatang;
        
        // phương thức khởi tạo
        public ThoiTrang(){
            super();  // gọi hàm khởi tạo lớp cha
            mausac = "";
            co = "";
            giagiatang = 0.0;
        
    }
        // phương thức nhập
        public void nhap(){
            super.nhap();
            Scanner sc = new Scanner(System.in);  // mở cổng nhập dữ liệu từ bàn phím
            System.out.println("Nhap mau sac san pham: ");
            mausac = sc.nextLine();
            System.out.println("Nhap co san pham: ");
            co = sc.nextLine();
            System.out.println("Nhap gia gia tang: ");
            giagiatang = sc.nextDouble();
            sc.nextLine();
        }
        
        public void xuat(){
            super.xuat();
            System.out.println(" Mau sac san pham: " + mausac + " | Co san pham: " + co + " | Gia gia tang: " + giagiatang + " | Gia ban: " + laydongia() );
    }
  
        
        public double laydongia(){
            return super.laydongia() + giagiatang;
        }
        
    }
    
                                  

public class Mainn{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
           
        // nhap xuất 1 sản phẩm
        //SanPham sp = new SanPham();
        //sp.nhap();
        //sp.xuat();
        
        // nhap n san pham
        System.out.println("Nhap n san pham: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        // mang chua danh sach san pham
        ThoiTrang[] tt = new ThoiTrang[n];
        
        for( int i = 0; i < n; i ++){
            System.out.println("Nhap san pham thu " + ( i + 1 ) + ":");
            tt[i] = new ThoiTrang();
            tt[i].nhap();            
        }
        
        //In thong tin
        System.out.println("---Danh Sach Thong Tin---");
         for( int i = 0; i < n; i ++){
            System.out.println("San pham thu " + ( i + 1 ) + ":");
            tt[i].xuat();            
        }
         
        
    }
    
    
}