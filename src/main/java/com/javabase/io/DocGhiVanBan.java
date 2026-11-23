package com.javabase.io;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

/**
 * Ghi và đọc văn bản UTF-8.
 *
 * <p>Sửa lớp này. Dùng {@code java.nio.file}. Chỉ định {@code StandardCharsets.UTF_8}.
 * Đừng dùng {@code FileReader} hay {@code FileWriter}.
 */
public final class DocGhiVanBan {

    private DocGhiVanBan() {
    }

    /**
     * Ghi mỗi phần tử thành một dòng, ghi đè nếu file đã có.
     * Tạo thư mục cha khi chưa có.
     *
     * @throws NullPointerException khi {@code file} hoặc {@code dong} là {@code null}
     */
    public static void ghiDong(Path file, List<String> dong) throws IOException {
        throw new UnsupportedOperationException("TODO: ghi UTF-8, tạo thư mục cha, ghi đè file cũ");
    }

    /**
     * Đọc mọi dòng UTF-8. File rỗng thì trả danh sách rỗng.
     *
     * @throws NullPointerException khi {@code file} là {@code null}
     * @throws IOException          khi không đọc được, kể cả khi file không tồn tại
     */
    public static List<String> docDong(Path file) throws IOException {
        throw new UnsupportedOperationException("TODO: đọc mọi dòng UTF-8");
    }
}
