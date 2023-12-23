package com.Website.LaptopStore.Services;

import com.Website.LaptopStore.Entities.NguoiDung;
import com.Website.LaptopStore.Entities.VaiTro;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Set;

public interface NguoiDungService {

    NguoiDung findByEmail(String email);

    NguoiDung findByConfirmationToken(String confirmationToken);

    NguoiDung saveUserForMember(NguoiDung nd);

    NguoiDung findById(long id);

    NguoiDung updateUser(NguoiDung nd);

    void changePass(NguoiDung nd, String newPass);

    Page<NguoiDung> getNguoiDungByVaiTro(Set<VaiTro> vaiTro, int page);

    List<NguoiDung> getNguoiDungByVaiTro(Set<VaiTro> vaiTro);

    void deleteById(long id);

}
