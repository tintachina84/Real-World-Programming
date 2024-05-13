package com.tintachina.chapter_05;

import com.tintachina.chapter_05.database.DatabaseUserRepository;

public class DatabaseUserRepositoryTest extends AbstractUserRepositoryTest {

  @Override
  protected UserRepository newRepository() {
    return new DatabaseUserRepository();
  }
}
