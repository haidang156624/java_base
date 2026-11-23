package com.javabase.collections;

/**
 * Nhóm học viên, không có hai người cùng mã.
 *
 * <p>Sửa lớp này. Dùng {@link java.util.HashSet}. {@link HocVien} phải có
 * {@code equals}/{@code hashCode} đúng thì tập mới loại được mã trùng.
 */
public final class NhomHocVien {

    /**
     * Thêm học viên.
     *
     * @return {@code true} nếu mã chưa có, {@code false} nếu mã đã có
     * @throws NullPointerException khi {@code hocVien} là {@code null}
     */
    public boolean them(HocVien hocVien) {
        throw new UnsupportedOperationException("TODO: từ chối null, thêm vào HashSet, cùng mã thì không thêm lần hai");
    }

    public int soLuong() {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * {@code true} khi có học viên mang đúng mã.
     * {@code ma} là {@code null} thì trả {@code false}, không ném.
     */
    public boolean coMa(String ma) {
        throw new UnsupportedOperationException("TODO: null thì false, ngược lại tìm theo mã");
    }
}
