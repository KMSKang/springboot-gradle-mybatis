package com.kms.www.service;

import com.kms.www.mapper.KmsMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class KmsServiceImpl implements KmsService {

  private final KmsMapper repository;

  @Override
  public List<Map<String, Object>> getList() {
    return repository.getList();
  }

}
