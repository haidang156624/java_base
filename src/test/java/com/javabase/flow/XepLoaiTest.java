package com.javabase.flow;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Đặc tả của bài. Đừng sửa file này để làm test xanh.
 */
@DisplayName("Rẽ nhánh và vòng lặp")
class XepLoaiTest {

    @Test
    @DisplayName("Mốc điểm 9, 7, 5")
    void xepLoaiDungMoc() {
        assertAll(
                () -> assertEquals("Giỏi", XepLoai.theoDiem(10)),
                () -> assertEquals("Giỏi", XepLoai.theoDiem(9)),
                () -> assertEquals("Khá", XepLoai.theoDiem(8.9)),
                () -> assertEquals("Khá", XepLoai.theoDiem(7)),
                () -> assertEquals("Trung bình", XepLoai.theoDiem(6.9)),
                () -> assertEquals("Trung bình", XepLoai.theoDiem(5)),
                () -> assertEquals("Yếu", XepLoai.theoDiem(4.9)),
                () -> assertEquals("Yếu", XepLoai.theoDiem(0)));
    }

    @Test
    @DisplayName("Điểm ngoài thang thì từ chối")
    void diemNgoaiThang() {
        assertAll(
                () -> assertThrows(IllegalArgumentException.class, () -> XepLoai.theoDiem(-0.1)),
                () -> assertThrows(IllegalArgumentException.class, () -> XepLoai.theoDiem(10.1)),
                () -> assertThrows(IllegalArgumentException.class, () -> XepLoai.theoDiem(Double.NaN)),
                () -> assertThrows(IllegalArgumentException.class, () -> XepLoai.theoDiem(Double.POSITIVE_INFINITY)));
    }

    @Test
    @DisplayName("Thứ 1..7")
    void thuTrongTuan() {
        assertAll(
                () -> assertEquals("Thứ Hai", XepLoai.thuTrongTuan(1)),
                () -> assertEquals("Thứ Ba", XepLoai.thuTrongTuan(2)),
                () -> assertEquals("Thứ Tư", XepLoai.thuTrongTuan(3)),
                () -> assertEquals("Thứ Năm", XepLoai.thuTrongTuan(4)),
                () -> assertEquals("Thứ Sáu", XepLoai.thuTrongTuan(5)),
                () -> assertEquals("Thứ Bảy", XepLoai.thuTrongTuan(6)),
                () -> assertEquals("Chủ Nhật", XepLoai.thuTrongTuan(7)));
    }

    @Test
    @DisplayName("Thứ ngoài 1..7")
    void thuKhongHopLe() {
        assertThrows(IllegalArgumentException.class, () -> XepLoai.thuTrongTuan(0));
        assertThrows(IllegalArgumentException.class, () -> XepLoai.thuTrongTuan(8));
    }

    @Test
    @DisplayName("Tổng số chẵn")
    void tongChan() {
        assertEquals(0, XepLoai.tongChanDen(1));
        assertEquals(2, XepLoai.tongChanDen(2));
        assertEquals(12, XepLoai.tongChanDen(7));
        assertEquals(30, XepLoai.tongChanDen(10));
    }

    @Test
    @DisplayName("n < 1 thì tổng chẵn là 0")
    void tongChanKhiNBeHonMot() {
        assertEquals(0, XepLoai.tongChanDen(0));
        assertEquals(0, XepLoai.tongChanDen(-4));
    }
}
