package com.Website.LaptopStore.Repository;

import com.Website.LaptopStore.Entities.VaiTro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VaiTroRepository extends JpaRepository<VaiTro, Long> {

    VaiTro findByTenVaiTro(String tenVaiTro);
}
