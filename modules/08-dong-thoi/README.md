# 08 — Đồng thời, phần nền

`ExecutorService` giữ một số luồng và chạy tác vụ. `submit` trả `Future`. Kết quả chưa có cho đến khi `get`. `shutdown` giải phóng luồng. Quên `shutdown` thì chương trình có thể không thoát.

`giaTri++` trên một biến dùng chung không an toàn: hai luồng đọc cùng một số rồi cùng ghi lại, mất một lần tăng. Bài này tránh lỗi đó bằng cách mỗi tác vụ trả về phần của nó. Luồng gọi cộng sau khi mọi `get` xong.

## Bài khởi động

Sửa `src/main/java/com/javabase/concurrency/TinhSongSong.java`.

Đề: `src/test/java/com/javabase/concurrency/TinhSongSongTest.java`. Test có `@Timeout(5)` để một `get` bị kẹt không treo cả lần chạy.

```bash
./mvnw test -Dtest=TinhSongSongTest
```

## Hợp đồng

Kiểm tra theo thứ tự: list `null` thì `NullPointerException`, rồi `soLuong < 1` thì `IllegalArgumentException`, rồi list rỗng thì trả 0. Phần tử `null` thì `NullPointerException`. Tổng là `long`. Pool có `soLuong` luồng. `soLuong` lớn hơn số phần tử vẫn chạy được. Chữ ký không thêm checked exception.

## Gợi ý

`Executors.newFixedThreadPool`. Mỗi phần tử một tác vụ trả về `long` là đủ với danh sách nhỏ trong test. Cộng kết quả ở luồng gọi. `shutdown` đặt trong `finally`. Khi bị `InterruptedException`, gọi `Thread.currentThread().interrupt()` rồi ném `IllegalStateException`.

Test khóa kết quả, không đọc source. Trước khi coi là xong, mở lớp và kiểm tra có pool và có `shutdown`.

## Xong khi

- `TinhSongSongTest` xanh.
- Có `ExecutorService`, có chờ kết quả, có `shutdown` trong `finally`.
- Bạn nói được vì sao không cộng vào một `long` dùng chung từ nhiều luồng.

Tiếp theo: [09 — Thư viện chuẩn](../09-thu-vien-chuan/README.md).
