package com.tintachina.chapter_04;

import java.util.HashMap;
import java.util.Map;

public class Facts {

  private final Map<String, String> facts = new HashMap<>();

  public String getFact(String name) {
    return this.facts.get(name);
  }

  public void setFact(String name, String value) {
    this.facts.put(name, value);
  }
}
