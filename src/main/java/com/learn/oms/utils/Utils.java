package com.learn.oms.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.learn.oms.dto.Offer;
import com.learn.oms.dto.Transaction;

public class Utils {

  public static final ObjectMapper mapper = new ObjectMapper();

  public static final ObjectWriter offerWriter = mapper.writerFor(Offer.class);
  public static final ObjectReader offerReader = mapper.readerFor(Offer.class);

  public static final ObjectWriter transactionWriter = mapper.writerFor(Transaction.class);
  public static final ObjectReader transactionReader = mapper.readerFor(Transaction.class);
}
