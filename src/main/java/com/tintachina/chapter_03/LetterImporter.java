package com.tintachina.chapter_03;

import static com.tintachina.chapter_03.Attributes.ADDRESS;
import static com.tintachina.chapter_03.Attributes.BODY;
import static com.tintachina.chapter_03.Attributes.PATIENT;
import static com.tintachina.chapter_03.Attributes.TYPE;

import java.io.File;
import java.io.IOException;
import java.util.Map;

class LetterImporter implements Importer {

  private static final String NAME_PREFIX = "Dear ";

  // tag::importFile[]
  @Override
  public Document importFile(final File file) throws IOException {
    final TextFile textFile = new TextFile(file);

    textFile.addLineSuffix(NAME_PREFIX, PATIENT);

    final int lineNumber = textFile.addLines(2, String::isEmpty, ADDRESS);
    textFile.addLines(lineNumber + 1, (line) -> line.startsWith("regards,"), BODY);

    final Map<String, String> attributes = textFile.getAttributes();
    attributes.put(TYPE, "LETTER");
    return new Document(attributes);
  }
  // end::importFile[]
}
