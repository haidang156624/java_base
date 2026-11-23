package com.javabase.types;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Đặc tả của bài. Đừng sửa file này để làm test xanh.
 */
@DisplayName("So sánh giá trị, không so danh tính")
class SoSanhGiaTriTest {

    @Test
    @DisplayName("int so bằng ==")
    void soNguyen() {
        assertTrue(SoSanhGiaTri.cungGiaTriNguyen(3, 3));
        assertFalse(SoSanhGiaTri.cungGiaTriNguyen(3, 4));
    }

    @Test
    @DisplayName("Integer ngoài cache -128..127 vẫn bằng nhau theo giá trị")
    void integerTheoGiaTri() {
        Integer a = 200;
        Integer b = 200;
        assertTrue(SoSanhGiaTri.cungGiaTriHop(a, b));
        assertTrue(SoSanhGiaTri.cungGiaTriHop(127, 127));
    }

    @Test
    @DisplayName("Integer null")
    void integerNull() {
        assertTrue(SoSanhGiaTri.cungGiaTriHop(null, null));
        assertFalse(SoSanhGiaTri.cungGiaTriHop(null, 1));
        assertFalse(SoSanhGiaTri.cungGiaTriHop(1, null));
    }

    @Test
    @DisplayName("String so nội dung, kể cả hai đối tượng khác nhau")
    void chuoiTheoNoiDung() {
        String a = new String("java");
        String b = "java";
        assertTrue(SoSanhGiaTri.cungNoiDung(a, b));
        assertFalse(SoSanhGiaTri.cungNoiDung("java", "Java"));
    }

    @Test
    @DisplayName("String null")
    void chuoiNull() {
        assertTrue(SoSanhGiaTri.cungNoiDung(null, null));
        assertFalse(SoSanhGiaTri.cungNoiDung(null, "java"));
        assertFalse(SoSanhGiaTri.cungNoiDung("java", null));
    }

    @Test
    @DisplayName("Ghép họ tên bằng một dấu cách, không đổi chuỗi gốc")
    void ghepHoTen() {
        String ho = "Nguyễn";
        String ten = "An";
        assertEquals("Nguyễn An", SoSanhGiaTri.ghepHoTen(ho, ten));
        assertEquals("Nguyễn", ho);
        assertEquals("An", ten);
    }
}
