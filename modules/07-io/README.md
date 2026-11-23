# 07 — I/O

Đọc ghi file bằng `java.nio.file`. Luôn nêu charset. `FileReader` dùng charset mặc định của máy, tiếng Việt hỏng khi máy không phải UTF-8. `Files.write` và `Files.readAllLines` tự đóng file. Nếu tự mở stream, dùng try-with-resources.

## Bài khởi động

Sửa `src/main/java/com/javabase/io/DocGhiVanBan.java`.

Đề: `src/test/java/com/javabase/io/DocGhiVanBanTest.java`. JUnit tạo thư mục tạm qua `@TempDir` rồi xóa sau test.

```bash
./mvnw test -Dtest=DocGhiVanBanTest
```

## Hợp đồng

- `ghiDong` ghi mỗi chuỗi một dòng, UTF-8, ghi đè file cũ, tạo thư mục cha nếu thiếu.
- `docDong` đọc lại đúng các dòng. File không có thì `IOException`.
- `file` hoặc danh sách `null` thì `NullPointerException`.

## Gợi ý

`Files.createDirectories` trên thư mục cha, rồi `Files.write(file, dong, StandardCharsets.UTF_8)`. Đọc bằng `Files.readAllLines` cùng charset. Cha của một file ngay gốc có thể `null`: chỉ tạo thư mục khi cha khác `null`.

## Xong khi

- `DocGhiVanBanTest` xanh.
- Chỗ ghi và chỗ đọc đều nêu `StandardCharsets.UTF_8`.
- Bạn không để `catch` rỗng quanh `IOException`.

Tiếp theo: [08 — Đồng thời](../08-dong-thoi/README.md).
