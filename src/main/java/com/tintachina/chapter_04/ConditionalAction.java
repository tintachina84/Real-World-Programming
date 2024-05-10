package com.tintachina.chapter_04;

public interface ConditionalAction {

  void perform(Facts facts);

  boolean evaluate(Facts facts);
}
