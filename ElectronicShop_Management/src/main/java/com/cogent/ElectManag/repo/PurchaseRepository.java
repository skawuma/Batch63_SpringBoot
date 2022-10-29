package com.cogent.ElectManag.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.ElectManag.entity.Purchase;

public interface PurchaseRepository  extends JpaRepository<Purchase,Long>{

}

