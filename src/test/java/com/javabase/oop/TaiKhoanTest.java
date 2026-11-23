package com.javabase.oop;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Đặc tả của bài. Đừng sửa file này để làm test xanh.
 */
@DisplayName("Đóng gói số dư tài khoản")
class TaiKhoanTest {

    @Test
    @DisplayName("Tạo tài khoản rồi đọc lại")
    void taoTaiKhoan() {
        TaiKhoan tk = new TaiKhoan("Nguyễn An", 1_000);
        assertEquals("Nguyễn An", tk.layChuSoHuu());
        assertEquals(1_000, tk.laySoDu());
    }

    @Test
    @DisplayName("Chủ sở hữu blank hoặc số dư âm thì từ chối")
    void taoKhongHopLe() {
        assertThrows(IllegalArgumentException.class, () -> new TaiKhoan(null, 0));
        assertThrows(IllegalArgumentException.class, () -> new TaiKhoan("", 0));
        assertThrows(IllegalArgumentException.class, () -> new TaiKhoan("  ", 0));
        assertThrows(IllegalArgumentException.class, () -> new TaiKhoan("An", -1));
    }

    @Test
    @DisplayName("Gửi và rút đúng số dư")
    void guiVaRut() {
        TaiKhoan tk = new TaiKhoan("An", 0);
        tk.gui(3_000_000_000L);
        assertEquals(3_000_000_000L, tk.laySoDu());
        tk.rut(1_000);
        assertEquals(2_999_999_000L, tk.laySoDu());
        tk.rut(2_999_999_000L);
        assertEquals(0, tk.laySoDu());
        assertEquals("An", tk.layChuSoHuu());
    }

    @Test
    @DisplayName("Gửi số tiền không dương thì số dư giữ nguyên")
    void guiKhongHopLe() {
        TaiKhoan tk = new TaiKhoan("An", 10);
        assertThrows(IllegalArgumentException.class, () -> tk.gui(0));
        assertThrows(IllegalArgumentException.class, () -> tk.gui(-5));
        assertEquals(10, tk.laySoDu());
    }

    @Test
    @DisplayName("Rút quá số dư hoặc số không dương thì số dư giữ nguyên")
    void rutKhongHopLe() {
        TaiKhoan tk = new TaiKhoan("An", 100);
        assertThrows(IllegalArgumentException.class, () -> tk.rut(150));
        assertThrows(IllegalArgumentException.class, () -> tk.rut(0));
        assertThrows(IllegalArgumentException.class, () -> tk.rut(-1));
        assertEquals(100, tk.laySoDu());
    }
}
