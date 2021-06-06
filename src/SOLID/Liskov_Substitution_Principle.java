package SOLID;

public class Liskov_Substitution_Principle {
}

// L : Liskov Substitution principle
// TRONG Một chương trình, object của class con có thể thay thế class cha mà không làm thay thế tính đúng đắn của chương trình

// example1
// Bạn có class cha là Con vịt,  các class vịt xiêm, vịt trời, vịt nhà đều có thể kế thừa class này,
// chương trinhf chạy bình thường, nhưng bạn viết một class là vịt chạy pin,  cần pin mới chạy được, khi class kế,
// thừa class cha, vì cần pin mới chạy được vậy nên gây  ra lỗi, đây là một trường hơp vi phạm nguyên lí này.


// example 2
/*
Tương ứng với chữ L trong SOLID, nguyên lý này là:
Object của Class con có thể thay thế Class cha mà không làm thay đổi tính đúng đắn của chương trình
Theo mình hiểu thì nguyên tắc này sẽ đảm bảo tính đa hình.
Mình sẽ quay lại ví dụ nhân viên ở trên. Công ty sẽ phân ra 2 loại nhân viên là nhân viên chính thức và thực tập.
Khác nhau sẽ là chính thức sẽ có bảo hiểm còn thực tập thì không.
 Giờ ở Class Employee có haveInsurance().
 Nếu Class Interns kế thừa lại Class Employee thì sẽ là sai vì thực tập không có bảo hiểm.
 Cách giải quyết vấn đề này thì chúng ta có thể tách hàm haveInsurance() sang một interface mới và các Class liên quan đến nhân viên chính thức có thể implements lại nó
 */
