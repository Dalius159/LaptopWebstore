package com.Website.LaptopStore.Services.Impl;

import com.Website.LaptopStore.Entities.NguoiDung;
import com.Website.LaptopStore.Entities.VaiTro;
import com.Website.LaptopStore.Services.NguoiDungService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service()
public class NguoiDungServiceImpl implements NguoiDungService {
    @Override
    public NguoiDung findByEmail(String email) {
        return null;
    }

    @Override
    public NguoiDung findByConfirmationToken(String confirmationToken) {
        return null;
    }

    @Override
    public NguoiDung saveUserForMember(NguoiDung nd) {
        return null;
    }

    @Override
    public NguoiDung findById(long id) {
        return null;
    }

    @Override
    public NguoiDung updateUser(NguoiDung nd) {
        return null;
    }

    @Override
    public void changePass(NguoiDung nd, String newPass) {

    }

    @Override
    public Page<NguoiDung> getNguoiDungByVaiTro(Set<VaiTro> vaiTro, int page) {
        return null;
    }

    @Override
    public List<NguoiDung> getNguoiDungByVaiTro(Set<VaiTro> vaiTro) {
        return null;
    }

    @Override
    public void deleteById(long id) {

    }
}
