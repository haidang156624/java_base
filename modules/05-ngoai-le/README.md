# 05 — Ngoại lệ

Unchecked (`RuntimeException` và con của nó) là lỗi lập trình hoặc trạng thái không cần khai báo. Checked là việc người gọi bắt buộc phải xử lý, ví dụ dữ liệu đầu vào sai mà bạn muốn bắt họ nhìn thấy. Nuốt exception bằng `catch` rỗng làm mất lỗi.

`DuLieuKhongHopLeException` cho sẵn và là checked exception. Một test của bài này xanh từ đầu vì lớp đó đã đúng. Phần bạn viết là `DocTuoi`.

## Bài khởi động

Sửa `src/main/java/com/javabase/exceptions/DocTuoi.java`.

Đề: `src/test/java/com/javabase/exceptions/DocTuoiTest.java`.

```bash
./mvnw test -Dtest=DocTuoiTest
```

## Hợp đồng

Tuổi hợp lệ là số nguyên 0..150 sau khi cắt khoảng trắng hai đầu. `null`, blank, không phải số nguyên, hoặc ngoài khoảng thì ném `DuLieuKhongHopLeException` với message không trống.

## Gợi ý

`trim` rồi `Integer.parseInt`. `NumberFormatException` là unchecked: bắt nó và ném checked exception của bài, đừng để `parseInt` ném thẳng ra. Kiểm tra khoảng sau khi đã có số.

## Xong khi

- `DocTuoiTest` xanh.
- Chữ ký vẫn có `throws DuLieuKhongHopLeException`.
- Bạn chỉ ra được một chỗ trong code cũ của mình từng nuốt exception. Nếu chưa nhớ ra chỗ nào, viết một câu: `catch` rỗng làm người gọi tưởng là thành công.

Tiếp theo: [06 — Generics](../06-generics/README.md).
