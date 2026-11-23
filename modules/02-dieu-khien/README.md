# 02 — Luồng điều khiển

`if` cho điều kiện chồng nhau. `switch` khi một giá trị rẽ vào vài nhánh cố định. Vòng lặp khi số lần lặp phụ thuộc dữ liệu. Sai một dấu mốc (`>` thay vì `>=`) là sai cả bảng điểm.

## Bài khởi động

Sửa `src/main/java/com/javabase/flow/XepLoai.java`.

Đề: `src/test/java/com/javabase/flow/XepLoaiTest.java`.

```bash
./mvnw test -Dtest=XepLoaiTest
```

## Hợp đồng

- Điểm 0..10: `>= 9` Giỏi, `>= 7` Khá, `>= 5` Trung bình, còn lại trong thang là Yếu. Ngoài thang, `NaN` hoặc vô cực thì `IllegalArgumentException`.
- Thứ 1..7: Thứ Hai … Chủ Nhật. Hãy dùng `switch`. Ngoài khoảng thì `IllegalArgumentException`.
- `tongChanDen`: tổng các số chẵn từ 1 đến `n`. `n < 1` thì 0. Hãy viết vòng lặp.

## Gợi ý

Xét mốc cao trước. Với `switch` kiểu biểu thức (`->`), không cần `break`. Trong `for`, chấm dứt đúng chỗ: số chẵn cuối cùng phải được cộng nếu nó bằng `n`.

## Xong khi

- `XepLoaiTest` xanh.
- Bạn chỉ ra được mốc 9, 7 và 5 thuộc nhánh nào.
- `thuTrongTuan` viết bằng `switch`, `tongChanDen` viết bằng vòng lặp.

Tiếp theo: [03 — Hướng đối tượng](../03-oop/README.md).
