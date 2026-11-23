package com.javabase.concurrency;

import java.util.List;

/**
 * Tổng một danh sách bằng {@link java.util.concurrent.ExecutorService}.
 *
 * <p>Sửa lớp này. Giữ nguyên chữ ký, đừng thêm checked exception.
 * Mỗi tác vụ trả về một phần tổng. Luồng gọi cộng các kết quả sau {@code Future.get}.
 * Đừng cộng dồn vào một biến dùng chung. Gọi {@code shutdown} trong {@code finally}.
 * {@code InterruptedException} thì khôi phục cờ interrupt rồi bọc bằng {@link IllegalStateException}.
 */
public final class TinhSongSong {

    private TinhSongSong() {
    }

    /**
     * Tổng các phần tử.
     *
     * <p>Kiểm tra theo thứ tự: {@code so} null, rồi {@code soLuong < 1}, rồi danh sách rỗng.
     * Danh sách rỗng và {@code soLuong} hợp lệ thì trả {@code 0} mà không cần chạy pool.
     * Pool có {@code soLuong} luồng (không tạo thừa thread mới cho mỗi phần tử ngoài pool).
     * {@code soLuong} lớn hơn số phần tử vẫn phải chạy được.
     *
     * @throws NullPointerException     khi {@code so} là {@code null}, hoặc có phần tử {@code null}
     * @throws IllegalArgumentException khi {@code soLuong < 1}
     */
    public static long tong(List<Integer> so, int soLuong) {
        throw new UnsupportedOperationException("TODO: tổng bằng ExecutorService, kết quả là long, shutdown trong finally");
    }
}
