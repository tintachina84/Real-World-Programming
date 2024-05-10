package com.tintachina.chapter_04;

@FunctionalInterface
public interface Condition {

  boolean evaluate(Facts facts);
}
