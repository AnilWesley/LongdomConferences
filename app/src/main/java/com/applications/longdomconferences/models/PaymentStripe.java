package com.applications.longdomconferences.models;

import java.io.Serializable;

public class PaymentStripe  {


    /**
     * publishableKey : pk_test_0F6G0nbuIDrAVtVzRKeTZGNb00XUOCe26c
     * clientSecret : pi_1HLOssHAXQKmj8Fj5OWw7tpo_secret_l1BO3FUEPpkbPFgvvABiYPGWr
     */

    private String publishableKey;
    private String clientSecret;

    public String getPublishableKey() {
        return publishableKey;
    }

    public void setPublishableKey(String publishableKey) {
        this.publishableKey = publishableKey;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }
}
