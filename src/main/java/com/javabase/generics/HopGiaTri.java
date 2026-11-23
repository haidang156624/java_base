package com.javabase.generics;

import java.util.List;

/**
 * Hộp một giá trị, cộng một hàm generic và một hàm wildcard.
 *
 * <p>Sửa lớp này. Giữ nguyên chữ ký. {@code List<Integer>} phải truyền được vào {@code tongSo}
 * — đừng khai báo {@code List<Number>}.
 */
public final class HopGiaTri<T> {

    /**
     * Hộp mới thì rỗng.
     */
    public HopGiaTri() {
    }

    /**
     * Cất giá trị. {@code null} thì ném {@link NullPointerException} và giữ nguyên giá trị cũ.
     */
    public void dat(T giaTri) {
        throw new UnsupportedOperationException("TODO: cất giá trị, từ chối null, không xóa giá trị cũ khi từ chối");
    }

    /**
     * @return giá trị đã cất, kể cả lần cất gần nhất
     * @throws java.util.NoSuchElementException khi hộp đang rỗng
     */
    public T lay() {
        throw new UnsupportedOperationException("TODO: lấy giá trị, hộp rỗng thì ném NoSuchElementException");
    }

    /**
     * {@code true} khi chưa cất được giá trị nào.
     */
    public boolean trong() {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Phần tử khác {@code null} đầu tiên.
     *
     * @throws NullPointerException            khi {@code ds} là {@code null}
     * @throws java.util.NoSuchElementException khi danh sách rỗng hoặc toàn {@code null}
     */
    public static <T> T dauTienKhacNull(List<T> ds) {
        throw new UnsupportedOperationException("TODO: phần tử khác null đầu tiên");
    }

    /**
     * Tổng các số. Danh sách rỗng thì {@code 0}.
     * Phần tử {@code null} thì ném {@link NullPointerException}.
     * {@code ds} là {@code null} thì ném {@link NullPointerException}.
     */
    public static double tongSo(List<? extends Number> ds) {
        throw new UnsupportedOperationException("TODO: tổng List<? extends Number>, đừng đổi thành List<Number>");
    }
}
