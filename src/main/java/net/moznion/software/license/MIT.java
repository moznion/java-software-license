package net.moznion.software.license;

import java.util.OptionalDouble;

public class MIT extends AbstractLicense {
  public MIT(String holder) {
    this(holder, DateUtil.getCurrentYear());
  }

  public MIT(String holder, int year) {
    this.holder = holder;
    this.year = year;
  }

  @Override
  public String getName() {
    return "The MIT (X11) License";
  }

  @Override
  public String getURL() {
    return "http://www.opensource.org/licenses/mit-license.php";
  }

  @Override
  public OptionalDouble getVersion() {
    return OptionalDouble.empty();
  }

  @Override
  public String getText() {
    return "The MIT License\n" +
        "\n" +
        "Permission is hereby granted, free of charge, to any person\n" +
        "obtaining a copy of this software and associated\n" +
        "documentation files (the \"Software\"), to deal in the Software\n" +
        "without restriction, including without limitation the rights to\n" +
        "use, copy, modify, merge, publish, distribute, sublicense,\n" +
        "and/or sell copies of the Software, and to permit persons to\n" +
        "whom the Software is furnished to do so, subject to the\n" +
        "following conditions:\n" +
        "\n" +
        "The above copyright notice and this permission notice shall\n" +
        "be included in all copies or substantial portions of the\n" +
        "Software.\n" +
        "\n" +
        "THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT\n" +
        "WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,\n" +
        "INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF\n" +
        "MERCHANTABILITY, FITNESS FOR A PARTICULAR\n" +
        "PURPOSE AND NONINFRINGEMENT. IN NO EVENT\n" +
        "SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE\n" +
        "LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n" +
        "LIABILITY, WHETHER IN AN ACTION OF CONTRACT,\n" +
        "TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN\n" +
        "CONNECTION WITH THE SOFTWARE OR THE USE OR\n" +
        "OTHER DEALINGS IN THE SOFTWARE.\n";
  }
}
