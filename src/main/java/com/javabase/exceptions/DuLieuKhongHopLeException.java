package com.javabase.exceptions;

/**
 * Dữ liệu đầu vào sai. Đây là checked exception: phương thức ném nó phải khai báo {@code throws}.
 * Lớp này cho sẵn. Bài tập là viết {@link DocTuoi}.
 */
public class DuLieuKhongHopLeException extends Exception {

    public DuLieuKhongHopLeException(String message) {
        super(message);
    }
}
