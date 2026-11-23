# 04 — Collections

`List` giữ trùng và có thứ tự. `HashSet` loại trùng theo `equals` và `hashCode`, không có thứ tự. `HashMap` tìm theo khóa cùng quy tắc đó. Quên `hashCode` thì hai đối tượng `equals` vẫn nằm hai chỗ trong set.

## Bài khởi động

Sửa:

- `src/main/java/com/javabase/collections/HocVien.java` — viết `equals` và `hashCode` theo mã. Constructor và getter cho sẵn.
- `src/main/java/com/javabase/collections/NhomHocVien.java` — nhóm không trùng mã.

Đề: `src/test/java/com/javabase/collections/NhomHocVienTest.java`.

```bash
./mvnw test -Dtest=NhomHocVienTest
```

## Hợp đồng

- Cùng mã thì bằng nhau, dù tên khác. Khác mã thì không bằng nhau. `equals(null)` là `false`, không ném.
- `them` trả `true` khi mã mới, `false` khi mã đã có. `null` thì `NullPointerException`.
- `coMa(null)` trả `false`. `soLuong` là số mã khác nhau.

## Gợi ý

`Objects.equals` và `Objects.hashCode` trên mã. `HashSet.add` trả đúng `true`/`false` bạn cần, sau khi `equals`/`hashCode` đúng. Đừng lấy tên làm khóa.

## Xong khi

- `NhomHocVienTest` xanh.
- Bạn giải thích được vì sao chỉ viết `equals` là chưa đủ với `HashSet`.
- Bạn không dùng field đổi được (số dư, tên có thể sửa) làm `hashCode`.

Tiếp theo: [05 — Ngoại lệ](../05-ngoai-le/README.md).
