package com.Website.LaptopStore.Services.Impl;

import com.Website.LaptopStore.Entities.SanPham;
import com.Website.LaptopStore.Services.SanPhamService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class SanPhamServiceImpl implements SanPhamService {
    @Override
    public void deleteById(long id) {

    }

    @Override
    public SanPham getSanPhamById(long id) {
        return null;
    }

    @Override
    public List<SanPham> getLatestSanPham() {
        return null;
    }

    @Override
    public List<SanPham> getAllSanPhamByList(Set<Long> idList) {
        return null;
    }

    @Override
    public Page<SanPham> getSanPhamByTenSanPhamForAdmin(String tenSanPham, int page, int size) {
        return null;
    }

    @Override
    public Iterable<SanPham> getSanPhamByTenDanhMuc(String brand) {
        return null;
    }
}
