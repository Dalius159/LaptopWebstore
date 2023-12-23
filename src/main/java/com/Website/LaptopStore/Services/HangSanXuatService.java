package com.Website.LaptopStore.Services;

import com.Website.LaptopStore.Entities.HangSanXuat;
import org.springframework.data.domain.Page;

import java.util.List;

public interface HangSanXuatService {

    List<HangSanXuat> getALlHangSX();

    Page<HangSanXuat> getALlHangSX(int page, int size);

    HangSanXuat getHSXById(long id);

    HangSanXuat save(HangSanXuat h);

    HangSanXuat update(HangSanXuat h);

    void deleteById(long id);
}
