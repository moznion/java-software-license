package net.moznion.software.license;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import java.util.Calendar;

public class CommonTest {
  @Test
  public void shouldGetYearAndHolder() {
    MIT mit = new MIT("moznion", 2015);
    assertThat(mit.getYear(), is(2015));
    assertThat(mit.getHolder(), is("moznion"));
  }

  @Test
  public void shouldGetYearByDefault() {
    MIT mit = new MIT("moznion");
    assertThat(mit.getYear(), is(Calendar.getInstance().get(Calendar.YEAR)));
  }

  @Test
  public void shouldGetDefaultNotice() {
    MIT mit = new MIT("moznion", 2015);
    assertThat(mit.getNotice(), is("This software is Copyright (c) 2015 by moznion\n"));
  }

  @Test
  public void shouldGetFulltext() {
    MIT mit = new MIT("moznion", 2015);
    String licenseText = mit.getFulltext();
    assertThat(licenseText, startsWith("This software is Copyright (c) 2015 by moznion\n"));
    assertThat(licenseText, endsWith("OTHER DEALINGS IN THE SOFTWARE.\n"));
  }

  @Test
  public void shouldGetPomXML() {
    MIT mit = new MIT("moznion");
    assertThat(mit.getPomXML(), is(
        "<license>\n" +
            "\t<name>The MIT (X11) License</name>\n" +
            "\t<url>http://www.opensource.org/licenses/mit-license.php</url>\n" +
            "\t<distribution>repo</distribution>\n" +
            "</license>"
        ));
  }
}
