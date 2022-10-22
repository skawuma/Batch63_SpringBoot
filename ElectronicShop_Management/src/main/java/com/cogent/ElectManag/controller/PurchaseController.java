package com.cogent.ElectManag.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.ElectManag.entity.Purchase;
import com.cogent.ElectManag.repo.PurchaseRepository;

@RestController
@RequestMapping("/api/purchase")
public class PurchaseController {
	@Autowired
	PurchaseRepository purchaseRepository;
	@PostMapping("/addpurchase")
	Purchase newPurchase(@RequestBody Purchase purchase) {		
		return purchaseRepository.save(purchase);
	}
	@GetMapping ("/getpurchase")
	List<Purchase>all(){
		return purchaseRepository.findAll();
	}
	@DeleteMapping("/deletepurchase/{id}")
	public String deletePurchase(@PathVariable("id") long id) {		
		try {
			purchaseRepository.deleteById(id);
			return "DELETE SUCCESSFUL!!!";
			
		}catch(Exception e) {
			e.printStackTrace();
			return "UNABLE TO DELETE";
		}
		
	}
	
	
}
