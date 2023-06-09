package com.fourtk.Adopet.entities;


import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_tutor")
public class Tutor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    private String cpf;
    private String address;
    private String city;
    private String uf;
    private String phone;
    private String image;

    public Tutor() {
    }

    public Tutor(Long id, String name, String email, String password, String cpf, String address, String city, String uf, String phone, String image) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.cpf = cpf;
        this.address = address;
        this.city = city;
        this.uf = uf;
        this.phone = phone;
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getCpf() {
        return cpf;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getUf() {
        return uf;
    }

    public String getPhone() {
        return phone;
    }

    public String getImage() {
        return image;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tutor tutor = (Tutor) o;
        return Objects.equals(id, tutor.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
