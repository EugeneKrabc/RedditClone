package com.example.redditclone.exceptions;

public class SpringRedditException extends RuntimeException {
    public SpringRedditException(String msg) {
        super(msg);
    }

    public SpringRedditException(String msg, Exception ex) {
        super(msg, ex);
    }
}
