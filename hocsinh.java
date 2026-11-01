
import java.util.Scanner;



class hocsinh{      
    private String masv;
    private String hoten;
    private String lop;
    private double diemtb;
    
    
    // phương thức khởi tạo
    public hocsinh(){
        masv = "";
        hoten = "";
        lop = "";
        diemtb = 0.0;         
    }
    
    // phương thức nhập
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien: ");
        masv = sc.nextLine();
        System.out.println("Nhap ho ten sinh vien: ");
        hoten = sc.nextLine();
        System.out.println("Nhap lop: ");
        lop = sc.nextLine();
        System.out.println("Nhap diem trung binh: ");
        diemtb = sc.nextDouble();
        sc.nextLine();
        
    }
    
    // phương thức xuất
    public void xuat(){
        System.out.println("Ma sinh vien: " + masv + " | Ho ten: " + hoten + " | Lop: " + lop + " | Diem TB: " + diemtb );
                     
    }
    
    // lấy điểm tb
    public double laydiemtb(){
        return diemtb;
    }
     
}


// hàm chính
public class Mainnn{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // nhap xuất 1 học sinh
        //hocsinh dc = new hocsinh();
        //dc.nhap();
        //dc.xuat();
        
        
        //nhap xuất n học sinh
        System.out.println("Nhap n hoc sinh: ");
        int n = sc.nextInt();
        
        
        // mang chua n danh sach hoc sinh
        hocsinh[] hs = new hocsinh[n];
        for( int i = 0; i < n; i++ ){
            System.out.println("Nhap hoc sinh thu " + ( i + 1 ) + " : ");
            hs[i] = new hocsinh();
            hs[i].nhap();
            
        }
        // In mang n hoc sinh
        for( int i = 0; i < n; i++ ){
            System.out.println("Hoc sinh thu " + ( i + 1 ) + " : ");
            hs[i].xuat();
            
        }
        
        
        // tìm học sinh điểm TB cao nhất
        hocsinh hsmax = hs[0];
        hocsinh hsmix = hs[0];
        for( int i = 1; i < n; i++){
            if(hs[i].laydiemtb() > hsmax.laydiemtb()){
                hsmax = hs[i];    
            }
            if(hs[i].laydiemtb() < hsmix.laydiemtb()){
                hsmix = hs[i];
            }
        }
        
        
        // xuất hs diem tb cao nhất
        System.out.println("Diem trung binh cao nhat la: ");
        hsmax.xuat();
        
        // hs thấp nhát 
        System.out.println("Diem trung binh thap nhat la: ");
        hsmix.xuat();
        
        
        //Ví dụ dễ hình dung:
        //Có danh sách điểm: 8, 9, 7, 9.5
        //Bắt đầu: hsMax = 8 (người đầu tiên)
        //Kiểm tra 9 → cao hơn 8 → hsMax = 9
        //Kiểm tra 7 → thấp hơn → bỏ qua
        //Kiểm tra 9.5 → cao hơn 9 → hsMax = 9.5
        //→ Kết quả cuối cùng tìm ra được 9.5 là cao nhất ✅
         
    }
    
}
