package com.jpay.media.automation.web.utilities;

public class CommonException extends RuntimeException {

	private static long serialVersionUID = 1L;

	public CommonException(String message) {
		super(message);
	}

	public CommonException(Throwable cause) {
		super(cause);
	}
}
