package com.innotech.compiler;

import javax.lang.model.element.Element;

/**
 * Created by sunyuqin on 16/8/29.
 */
public class ProcessingException extends Exception {

    Element element;

    public ProcessingException(Element element, String msg, Object... args) {
        super(String.format(msg, args));
        this.element = element;
    }

    public Element getElement() {
        return element;
    }
}
