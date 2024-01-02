package com.Website.LaptopStore.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotEmpty;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Data
public class DanhMuc {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotEmpty(message="Tên danh mục không được trống")
    private String tenDanhMuc;

    @JsonIgnore
    @OneToMany(mappedBy = "danhMuc")
    private List<SanPham> listSanPham;
}
