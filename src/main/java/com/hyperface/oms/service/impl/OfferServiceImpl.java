package com.hyperface.oms.service.impl;

import com.hyperface.oms.dto.Offer;
import com.hyperface.oms.repository.impl.RocksDBRepositoryImpl;
import com.hyperface.oms.service.OfferService;
import java.util.Collection;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OfferServiceImpl implements OfferService {

  @Autowired
  @Qualifier(value = "offersRocksDBRepository")
  private RocksDBRepositoryImpl<Offer> offersRocksDBRepository;

  @Override
  public void createOffer(Offer offer) {
    offersRocksDBRepository.save(offer);
  }

  @Override
  public Collection<Offer> getOffers() {
    return offersRocksDBRepository.findAll().values();
  }
}
