package com.javabase.flow;

/**
 * Rẽ nhánh và vòng lặp.
 *
 * <p>Sửa lớp này. Giữ nguyên chữ ký phương thức. Đừng sửa test.
 */
public final class XepLoai {

    private XepLoai() {
    }

    /**
     * Xếp loại điểm trên thang 0 đến 10, tính cả hai đầu.
     *
     * <ul>
     *   <li>{@code >= 9}: {@code Giỏi}
     *   <li>{@code >= 7}: {@code Khá}
     *   <li>{@code >= 5}: {@code Trung bình}
     *   <li>còn lại trong thang: {@code Yếu}
     * </ul>
     *
     * <p>Ngoài thang, {@code NaN} hoặc vô cực thì ném {@link IllegalArgumentException}.
     */
    public static String theoDiem(double diem) {
        throw new UnsupportedOperationException("TODO: xếp loại điểm 0..10");
    }

    /**
     * Tên thứ trong tuần. {@code 1} là {@code Thứ Hai}, {@code 7} là {@code Chủ Nhật}.
     * Ngoài 1..7 thì ném {@link IllegalArgumentException}.
     * Hãy dùng {@code switch}.
     */
    public static String thuTrongTuan(int thu) {
        throw new UnsupportedOperationException("TODO: switch thứ 1..7");
    }

    /**
     * Tổng các số chẵn từ 1 đến {@code n}, kể cả {@code n} nếu {@code n} chẵn.
     * {@code n < 1} thì trả {@code 0}. Hãy viết vòng lặp.
     */
    public static int tongChanDen(int n) {
        throw new UnsupportedOperationException("TODO: tổng các số chẵn từ 1 đến n");
    }
}
