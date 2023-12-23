package com.Website.LaptopStore.Services;

import com.Website.LaptopStore.Entities.SanPham;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Set;

public interface SanPhamService {


    void deleteById(long id);

    SanPham getSanPhamById(long id);

    List<SanPham> getLatestSanPham();

    List<SanPham> getAllSanPhamByList(Set<Long> idList);

    Page<SanPham> getSanPhamByTenSanPhamForAdmin(String tenSanPham, int page, int size);

    Iterable<SanPham> getSanPhamByTenDanhMuc(String brand);

}
