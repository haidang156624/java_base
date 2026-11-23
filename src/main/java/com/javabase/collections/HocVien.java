package com.javabase.collections;

/**
 * Học viên trong một {@link java.util.HashSet}.
 *
 * <p>Hai học viên cùng mã là cùng một người, kể cả khi khác tên.
 * TODO: viết {@code equals} và {@code hashCode} chỉ dựa trên mã.
 * Chỉ viết {@code equals} mà quên {@code hashCode} thì {@code HashSet} vẫn nhận trùng.
 */
public final class HocVien {

    private final String ma;
    private final String ten;

    public HocVien(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public String layMa() {
        return ma;
    }

    public String layTen() {
        return ten;
    }
}
