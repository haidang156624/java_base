package com.javabase.collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Đặc tả của bài. Đừng sửa file này để làm test xanh.
 */
@DisplayName("HashSet chỉ loại trùng khi equals và hashCode đúng")
class NhomHocVienTest {

    @Test
    @DisplayName("Cùng mã thì bằng nhau, kể cả khi khác tên")
    void cungMaThiBangNhau() {
        HocVien a = new HocVien("A1", "An");
        HocVien b = new HocVien("A1", "Bình");
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    @DisplayName("Khác mã thì không bằng nhau")
    void khacMa() {
        HocVien a = new HocVien("A1", "An");
        assertNotEquals(a, new HocVien("A2", "An"));
        assertFalse(a.equals(null));
        assertFalse(a.equals("A1"));
    }

    @Test
    @DisplayName("HashSet gộp hai học viên cùng mã")
    void hashSetGopTrungMa() {
        Set<HocVien> tap = new HashSet<>();
        tap.add(new HocVien("A1", "An"));
        tap.add(new HocVien("A1", "Bình"));
        tap.add(new HocVien("A2", "An"));
        assertEquals(2, tap.size());
    }

    @Test
    @DisplayName("Nhóm rỗng")
    void nhomRong() {
        NhomHocVien nhom = new NhomHocVien();
        assertEquals(0, nhom.soLuong());
        assertFalse(nhom.coMa("A1"));
        assertFalse(nhom.coMa(null));
    }

    @Test
    @DisplayName("Thêm trùng mã thì từ chối và giữ người đã có")
    void themTrungMa() {
        NhomHocVien nhom = new NhomHocVien();
        assertTrue(nhom.them(new HocVien("A1", "An")));
        assertFalse(nhom.them(new HocVien("A1", "Bình")));
        assertTrue(nhom.them(new HocVien("A2", "Chi")));
        assertEquals(2, nhom.soLuong());
        assertTrue(nhom.coMa("A1"));
        assertTrue(nhom.coMa("A2"));
        assertFalse(nhom.coMa("A3"));
        assertFalse(nhom.coMa(null));
    }

    @Test
    @DisplayName("Thêm null thì ném NullPointerException")
    void themNull() {
        NhomHocVien nhom = new NhomHocVien();
        assertThrows(NullPointerException.class, () -> nhom.them(null));
        assertEquals(0, nhom.soLuong());
    }
}
