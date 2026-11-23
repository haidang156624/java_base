package com.javabase.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/**
 * Đặc tả của bài. Đừng sửa file này để làm test xanh.
 */
@DisplayName("Đọc ghi văn bản UTF-8")
class DocGhiVanBanTest {

    @Test
    @DisplayName("Ghi rồi đọc lại, kể cả thư mục cha chưa có")
    void ghiRoiDoc(@TempDir Path thuMuc) throws IOException {
        Path file = thuMuc.resolve("con/chau/ghi-chu.txt");
        DocGhiVanBan.ghiDong(file, List.of("Xin chào", "Java"));
        assertEquals(List.of("Xin chào", "Java"), DocGhiVanBan.docDong(file));
    }

    @Test
    @DisplayName("Ghi đè file cũ")
    void ghiDe(@TempDir Path thuMuc) throws IOException {
        Path file = thuMuc.resolve("a.txt");
        DocGhiVanBan.ghiDong(file, List.of("cũ"));
        DocGhiVanBan.ghiDong(file, List.of("mới"));
        assertEquals(List.of("mới"), DocGhiVanBan.docDong(file));
    }

    @Test
    @DisplayName("Danh sách rỗng và dòng rỗng")
    void rong(@TempDir Path thuMuc) throws IOException {
        Path file = thuMuc.resolve("rong.txt");
        DocGhiVanBan.ghiDong(file, List.of());
        assertEquals(List.of(), DocGhiVanBan.docDong(file));

        DocGhiVanBan.ghiDong(file, List.of(""));
        assertEquals(List.of(""), DocGhiVanBan.docDong(file));
    }

    @Test
    @DisplayName("File là UTF-8, không phụ thuộc charset mặc định")
    void ghiUtf8(@TempDir Path thuMuc) throws IOException {
        Path file = thuMuc.resolve("tieng-viet.txt");
        DocGhiVanBan.ghiDong(file, List.of("à"));
        String noiDung = Files.readString(file, StandardCharsets.UTF_8);
        assertTrue(noiDung.contains("à"));
    }

    @Test
    @DisplayName("File không tồn tại")
    void khongCoFile(@TempDir Path thuMuc) {
        Path file = thuMuc.resolve("khong-co.txt");
        assertThrows(IOException.class, () -> DocGhiVanBan.docDong(file));
    }

    @Test
    @DisplayName("Đối số null")
    void doiSoNull(@TempDir Path thuMuc) {
        Path file = thuMuc.resolve("a.txt");
        assertThrows(NullPointerException.class, () -> DocGhiVanBan.ghiDong(null, List.of("a")));
        assertThrows(NullPointerException.class, () -> DocGhiVanBan.ghiDong(file, null));
        assertThrows(NullPointerException.class, () -> DocGhiVanBan.docDong(null));
    }
}
