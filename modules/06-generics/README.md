# 06 — Generics

Tham số kiểu giúp một lớp hoặc một phương thức dùng được cho nhiều kiểu mà vẫn được trình biên dịch kiểm tra. `List<Integer>` không phải `List<Number>`: danh sách số nguyên không được đưa vào chỗ có thể `add` một `Double`. Muốn đọc số từ nhiều dạng list, dùng `List<? extends Number>` hoặc `<T extends Number>`.

## Bài khởi động

Sửa `src/main/java/com/javabase/generics/HopGiaTri.java`.

Đề: `src/test/java/com/javabase/generics/HopGiaTriTest.java`.

```bash
./mvnw test -Dtest=HopGiaTriTest
```

## Hợp đồng

- Hộp mới thì rỗng. `dat(null)` ném `NullPointerException` và không xóa giá trị đang có. `lay` khi rỗng ném `NoSuchElementException`.
- `dauTienKhacNull` trả phần tử khác `null` đầu tiên. Hết thì `NoSuchElementException`. List `null` thì `NullPointerException`.
- `tongSo` cộng mọi phần tử. List rỗng thì 0. `List<Integer>` và `List<Double>` đều gọi được.

## Gợi ý

`null` không phân biệt được «chưa cất» và «đã cất null», nên hộp cần một trạng thái riêng và hãy từ chối `null`. Đừng đổi chữ ký `tongSo` thành `List<Number>`: test sẽ không biên dịch.

## Xong khi

- `HopGiaTriTest` xanh.
- Bạn giải thích được vì sao `List<Integer>` không truyền vào `List<Number>`.
- Bạn không dùng raw type `List` không có tham số kiểu.

Tiếp theo: [07 — I/O](../07-io/README.md).
