package com.greenfox.weirdname.depend.service;

import java.util.List;

public interface StudentServiceInt {
  List<String> findAll();

  void save(String student);

  int count();

  boolean check(String name);
}
