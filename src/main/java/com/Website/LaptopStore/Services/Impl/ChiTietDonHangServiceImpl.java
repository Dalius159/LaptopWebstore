package com.Website.LaptopStore.Services.Impl;

import com.Website.LaptopStore.Entities.ChiTietDonHang;
import com.Website.LaptopStore.Repository.ChiTietDonHangRepository;
import com.Website.LaptopStore.Services.ChiTietDonHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChiTietDonHangServiceImpl implements ChiTietDonHangService {

    @Autowired
    private ChiTietDonHangRepository repo;

    @Override
    public List<ChiTietDonHang> save(List<ChiTietDonHang> list)
    {
        return repo.saveAll(list);
    }
}
