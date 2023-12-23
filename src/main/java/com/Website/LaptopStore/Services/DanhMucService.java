package com.Website.LaptopStore.Services;

import com.Website.LaptopStore.Entities.DanhMuc;
import org.springframework.data.domain.Page;

import java.util.List;

public interface DanhMucService {

    Page<DanhMuc> getAllDanhMucForPageable(int page, int size);

    List<DanhMuc> getAllDanhMuc();

    DanhMuc getDanhMucById(long id);

    DanhMuc save(DanhMuc d);

    DanhMuc update(DanhMuc d);

    void deleteById(long id);
}
