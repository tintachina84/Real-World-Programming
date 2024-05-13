package com.tintachina.chapter_05;

import com.tintachina.chapter_05.in_memory.InMemoryTwootRepository;
import org.junit.Before;

public class InMemoryTwootRepositoryTest extends AbstractTwootRepositoryTest {

  @Before
  public void setUp() {
    repository = new InMemoryTwootRepository();
  }
}
