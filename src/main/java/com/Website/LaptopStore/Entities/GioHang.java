package com.Website.LaptopStore.Entities;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
public class GioHang {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String tong_tien;

    @OneToOne
    @JoinColumn(name = "ma_nguoi_dung")
    private NguoiDung nguoiDung;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTong_tien() {
        return tong_tien;
    }

    public void setTong_tien(String tong_tien) {
        this.tong_tien = tong_tien;
    }

    public NguoiDung getNguoiDung() {
        return nguoiDung;
    }

    public void setNguoiDung(NguoiDung nguoiDung) {
        this.nguoiDung = nguoiDung;
    }

}
