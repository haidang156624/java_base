# 03 — Lập trình hướng đối tượng

Đóng gói nghĩa là dữ liệu private và mọi thay đổi đi qua phương thức có kiểm tra. Số dư không âm là bất biến của tài khoản: rút quá số dư thì từ chối và giữ nguyên số cũ.

Bài này cố ý không luyện kế thừa. `TaiKhoan` là `final`. Khi bài đã xanh, nếu muốn luyện thêm thì tạo interface trong cùng package, đừng sửa test cũ.

## Bài khởi động

Sửa `src/main/java/com/javabase/oop/TaiKhoan.java`.

Đề: `src/test/java/com/javabase/oop/TaiKhoanTest.java`.

```bash
./mvnw test -Dtest=TaiKhoanTest
```

## Hợp đồng

- Chủ sở hữu không null, không blank. Số dư ban đầu `>= 0`. Sai thì `IllegalArgumentException`.
- `gui` chỉ nhận số `> 0`. `rut` chỉ nhận số `> 0` và không vượt số dư.
- Thao tác bị từ chối thì số dư giữ nguyên.
- Không có cách nào gán số dư từ bên ngoài lớp.

## Gợi ý

Kiểm tra đối số trước khi đổi field. Số dư dùng `long`: số tiền trong test lớn hơn giới hạn của `int`.

## Xong khi

- `TaiKhoanTest` xanh.
- Field không `public`.
- Bạn nói được vì sao phải kiểm tra trước khi trừ số dư.
- Một câu về phần chưa làm trong bài: interface là hợp đồng chung cho nhiều lớp. Abstract class dùng khi muốn chia sẻ một phần code. Đừng kế thừa chỉ để gọi cho tiện.

Tiếp theo: [04 — Collections](../04-collections/README.md).
