package com.Website.LaptopStore.Repository;

import com.Website.LaptopStore.Entities.ChiMucGioHang;
import com.Website.LaptopStore.Entities.GioHang;
import com.Website.LaptopStore.Entities.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChiMucGioHangRepository extends JpaRepository<ChiMucGioHang, Long> {

    ChiMucGioHang findBySanPhamAndGioHang(SanPham sp, GioHang g);

    List<ChiMucGioHang> findByGioHang(GioHang g);
}
