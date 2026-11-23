# 01 — Kiểu dữ liệu và String

`int` là giá trị. `Integer` và `String` là đối tượng. `==` với đối tượng so hai biến có cùng một ô nhớ hay không, không so nội dung. `Integer` từ -128 đến 127 thường được cache nên `==` đôi khi đúng, rồi sai ngay khi ra ngoài khoảng đó.

## Bài khởi động

Sửa `src/main/java/com/javabase/types/SoSanhGiaTri.java`.

Đề: `src/test/java/com/javabase/types/SoSanhGiaTriTest.java`.

```bash
./mvnw test -Dtest=SoSanhGiaTriTest
```

## Hợp đồng

- `cungGiaTriNguyen`: hai `int`.
- `cungGiaTriHop`: hai `Integer`, chịu được `null`. Cả hai `null` là bằng nhau.
- `cungNoiDung`: hai `String`, cùng quy tắc null.
- `ghepHoTen`: một dấu cách ở giữa. Chuỗi gốc không đổi vì `String` không sửa được.

## Gợi ý

`Objects.equals` so giá trị và không ném khi gặp `null`. Nối chuỗi bằng `+` tạo chuỗi mới.

## Xong khi

- `SoSanhGiaTriTest` xanh.
- Bạn giải thích được vì sao hai `Integer` cùng giá trị 200 có thể khác nhau với `==`.
- Bạn không gọi `.equals` trên biến có thể `null`.

Tiếp theo: [02 — Điều khiển](../02-dieu-khien/README.md).
