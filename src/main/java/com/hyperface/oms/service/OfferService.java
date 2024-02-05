package com.hyperface.oms.service;

import com.hyperface.oms.dto.Offer;
import java.util.Collection;

public interface OfferService {

  void createOffer(Offer offer);

  Collection<Offer> getOffers();
}
