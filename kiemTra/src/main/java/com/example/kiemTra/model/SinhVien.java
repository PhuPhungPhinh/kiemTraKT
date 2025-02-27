package com.example.kiemTra.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "SinhVien")
public class SinhVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotBlank(message = "Ten khong duoc de trong!")
    @Size(max = 255)
    @Column(name = "ten")
    private String ten;

    @NotNull(message = "Tuoi khong duoc de trong!")
    @Column(name = "tuoi")
    private Integer tuoi;

    @NotNull(message = "Gioi tinh khong duoc de trong!")
    @Column(name = "gioiTinh")
    private Boolean gioiTinh;

}