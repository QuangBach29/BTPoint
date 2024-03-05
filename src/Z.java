public class Z extends X{
    public Z(){
        super();
        System.out.println("Z to");
    }

    @Override
    public void getA() {
        System.out.println("Z to");
    }
    public void getA(String x){
        System.out.println("Z to");
    }

    public static void main(String[] args) {
        Z z = new Z();
        z.getA();
    }
}

//Ghi đè : xuất hiện ở lớp con , cùng tên cùng tham số với hàm ở lớp cha
//Nạp chồng : ở trong cùng 1 lớp, cùng tên, khác tham số truyền vào
//Đa hình : là 1 tính chất của OOP, cùng 1 tên nhưng làm nhiều việc
//constructor có nạp chồng ko? có
//constructor có ghi đè ko? không

//Đa hình runtime : ghi đè
//đa hình compile : nạp chồng
