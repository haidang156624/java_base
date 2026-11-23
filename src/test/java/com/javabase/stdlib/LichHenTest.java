package com.javabase.stdlib;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Đặc tả của bài. Đừng sửa file này để làm test xanh.
 */
@DisplayName("java.time và Optional")
class LichHenTest {

    @Test
    @DisplayName("Đọc ngày ISO-8601")
    void docNgay() {
        assertEquals(LocalDate.of(2026, 11, 23), LichHen.docNgay("2026-11-23"));
    }

    @Test
    @DisplayName("Chuỗi không phải ngày ISO")
    void ngaySai() {
        assertThrows(DateTimeParseException.class, () -> LichHen.docNgay("23/11/2026"));
        assertThrows(DateTimeParseException.class, () -> LichHen.docNgay("2026-02-31"));
        assertThrows(NullPointerException.class, () -> LichHen.docNgay(null));
    }

    @Test
    @DisplayName("Số ngày theo lịch, kể cả năm nhuận")
    void soNgay() {
        LocalDate homNay = LocalDate.of(2026, 11, 23);
        assertEquals(0, LichHen.soNgayNua(homNay, homNay));
        assertEquals(10, LichHen.soNgayNua(homNay, LocalDate.of(2026, 12, 3)));
        assertEquals(-1, LichHen.soNgayNua(homNay, LocalDate.of(2026, 11, 22)));
        assertEquals(2, LichHen.soNgayNua(LocalDate.of(2024, 2, 28), LocalDate.of(2024, 3, 1)));
    }

    @Test
    @DisplayName("Thiếu một mốc ngày")
    void thieuMoc() {
        LocalDate ngay = LocalDate.of(2026, 11, 23);
        assertThrows(NullPointerException.class, () -> LichHen.soNgayNua(null, ngay));
        assertThrows(NullPointerException.class, () -> LichHen.soNgayNua(ngay, null));
    }

    @Test
    @DisplayName("Tên dài nhất, bỏ null và blank")
    void tenDaiNhat() {
        assertEquals(Optional.of("Minh"), LichHen.tenDaiNhat(List.of("An", "Minh", "Ba")));
        assertEquals(Optional.empty(), LichHen.tenDaiNhat(List.of()));
        assertEquals(Optional.empty(), LichHen.tenDaiNhat(Arrays.asList(null, "  ", "")));
        assertThrows(NullPointerException.class, () -> LichHen.tenDaiNhat(null));
    }

    @Test
    @DisplayName("Hòa độ dài thì trả về một tên trong nhóm dài nhất")
    void hoaDoDai() {
        Optional<String> ketQua = LichHen.tenDaiNhat(List.of("An", "Ba", "Be"));
        assertTrue(ketQua.isPresent());
        assertEquals(2, ketQua.orElseThrow().length());
        assertTrue(List.of("An", "Ba", "Be").contains(ketQua.orElseThrow()));
    }

    @Test
    @DisplayName("Không cắt khoảng trắng của tên còn nội dung")
    void khongTrim() {
        assertEquals(Optional.of(" An"), LichHen.tenDaiNhat(List.of("An", " An")));
    }
}
