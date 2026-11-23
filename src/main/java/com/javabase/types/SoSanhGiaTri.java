package com.javabase.types;

/**
 * So sánh giá trị và ghép chuỗi.
 *
 * <p>Sửa lớp này. Giữ nguyên chữ ký phương thức. Đừng sửa test.
 */
public final class SoSanhGiaTri {

    private SoSanhGiaTri() {
    }

    /**
     * {@code true} khi hai {@code int} cùng giá trị.
     */
    public static boolean cungGiaTriNguyen(int a, int b) {
        throw new UnsupportedOperationException("TODO: so sánh hai int theo giá trị");
    }

    /**
     * {@code true} khi hai {@code Integer} cùng giá trị.
     * Cả hai {@code null} thì {@code true}. Chỉ một bên {@code null} thì {@code false}.
     * Không dùng {@code ==}.
     */
    public static boolean cungGiaTriHop(Integer a, Integer b) {
        throw new UnsupportedOperationException("TODO: so sánh Integer theo giá trị, chịu được null");
    }

    /**
     * {@code true} khi hai chuỗi cùng nội dung.
     * Cả hai {@code null} thì {@code true}. Chỉ một bên {@code null} thì {@code false}.
     */
    public static boolean cungNoiDung(String a, String b) {
        throw new UnsupportedOperationException("TODO: so sánh nội dung chuỗi, chịu được null");
    }

    /**
     * Ghép họ và tên bằng đúng một dấu cách. Không đổi hai chuỗi truyền vào.
     *
     * @param ho  khác {@code null}
     * @param ten khác {@code null}
     */
    public static String ghepHoTen(String ho, String ten) {
        throw new UnsupportedOperationException("TODO: ghép họ và tên bằng một dấu cách");
    }
}
