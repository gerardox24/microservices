package com.baufest.demo01;

public class Greeting {
    private Long id;
    private String message;

    public Greeting(long incrementAndGet, String format) {
        this.id = incrementAndGet;
        this.message = format;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
