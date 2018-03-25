package com.lingxi.signature.api;

import java.util.*;

import com.lingxi.signature.api.auth.Authenticator;
import com.lingxi.signature.api.utils.Helper;

public class Application {

    public static void main(String[] args) {

        Authenticator auther = new Authenticator("key", "secret");
        HashMap<Object, Object> data = new HashMap<Object, Object>();

        data.put("by_column", "mobile|eq|xxx");

        try {
            HashMap query = auther.getAuthParams(data);
            System.out.println("http://local.api.com/v1/test/auth?" + Helper.createQueryLink(query));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
