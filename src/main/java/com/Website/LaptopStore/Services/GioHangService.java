package com.Website.LaptopStore.Services;

import com.Website.LaptopStore.Entities.GioHang;
import com.Website.LaptopStore.Entities.NguoiDung;

public interface GioHangService {

    GioHang getGioHangByNguoiDung(NguoiDung n);

    GioHang save(GioHang g);
}
