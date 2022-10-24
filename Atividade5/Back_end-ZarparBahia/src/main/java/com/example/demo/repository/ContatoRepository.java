package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modelo.Contato;

public interface ContatoRepository extends JpaRepository <Contato, Long> {

}
