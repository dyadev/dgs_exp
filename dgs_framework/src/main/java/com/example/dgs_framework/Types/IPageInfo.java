package com.example.dgs_framework.Types;

import java.lang.String;

public interface IPageInfo {
  boolean getHasPreviousPage();

  boolean getHasNextPage();

  String getStartCursor();

  String getEndCursor();
}
