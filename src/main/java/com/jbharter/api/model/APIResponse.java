package com.jbharter.api.model;


import java.io.Reader;

public interface APIResponse<R> {

    R getResponse();
    void onSuccess(Reader thing);
    void onEmpty();
    void onException(Exception e);
}
