package com.Website.LaptopStore.Services;

import com.Website.LaptopStore.Entities.VaiTro;

import java.util.List;

public interface VaiTroService {

    VaiTro findByTenVaiTro(String tenVaiTro);
    List<VaiTro> findAllVaiTro();
}
