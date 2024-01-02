package com.Website.LaptopStore.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;
import java.util.Set;

@Entity
@Data
public class NguoiDung {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String email;

    @JsonIgnore
    private String password;

    @Transient
    @JsonIgnore
    private String confirmPassword;
    private String hoTen;
    private String soDienThoai;
    private String diaChi;

    @ManyToMany
    @JoinTable(name="nguoidung_vaitro",
            joinColumns=@JoinColumn(name="ma_nguoi_dung"),
            inverseJoinColumns=@JoinColumn(name="ma_vai_tro"))
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Set<VaiTro> vaiTro;

    @Transient
    @JsonIgnore
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<DonHang> listDonHang;

    public NguoiDung() {
        // TODO Auto-generated constructor stub
    }
}
