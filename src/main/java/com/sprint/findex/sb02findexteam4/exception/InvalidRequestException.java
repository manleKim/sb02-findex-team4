package com.sprint.findex.sb02findexteam4.exception;

public class InvalidRequestException extends SystemException {

  public InvalidRequestException(ErrorCode errorCode, Object... args) {
    super(errorCode, args);
  }
}
