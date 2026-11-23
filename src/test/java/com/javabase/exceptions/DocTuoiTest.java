package com.javabase.exceptions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Đặc tả của bài. Đừng sửa file này để làm test xanh.
 */
@DisplayName("Checked exception khi dữ liệu sai")
class DocTuoiTest {

    @Test
    @DisplayName("DuLieuKhongHopLeException là checked exception")
    void laCheckedException() {
        assertEquals(Exception.class, DuLieuKhongHopLeException.class.getSuperclass());
        assertFalse(RuntimeException.class.isAssignableFrom(DuLieuKhongHopLeException.class));
    }

    @Test
    @DisplayName("Tuổi hợp lệ, có cắt khoảng trắng")
    void tuoiHopLe() throws DuLieuKhongHopLeException {
        assertEquals(25, DocTuoi.docTuoi("25"));
        assertEquals(25, DocTuoi.docTuoi("  25  "));
        assertEquals(0, DocTuoi.docTuoi("0"));
        assertEquals(150, DocTuoi.docTuoi("150"));
    }

    @Test
    @DisplayName("Rỗng, không phải số, hoặc ngoài 0..150")
    void tuoiKhongHopLe() {
        assertTuoiSai(null);
        assertTuoiSai("");
        assertTuoiSai("   ");
        assertTuoiSai("abc");
        assertTuoiSai("25.5");
        assertTuoiSai("-1");
        assertTuoiSai("151");
        assertTuoiSai(" 151 ");
    }

    private static void assertTuoiSai(String raw) {
        DuLieuKhongHopLeException ex =
                assertThrows(DuLieuKhongHopLeException.class, () -> DocTuoi.docTuoi(raw));
        assertNotNull(ex.getMessage());
        assertFalse(ex.getMessage().isBlank(), "message không được trống");
    }
}
