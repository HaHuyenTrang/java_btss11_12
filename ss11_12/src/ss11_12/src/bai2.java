public class bai2 {
    //-Tại sao cần tính trừu tượng trong phần mềm phức tạp?
    //
        //Trong các phần mềm lớn, nếu tất cả các chi tiết được lộ ra, code sẽ trở nên phức tạp và khó bảo trì.
        //Tính trừu tượng giúp tách biệt giao diện và cài đặt, giúp lập trình viên có thể thay đổi cách thức hoạt động bên trong mà không ảnh hưởng đến các phần khác của chương trình.
        //Nó cũng giúp tăng khả năng tái sử dụng mã nguồn, vì các thành phần có thể được sử dụng mà không cần hiểu chi tiết bên trong.
    //-Sự khác biệt giữa lớp trừu tượng và giao diện trong Java
    //
    // +Lớp trừu tượng (abstract class):
        //Có thể chứa cả phương thức có cài đặt và phương thức trừu tượng.
        //Hỗ trợ biến thành viên (fields) và constructor.
        //Một lớp chỉ có thể kế thừa từ một lớp trừu tượng (Java không hỗ trợ đa kế thừa với class).
    // +Giao diện (interface):
        //Chỉ chứa các phương thức trừu tượng (trước Java 8) hoặc có thể có phương thức mặc định (default methods).
        //Không thể có biến thành viên (chỉ có hằng số).
        //Một lớp có thể triển khai (implement) nhiều giao diện, giúp hỗ trợ đa kế thừa.
    //-Liên hệ thực tế về tính trừu tượng
    //
        //Máy ATM: Người dùng chỉ cần nhập mã PIN, chọn số tiền rút mà không cần biết cách máy xử lý giao dịch bên trong.
        //Điều khiển TV: Người dùng chỉ cần nhấn nút bật/tắt mà không cần hiểu cách mạch điện hoạt động.
        //Ô tô: Người lái chỉ cần nhấn ga để xe di chuyển mà không cần biết cách động cơ hoạt động chi tiết.
}
