package com.kms.www.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface KmsMapper {
  List<Map<String, Object>> getList();
}
