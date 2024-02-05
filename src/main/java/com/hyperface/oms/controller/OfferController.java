package com.hyperface.oms.controller;

import com.hyperface.oms.dto.Offer;
import com.hyperface.oms.service.OfferService;
import java.util.Collection;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(path = "/v1.0/offer")
public class OfferController {

  @Autowired private OfferService offerService;

  @PostMapping
  public ResponseEntity<Boolean> createOffer(@RequestBody Offer offer) {
    offerService.createOffer(offer);
    return new ResponseEntity<>(true, HttpStatus.OK);
  }

  @GetMapping("/all")
  public ResponseEntity<Collection<Offer>> getOffers() {
    return new ResponseEntity<>(offerService.getOffers(), HttpStatus.OK);
  }
}
