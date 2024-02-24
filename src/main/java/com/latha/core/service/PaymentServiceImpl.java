package com.latha.core.service;

import com.com.latha.core.dao.PaymentDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PaymentServiceImpl implements PaymentService{
   @Autowired
   private PaymentDAO dao;
   public PaymentDAO getDao() {
      return dao;
   }
   public void setDao(PaymentDAO dao) {
      this.dao = this.dao;
   }


}
