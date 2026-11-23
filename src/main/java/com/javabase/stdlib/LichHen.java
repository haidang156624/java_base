package com.javabase.stdlib;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

/**
 * Ngày trên lịch và {@link Optional}.
 *
 * <p>Sửa lớp này. Dùng {@code java.time}. Đừng gọi {@code LocalDate.now}: test truyền sẵn hai mốc,
 * không phụ thuộc ngày chạy máy. Đừng tự chia milli giây.
 */
public final class LichHen {

    private LichHen() {
    }

    /**
     * Đọc ngày ISO-8601, đúng dạng {@code 2026-11-23}. Không cắt khoảng trắng.
     *
     * @throws java.time.format.DateTimeParseException khi chuỗi không phải ngày ISO
     * @throws NullPointerException                    khi {@code iso} là {@code null}
     */
    public static LocalDate docNgay(String iso) {
        throw new UnsupportedOperationException("TODO: LocalDate.parse");
    }

    /**
     * Số ngày từ {@code homNay} đến {@code ngayHen}. Cùng ngày thì {@code 0}.
     * Ngày hẹn trong quá khứ thì số âm. Tính theo lịch, kể cả năm nhuận.
     *
     * @throws NullPointerException khi một trong hai mốc là {@code null}
     */
    public static long soNgayNua(LocalDate homNay, LocalDate ngayHen) {
        throw new UnsupportedOperationException("TODO: ChronoUnit.DAYS.between, đừng dùng LocalDate.now");
    }

    /**
     * Tên dài nhất theo {@link String#length}. Bỏ {@code null} và chuỗi blank.
     * Giữ nguyên tên còn nội dung, không {@code trim}.
     * Nhiều tên cùng độ dài thì trả về một tên bất kỳ trong nhóm dài nhất.
     * Không có tên dùng được thì {@link Optional#empty}.
     *
     * @throws NullPointerException khi {@code ten} là {@code null}
     */
    public static Optional<String> tenDaiNhat(List<String> ten) {
        throw new UnsupportedOperationException("TODO: Optional, bỏ null và blank, không trim tên còn nội dung");
    }
}
