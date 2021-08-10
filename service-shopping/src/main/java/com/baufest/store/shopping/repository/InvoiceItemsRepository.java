package com.baufest.store.shopping.repository;

import com.baufest.store.shopping.entity.InvoiceItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceItemsRepository extends JpaRepository<InvoiceItem, Long> {
}
