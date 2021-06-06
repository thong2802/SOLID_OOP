package SOLID;

public class Open_Close_Principle {
}

// 2-0: Open / Close Principle
// bjects or entities should be open for extension, but closed for modification.
// -> Chung ta có thể thoải mở rộng class nhưng không được sửa đổi bất cứ gì bên trong class đó
// Khi chúng ta muốn thêm chức năng cho một chương trình / class nào đó : thì mình không nên chỉnh sửa
// class đó , mà mình nên tạo một class khác và extends class cũ , chứ mình không nên thêm, chỉnh sửa thẳng vào class
// Vì khi chúng ta chỉnh sửa thẳng vào class đó sẽ tạo ra nhiều hệ luỵ cho sau nà.
// Ví dụ khi bạn có một funtion A trả về một object là String và bạn dùng funtion này ở 50-60 chỗ khác, và giờ bạn muốn
// trả về là kiểu interger, thì bạn vào funtion sửa thành Interger, thì 50-60 chỗ khác sẽ bị error hết vì sai kiểu return.
// example
/*Tưởng tượng giờ bạn có một căn nhà, và giờ bạn muốn thêm 1 vườn thượng uyển như của các vị vua ngày xưa, bạn sẽ có 2 cách như sau:
        Cách 1: Sửa lại căn nhà và xây thêm 1 tầng hoặc phá bỏ 1 tầng đi để xây vườn
        Cách 2: Xây vườn ở một mảnh đất bên cạnh căn nhà
        Chắc gần như mọi người đều chọn cách 2 phải không. Và nguyên lý này cũng như vậy, khi bản muốn thêm một chức năng vào 1 Class đã tồn tại trước đây, tốt nhất bạn nên tạo 1 Class khác kế thừa lại Class đó. Điều này sẽ tránh được việc làm hỏng cấu trúc của Class cũ*/
