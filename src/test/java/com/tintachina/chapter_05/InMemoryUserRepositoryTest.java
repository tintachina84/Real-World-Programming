package com.tintachina.chapter_05;

import com.tintachina.chapter_05.in_memory.InMemoryUserRepository;

public class InMemoryUserRepositoryTest extends AbstractUserRepositoryTest {

  private final InMemoryUserRepository inMemoryUserRepository = new InMemoryUserRepository();

  @Override
  protected UserRepository newRepository() {
    return inMemoryUserRepository;
  }
}
