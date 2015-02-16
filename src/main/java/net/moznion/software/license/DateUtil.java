package net.moznion.software.license;

import java.util.Calendar;

class DateUtil {
  static int getCurrentYear() {
    return Calendar.getInstance().get(Calendar.YEAR);
  }
}
