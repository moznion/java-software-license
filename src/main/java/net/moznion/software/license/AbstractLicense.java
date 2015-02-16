package net.moznion.software.license;

import java.util.OptionalDouble;

public abstract class AbstractLicense implements License {
  public int year;
  public String holder;

  final public int getYear() {
    return year;
  };

  final public String getHolder() {
    return holder;
  };

  abstract public String getName();

  abstract public String getURL();

  abstract public OptionalDouble getVersion();

  abstract public String getText();

  public String getNotice() {
    return new StringBuilder("This software is Copyright (c) ")
        .append(year)
        .append(" by ")
        .append(holder)
        .append("\n")
        .toString();
  }

  final public String getFulltext() {
    return new StringBuilder(getNotice())
        .append("\n")
        .append(getText())
        .toString();
  }

  final public String getPomXML() {
    return new StringBuilder("<license>\n")
        .append("\t<name>")
        .append(getName())
        .append("</name>\n")
        .append("\t<url>")
        .append(getURL())
        .append("</url>\n")
        .append("\t<distribution>repo</distribution>\n")
        .append("</license>")
        .toString();
  }
}
