package com.tintachina.chapter_05;

import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

// tag::mockReceiverEndPoint[]
public class MockReceiverEndPoint implements ReceiverEndPoint {

  private final List<Twoot> receivedTwoots = new ArrayList<>();

  @Override
  public void onTwoot(final Twoot twoot) {
    receivedTwoots.add(twoot);
  }

  public void verifyOnTwoot(final Twoot twoot) {
    assertThat(
        receivedTwoots,
        contains(twoot));
  }
}
// end::mockReceiverEndPoint[]