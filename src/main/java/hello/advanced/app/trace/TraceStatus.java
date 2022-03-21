package hello.advanced.app.trace;

import lombok.Data;

public class TraceStatus {
  private TraceId traceId;
  private Long startTimeMs;
  private String message;

  public TraceId getTraceId() {
    return traceId;
  }

  public Long getStartTimeMs() {
    return startTimeMs;
  }

  public String getMessage() {
    return message;
  }

}
