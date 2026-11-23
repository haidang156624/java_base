# Java nền

Kho bài tập để ôn, lấp lỗ hổng và làm chắc Java nền. Mỗi bài có test sẵn. Test là đề. Bạn sửa code trong `src/main` cho đến khi test của bài đó xanh.

Lộ trình tuần, lỗi hay gặp và checklist xong từng module nằm ở `docs/java-base-roadmap.md` trong tài liệu dự án, không nằm trong repo Git này. Trong repo, làm lần lượt từ module 01 đến 09.

## Cách học

1. Đọc README của module (vài phút).
2. Mở file test. Đọc tên mỗi test: đó là quy tắc cần thỏa.
3. Sửa lớp trong `src/main/java`. Giữ nguyên chữ ký `public`.
4. Chạy đúng class test. Đỏ vì `UnsupportedOperationException: TODO` nghĩa là bài chưa làm, không phải test viết sai.
5. Dừng khi test của bài xanh và bạn trả lời được mục «Xong khi» trong README module.

Đừng sửa file trong `src/test` cho khớp với code đang sai. Đừng nhảy module khi bài trước còn đỏ.

Repo không có lớp `Main`. Mỗi bài là một lớp được kiểm bởi JUnit.

## Cách chạy test

Cần JDK 21 (`java -version` hiện số 21). Không cần cài Maven: lần chạy đầu `./mvnw` tự tải Maven.

```bash
./mvnw test
./mvnw test -Dtest=SoSanhGiaTriTest
```

Windows:

```bat
mvnw.cmd test
mvnw.cmd test "-Dtest=SoSanhGiaTriTest"
```

`./mvnw test` chạy mọi module. Các bài chưa làm sẽ đỏ. Đó là trạng thái đúng của repo lúc mới clone. Hãy chạy từng class test khi đang học một bài.

## Bố cục

| Module | Hướng dẫn | Package | Bài khởi động |
| --- | --- | --- | --- |
| 01 Kiểu dữ liệu | [README](modules/01-kieu-du-lieu/README.md) | `com.javabase.types` | `SoSanhGiaTri` |
| 02 Điều khiển | [README](modules/02-dieu-khien/README.md) | `com.javabase.flow` | `XepLoai` |
| 03 Hướng đối tượng | [README](modules/03-oop/README.md) | `com.javabase.oop` | `TaiKhoan` |
| 04 Collections | [README](modules/04-collections/README.md) | `com.javabase.collections` | `HocVien`, `NhomHocVien` |
| 05 Ngoại lệ | [README](modules/05-ngoai-le/README.md) | `com.javabase.exceptions` | `DocTuoi` |
| 06 Generics | [README](modules/06-generics/README.md) | `com.javabase.generics` | `HopGiaTri` |
| 07 I/O | [README](modules/07-io/README.md) | `com.javabase.io` | `DocGhiVanBan` |
| 08 Đồng thời | [README](modules/08-dong-thoi/README.md) | `com.javabase.concurrency` | `TinhSongSong` |
| 09 Thư viện chuẩn | [README](modules/09-thu-vien-chuan/README.md) | `com.javabase.stdlib` | `LichHen` |

```
src/main/java/com/javabase/    code bạn sửa
src/test/java/com/javabase/    đề, không sửa
modules/                       README từng module
```

Bài sau, khi bạn tự thêm, để cùng package với module đó và thêm một class test mới. Đừng đổi test cũ.

## Quy ước

- Java 21, mã nguồn UTF-8.
- Một module hiện có một bài khởi động. Đủ để bắt đầu. Chưa có lời giải.
- `DuLieuKhongHopLeException` được cho sẵn vì test cần đúng loại exception. Phần bạn viết là `DocTuoi`.
- Constructor và getter của `HocVien` cho sẵn. Phần bạn viết là `equals`, `hashCode` và `NhomHocVien`.
