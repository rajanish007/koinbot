package com.epex.koinbot.rest.services.interfaces;

public interface HTTPMethods {

    String sendGet(String url) throws Exception;

    String sendPost(String url, String urlParameters) throws Exception;

}
