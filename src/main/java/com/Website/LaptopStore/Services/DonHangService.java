package com.Website.LaptopStore.Services;

import com.Website.LaptopStore.Entities.DonHang;
import com.Website.LaptopStore.Entities.NguoiDung;
import org.springframework.data.domain.Page;

import java.text.ParseException;
import java.util.List;

public interface DonHangService {

    DonHang update(DonHang dh);

    DonHang findById(long id);

    DonHang save(DonHang dh);

    List<Object> layDonHangTheoThangVaNam();

    List<DonHang> findByTrangThaiDonHangAndShipper(String string, NguoiDung shipper);

    List<DonHang> getDonHangByNguoiDung(NguoiDung currentUser);

    int countByTrangThaiDonHang(String trangThaiDonHang);
}
