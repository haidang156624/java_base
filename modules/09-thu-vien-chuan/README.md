# 09 — Thư viện chuẩn cần thuộc

Phần này không phải «học cả JDK». Bốn mảng hay đụng khi viết Java hàng ngày: `java.time`, `Optional`, `Objects`, `String` / `StringBuilder`. Bài khởi động khóa `java.time` và `Optional`. `Objects` bạn đã dùng ở các module trước nếu làm đúng gợi ý.

## Bài khởi động

Sửa `src/main/java/com/javabase/stdlib/LichHen.java`.

Đề: `src/test/java/com/javabase/stdlib/LichHenTest.java`.

```bash
./mvnw test -Dtest=LichHenTest
```

## Hợp đồng

- `docNgay` đọc đúng `2026-11-23`. Không cắt khoảng trắng. Sai định dạng thì `DateTimeParseException`.
- `soNgayNua` là số ngày lịch từ mốc này đến mốc kia. Cùng ngày thì 0, quá khứ thì âm, năm nhuận vẫn đúng. Dùng hai đối số, đừng gọi `LocalDate.now`.
- `tenDaiNhat` bỏ `null` và chuỗi blank, không `trim` tên còn chữ. Hòa độ dài thì trả về một tên trong nhóm dài nhất. Không có tên thì `Optional.empty`. List `null` thì `NullPointerException`.

## Gợi ý

`LocalDate.parse`. `ChronoUnit.DAYS.between`. Với tên, duyệt một lần, nhớ tên dài nhất hiện tại. `Optional.of` chỉ nhận giá trị khác `null`.

## Xong khi

- `LichHenTest` xanh.
- Bạn không tính số ngày bằng cách chia milli giây.
- Bạn không gọi `Optional.get` khi chưa biết có giá trị.
- Quay lại module nào còn đỏ trước khi coi là xong nền.

Hết lộ trình bài khởi động. Bài tự thêm sau này để cùng package, kèm test mới.
