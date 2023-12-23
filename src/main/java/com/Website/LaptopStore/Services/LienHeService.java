package com.Website.LaptopStore.Services;

import com.Website.LaptopStore.Entities.LienHe;
import org.springframework.data.domain.Page;

import java.text.ParseException;

public interface LienHeService {


    LienHe findById(long id);

    LienHe save(LienHe lh);

    int countByTrangThai(String trangThai);

}
