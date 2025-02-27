package com.example.kiemTra.repository;

import com.example.kiemTra.model.SinhVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SinhVienRepo extends JpaRepository<SinhVien, Integer> {
}
