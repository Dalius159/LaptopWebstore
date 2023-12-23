package com.Website.LaptopStore.Repository;

import com.Website.LaptopStore.Entities.GioHang;
import com.Website.LaptopStore.Entities.NguoiDung;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GioHangRepository extends JpaRepository<GioHang, Long> {

    GioHang findByNguoiDung(NguoiDung n);

}
