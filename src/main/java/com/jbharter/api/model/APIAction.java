package com.jbharter.api.model;

/**
 * Defining what the execution of a request looks like.
 *
 *   We should define this taking a request as a construction parameter, as well as a response handler.
 *
 *   We need to parametrize,
 *      - what the input body looks like
 *      - encapsulating with API request
 *      - Define the transform that executes the request, returns a Stream maybe?
 *      - Define the final transform that translates the stream into an pojo.
 */
public interface APIAction<T,R> extends APIRequest<T>, APIResponse<R> {

    void execute();
    Class<T> requestClass();
    Class<R> responseClass();

}
