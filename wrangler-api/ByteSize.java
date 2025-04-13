public class ByteSize extends Token {
  private final long bytes;

  public ByteSize(String value) {
    super(value);
    this.bytes = parseBytes(value);
  }

  private long parseBytes(String value) {
    String v = value.toLowerCase();
    if (v.endsWith("kb")) return (long) (Double.parseDouble(v.replace("kb", "")) * 1024);
    if (v.endsWith("mb")) return (long) (Double.parseDouble(v.replace("mb", "")) * 1024 * 1024);
    if (v.endsWith("gb")) return (long) (Double.parseDouble(v.replace("gb", "")) * 1024 * 1024 * 1024);
    return 0;
  }

  public long getBytes() {
    return bytes;
  }
}
