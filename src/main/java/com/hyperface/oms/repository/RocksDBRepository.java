package com.hyperface.oms.repository;

import java.util.Map;

public interface RocksDBRepository<K, V> {

  /**
   * This method saves the passed object to respective rocksdb db. In case of any exception; this
   * will silently ignore and log the error.
   *
   * @param value - object to save in rocksdb
   */
  void save(V value);

  /**
   * This method returns all the active key, value pairs from respective rocksdb db. In case of any
   * exceptions - it will simply return empty map.
   *
   * @return - all the active key, values pairs
   */
  Map<K, V> findAll();
}
