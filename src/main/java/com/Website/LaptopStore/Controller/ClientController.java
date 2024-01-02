package com.Website.LaptopStore.Controller;

import com.Website.LaptopStore.Entities.DanhMuc;
import com.Website.LaptopStore.Services.DanhMucService;
import com.Website.LaptopStore.Services.LienHeService;
import com.Website.LaptopStore.Services.NguoiDungService;
import com.Website.LaptopStore.Services.Impl.NguoiDungServiceImpl;
import com.Website.LaptopStore.Entities.NguoiDung;
import com.Website.LaptopStore.Services.SanPhamService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@SessionAttributes("loggedInUser")
@RequestMapping
public class ClientController {

    @Autowired
    private SanPhamService sanPhamService;

    @Autowired
    private NguoiDungService nguoiDungService;

    @Autowired
    private DanhMucService danhMucService;

    @Autowired
    private LienHeService lienHeService;

    @ModelAttribute("loggedInUser")
    public NguoiDung loggedInUser() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        return nguoiDungService.findByEmail(auth.getName());
    }

    @ModelAttribute("listDanhMuc")
    public List<DanhMuc> listDanhMuc(){
        return danhMucService.getAllDanhMuc();
    }

    public NguoiDung getSessionUser(HttpServletRequest request) {
        return (NguoiDung) request.getSession().getAttribute("loggedInUser");
    }


    @GetMapping
    public String clientPage() {
        return "client/home";
    }
}
