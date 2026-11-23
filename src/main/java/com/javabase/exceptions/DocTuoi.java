package com.javabase.exceptions;

/**
 * Đọc tuổi từ chuỗi.
 *
 * <p>Sửa lớp này. Giữ nguyên chữ ký, kể cả {@code throws}. Đừng sửa test.
 */
public final class DocTuoi {

    private DocTuoi() {
    }

    /**
     * Đọc tuổi sau khi cắt khoảng trắng hai đầu.
     * Hợp lệ khi là số nguyên từ 0 đến 150, tính cả hai đầu.
     *
     * @throws DuLieuKhongHopLeException khi {@code raw} là {@code null}, blank,
     *                                   không phải số nguyên, hoặc ngoài 0..150.
     *                                   Message không được trống; nội dung tự chọn.
     */
    public static int docTuoi(String raw) throws DuLieuKhongHopLeException {
        throw new UnsupportedOperationException("TODO: đọc tuổi 0..150, sai thì ném DuLieuKhongHopLeException");
    }
}
