package com.Website.LaptopStore.Services;

import com.Website.LaptopStore.Entities.ChiMucGioHang;
import com.Website.LaptopStore.Entities.GioHang;
import com.Website.LaptopStore.Entities.SanPham;

import java.util.List;

public interface ChiMucGioHangService{

    List<ChiMucGioHang> getChiMucGioHangByGioHang(GioHang g);

    ChiMucGioHang getChiMucGioHangBySanPhamAndGioHang(SanPham sp, GioHang g);

    ChiMucGioHang saveChiMucGiohang(ChiMucGioHang c);

    void deleteChiMucGiohang(ChiMucGioHang c);

    void deleteAllChiMucGiohang(List<ChiMucGioHang> c);

}
