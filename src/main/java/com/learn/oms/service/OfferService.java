package com.learn.oms.service;

import com.learn.oms.dto.Offer;
import java.util.Collection;

public interface OfferService {

  void createOffer(Offer offer);

  Collection<Offer> getOffers();
}
