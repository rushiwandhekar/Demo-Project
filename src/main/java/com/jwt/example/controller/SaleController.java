package com.jwt.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.example.model.Sale;
import com.jwt.example.service.SaleService;

@RestController
public class SaleController {
    @Autowired
    private SaleService saleService;

    @PostMapping("/createSale")
    public Sale createSale(@RequestBody Sale sale) {
        return saleService.saveSale(sale);
        
    }

    @GetMapping("/getSales")
    public Page<Sale> getSales(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "20") int size,@RequestParam(defaultValue = "") String searchKey) {
        return saleService.getSales(page, size ,searchKey);
    }

    @DeleteMapping("/deleteSale/{id}")
    public void deleteSale(@PathVariable Long id) {
        saleService.deleteSale(id);
    }

    @PutMapping("/updateSale/{id}")
    public Sale updateSale(@PathVariable Long id, @RequestBody Sale saleDetails) {
        return saleService.updateSale(id, saleDetails);
    }
}