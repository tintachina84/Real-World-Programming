package com.tintachina.chapter_05;

import com.tintachina.chapter_05.database.DatabaseTwootRepository;
import java.io.IOException;
import org.junit.Before;

public class DatabaseTwootRepositoryTest extends AbstractTwootRepositoryTest {

  @Before
  public void setUp() throws IOException {
    repository = new DatabaseTwootRepository();

  }
}
