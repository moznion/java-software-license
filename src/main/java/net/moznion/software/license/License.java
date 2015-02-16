package net.moznion.software.license;

import java.util.Optional;
import java.util.OptionalDouble;

public interface License {
  public int getYear();

  public String getHolder();

  public String getName();

  public String getURL();

  public String getNotice();

  public String getText();

  public String getFulltext();

  public OptionalDouble getVersion();

  public String getPomXML();
}
