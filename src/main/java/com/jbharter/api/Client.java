package com.jbharter.api;

import org.slf4j.Logger;


/**
 * Management interface for submitting tasks and getting responses.
 */
public interface Client {

    Logger getLogger();
    String getDefaultURL();

}
