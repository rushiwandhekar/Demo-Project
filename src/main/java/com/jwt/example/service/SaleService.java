package com.jwt.example.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.jwt.example.dao.SaleRepository;
import com.jwt.example.exception.MinorShoppingLimitException;
import com.jwt.example.model.Sale;


@Service
public class SaleService {
    @Autowired
    private SaleRepository saleRepository;

    public Sale saveSale(Sale sale) {
       
    	System.out.println("sale is "+sale);
        if (sale.isMinor() && sale.getPayAmount() > 1000) {
        	
            throw new MinorShoppingLimitException("Minors can only shop for up to Rs. 1000.");
        }
        if (sale.getState().equals("Maharashtra")) {
            sale.setPayAmount(sale.getPayAmount() * 0.8); 
        }
        return saleRepository.save(sale);
    }

    public Page<Sale> getSales(int page, int size,String seachKey) {
        return saleRepository.findAll(PageRequest.of(page, size));
    }

    public void deleteSale(Long id) {
        saleRepository.deleteById(id);
    }

    public Sale updateSale(Long id, Sale saleDetails) {
        Sale sale = saleRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Sale not found"));
        sale.setCustomerName(saleDetails.getCustomerName());
        sale.setMobileNo(saleDetails.getMobileNo());
        sale.setAddress(saleDetails.getAddress());
        sale.setState(saleDetails.getState());
        sale.setDateOfBirth(saleDetails.getDateOfBirth());
        sale.setMinor(saleDetails.isMinor());
        sale.setQuantity(saleDetails.getQuantity());
        sale.setPrice(saleDetails.getPrice());
        sale.setPayAmount(saleDetails.getPayAmount());
        sale.setEmailId(saleDetails.getEmailId());
        return saleRepository.save(sale);
    }
}