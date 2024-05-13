package com.tintachina.chapter_05.database;

import java.sql.SQLException;

interface With<P> {

  void run(P stmt) throws SQLException;
}
