package com.company;

import java.io.IOException;

/**
 * Created by Piotrek on 2016-11-24.
 */
public class WordContainsException extends Exception {

    public WordContainsException(){}

    public WordContainsException(String message) throws IOException{
        super(message);
    }

}
