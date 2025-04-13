public class TimeDuration extends Token {
  private final long millis;

  public TimeDuration(String value) {
    super(value);
    this.millis = parseMillis(value);
  }

  private long parseMillis(String value) {
    if (value.endsWith("ms")) return Long.parseLong(value.replace("ms", ""));
    if (value.endsWith("s")) return Long.parseLong(value.replace("s", "")) * 1000;
    if (value.endsWith("m")) return Long.parseLong(value.replace("m", "")) * 60000;
    if (value.endsWith("h")) return Long.parseLong(value.replace("h", "")) * 3600000;
    return 0;
  }

  public long getMillis() {
    return millis;
  }
}
