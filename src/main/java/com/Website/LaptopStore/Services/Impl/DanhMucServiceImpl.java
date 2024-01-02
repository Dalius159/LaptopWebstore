package com.Website.LaptopStore.Services.Impl;

import com.Website.LaptopStore.Entities.DanhMuc;
import com.Website.LaptopStore.Services.DanhMucService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DanhMucServiceImpl implements DanhMucService {
    @Override
    public Page<DanhMuc> getAllDanhMucForPageable(int page, int size) {
        return null;
    }

    @Override
    public List<DanhMuc> getAllDanhMuc() {
        return null;
    }

    @Override
    public DanhMuc getDanhMucById(long id) {
        return null;
    }

    @Override
    public DanhMuc save(DanhMuc d) {
        return null;
    }

    @Override
    public DanhMuc update(DanhMuc d) {
        return null;
    }

    @Override
    public void deleteById(long id) {

    }
}
