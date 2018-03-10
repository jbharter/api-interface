package com.jbharter.api.model;

/**
 * where T is the underlying type for the serialized body.
*/
@FunctionalInterface
public interface APIRequest<T> {

    T getRequest();
}
