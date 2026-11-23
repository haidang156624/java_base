package com.javabase.concurrency;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

/**
 * Đặc tả của bài. Đừng sửa file này để làm test xanh.
 * Test khóa kết quả. Việc dùng pool và shutdown là hợp đồng trong Javadoc của {@link TinhSongSong}.
 */
@DisplayName("Tổng song song")
class TinhSongSongTest {

    @Test
    @Timeout(5)
    @DisplayName("Tổng đúng cả khi vượt quá int")
    void tongVuotInt() {
        List<Integer> so = List.of(2_000_000_000, 2_000_000_000);
        assertEquals(4_000_000_000L, TinhSongSong.tong(so, 2));
    }

    @Test
    @Timeout(5)
    @DisplayName("Nhiều phần tử, nhiều luồng")
    void nhieuPhanTu() {
        List<Integer> so = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(55L, TinhSongSong.tong(so, 4));
    }

    @Test
    @Timeout(5)
    @DisplayName("Một luồng, số âm, và số luồng nhiều hơn số phần tử")
    void bien() {
        assertEquals(6L, TinhSongSong.tong(List.of(1, 2, 3), 1));
        assertEquals(-5L, TinhSongSong.tong(List.of(-2, -3), 2));
        assertEquals(3L, TinhSongSong.tong(List.of(1, 2), 8));
    }

    @Test
    @DisplayName("Danh sách rỗng")
    void rong() {
        assertEquals(0L, TinhSongSong.tong(List.of(), 3));
    }

    @Test
    @DisplayName("soLuong < 1, kể cả khi danh sách rỗng")
    void soLuongKhongHopLe() {
        assertThrows(IllegalArgumentException.class, () -> TinhSongSong.tong(List.of(1), 0));
        assertThrows(IllegalArgumentException.class, () -> TinhSongSong.tong(List.of(1), -1));
        assertThrows(IllegalArgumentException.class, () -> TinhSongSong.tong(List.of(), 0));
    }

    @Test
    @DisplayName("null")
    void nullKhongHopLe() {
        assertThrows(NullPointerException.class, () -> TinhSongSong.tong(null, 2));
        assertThrows(NullPointerException.class, () -> TinhSongSong.tong(null, 0));
        assertThrows(NullPointerException.class, () -> TinhSongSong.tong(Arrays.asList(1, null), 2));
    }
}
