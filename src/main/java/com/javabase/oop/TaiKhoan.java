package com.javabase.oop;

/**
 * Tài khoản với số dư không âm.
 *
 * <p>Sửa lớp này. Giữ nguyên chữ ký. Field phải private — đừng để bên ngoài gán số dư.
 * Lớp {@code final} vì bài này luyện đóng gói, chưa cần kế thừa.
 */
public final class TaiKhoan {

    /**
     * @param chuSoHuu   không {@code null}, không blank
     * @param soDuBanDau {@code >= 0}
     * @throws IllegalArgumentException khi chủ sở hữu hoặc số dư không hợp lệ
     */
    public TaiKhoan(String chuSoHuu, long soDuBanDau) {
        throw new UnsupportedOperationException("TODO: kiểm tra rồi lưu chủ sở hữu và số dư vào field private");
    }

    public String layChuSoHuu() {
        throw new UnsupportedOperationException("TODO");
    }

    public long laySoDu() {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Cộng tiền vào số dư.
     *
     * @param soTien {@code > 0}
     * @throws IllegalArgumentException khi {@code soTien <= 0}; số dư giữ nguyên
     */
    public void gui(long soTien) {
        throw new UnsupportedOperationException("TODO: gửi tiền, từ chối số tiền không dương");
    }

    /**
     * Trừ tiền khỏi số dư.
     *
     * @param soTien {@code > 0} và {@code <=} số dư
     * @throws IllegalArgumentException khi không rút được; số dư giữ nguyên
     */
    public void rut(long soTien) {
        throw new UnsupportedOperationException("TODO: rút tiền, từ chối số tiền không hợp lệ");
    }
}
