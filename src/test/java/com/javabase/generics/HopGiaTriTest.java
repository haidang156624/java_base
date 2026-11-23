package com.javabase.generics;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Đặc tả của bài. Đừng sửa file này để làm test xanh.
 */
@DisplayName("Generic, phương thức generic và wildcard")
class HopGiaTriTest {

    @Test
    @DisplayName("Hộp mới thì rỗng")
    void hopMoi() {
        HopGiaTri<String> hop = new HopGiaTri<>();
        assertTrue(hop.trong());
        assertThrows(NoSuchElementException.class, hop::lay);
    }

    @Test
    @DisplayName("Cất rồi lấy, lần sau ghi đè")
    void catVaLay() {
        HopGiaTri<String> chuoi = new HopGiaTri<>();
        chuoi.dat("A");
        assertFalse(chuoi.trong());
        assertEquals("A", chuoi.lay());
        chuoi.dat("B");
        assertEquals("B", chuoi.lay());

        HopGiaTri<Integer> so = new HopGiaTri<>();
        so.dat(5);
        assertEquals(5, so.lay());
    }

    @Test
    @DisplayName("dat(null) thì từ chối và giữ giá trị cũ")
    void tuChoiNull() {
        HopGiaTri<String> hop = new HopGiaTri<>();
        assertThrows(NullPointerException.class, () -> hop.dat(null));
        assertTrue(hop.trong());

        hop.dat("B");
        assertThrows(NullPointerException.class, () -> hop.dat(null));
        assertEquals("B", hop.lay());
    }

    @Test
    @DisplayName("Phần tử khác null đầu tiên, đúng kiểu của list")
    void dauTienKhacNull() {
        assertEquals("b", HopGiaTri.dauTienKhacNull(Arrays.asList(null, "b", "c")));
        assertEquals(2, HopGiaTri.dauTienKhacNull(Arrays.asList(null, 2, 3)));
    }

    @Test
    @DisplayName("Không có phần tử khác null")
    void khongCoPhanTu() {
        assertThrows(NoSuchElementException.class, () -> HopGiaTri.dauTienKhacNull(List.of()));
        assertThrows(NoSuchElementException.class, () -> HopGiaTri.dauTienKhacNull(Arrays.asList(null, null)));
        assertThrows(NullPointerException.class, () -> HopGiaTri.dauTienKhacNull(null));
    }

    @Test
    @DisplayName("List<Integer> và List<Double> đều cộng được")
    void tongNhieuKieuSo() {
        List<Integer> nguyen = List.of(1, 2, 3);
        List<Double> thuc = List.of(1.5, 2.5);
        assertEquals(6.0, HopGiaTri.tongSo(nguyen), 0.000001);
        assertEquals(4.0, HopGiaTri.tongSo(thuc), 0.000001);
        assertEquals(0.0, HopGiaTri.tongSo(List.of()), 0.000001);
    }

    @Test
    @DisplayName("tongSo từ chối null")
    void tongSoNull() {
        assertThrows(NullPointerException.class, () -> HopGiaTri.tongSo(null));
        assertThrows(NullPointerException.class, () -> HopGiaTri.tongSo(Arrays.asList(1, null)));
    }
}
