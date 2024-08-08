package com.my.spring.project.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.my.spring.project.study.entity.UsuarioEntity;
//Interface para trabalhar as infos do usuario
public interface UsuarioRepository extends JpaRepository<UsuarioEntity,Long>{
	
}
