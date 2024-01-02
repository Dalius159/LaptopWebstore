package com.Website.LaptopStore.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ChiTietDonHang {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne
    @JoinColumn(name="ma_san_pham")
    private SanPham sanPham;
    private long donGia;
    private int soLuongDat;

    private int soLuongNhanHang;

    @ManyToOne
    @JoinColumn(name = "ma_don_hang")
    @JsonIgnore
    private DonHang donHang;
}
