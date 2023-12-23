package com.Website.LaptopStore.Services.Impl;

import com.Website.LaptopStore.Entities.ChiMucGioHang;
import com.Website.LaptopStore.Entities.GioHang;
import com.Website.LaptopStore.Entities.SanPham;
import com.Website.LaptopStore.Repository.ChiMucGioHangRepository;
import com.Website.LaptopStore.Services.ChiMucGioHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChiMucGioHangServiceImpl implements ChiMucGioHangService {

    @Autowired
    private ChiMucGioHangRepository repo;

    @Override
    public ChiMucGioHang getChiMucGioHangBySanPhamAndGioHang(SanPham sp, GioHang g)
    {
        return repo.findBySanPhamAndGioHang(sp,g);
    }

    @Override
    public ChiMucGioHang saveChiMucGiohang(ChiMucGioHang c)
    {
        return repo.save(c);
    }

    @Override
    public void deleteChiMucGiohang(ChiMucGioHang c)
    {
        repo.delete(c);
    }

    @Override
    public List<ChiMucGioHang> getChiMucGioHangByGioHang(GioHang g)
    {
        return repo.findByGioHang(g);
    }

    @Override
    public void deleteAllChiMucGiohang(List<ChiMucGioHang> c)
    {
        repo.deleteAll(c);
    }

}
