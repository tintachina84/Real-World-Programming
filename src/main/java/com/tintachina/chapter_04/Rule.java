package com.tintachina.chapter_04;

public class Rule {

  private final Condition condition;
  private final Action action;

  public Rule(Condition condition, Action action) {
    this.condition = condition;
    this.action = action;
  }

  public void perform(Facts facts) {
    if (condition.evaluate(facts)) {
      action.execute(facts);
    }
  }
}
