package com.demo.LoanApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.demo.LoanApp.Model.edtest;


@Repository
public interface edrepo extends JpaRepository<edtest, Long> {

}
