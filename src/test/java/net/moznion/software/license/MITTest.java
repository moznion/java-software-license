package net.moznion.software.license;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.junit.Assert.assertThat;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.OptionalDouble;

public class MITTest {
  public static MIT mit;

  @BeforeClass
  public static void beforeClass() {
    mit = new MIT("moznion");
  }

  @Test
  public void shouldGetName() {
    assertThat(mit.getName(), is("The MIT (X11) License"));
  }

  @Test
  public void shouldGetURL() {
    assertThat(mit.getURL(), is("http://www.opensource.org/licenses/mit-license.php"));
  }

  @Test
  public void shouldGetEmptyVersion() {
    assertThat(mit.getVersion(), is(OptionalDouble.empty()));
  }
  
  @Test
  public void shouldGetLicenseText() {
    String licenseText = mit.getText();
    assertThat(licenseText, startsWith("The MIT License\n"));
    assertThat(licenseText, endsWith("OTHER DEALINGS IN THE SOFTWARE.\n"));
  }
}
