package com.example.kiemTra.controller;

import com.example.kiemTra.model.SinhVien;
import com.example.kiemTra.repository.SinhVienRepo;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class SinhVienController {
    @Autowired
    SinhVienRepo sinhVienRepo;

    @GetMapping("/sinh-vien/hien-thi")
    public String sinhVien(Model model, @ModelAttribute("sinhVien") SinhVien sinhVien) {
        List<SinhVien> list = sinhVienRepo.findAll();
        model.addAttribute("list", list);
        return "/view/hien-thi";
    }

    @GetMapping("/sinh-vien/delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        sinhVienRepo.deleteById(id);
        return "redirect:/sinh-vien/hien-thi";
    }
    @GetMapping("/sinh-vien/detail/{id}")
    public String detail(@PathVariable("id") Integer id, Model model) {
        SinhVien sinhVien = sinhVienRepo.findById(id).get();
        model.addAttribute("sinhVien", sinhVien);
        return "/view/detail";
    }


}
