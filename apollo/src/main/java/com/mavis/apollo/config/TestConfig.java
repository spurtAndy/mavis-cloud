package com.mavis.apollo.config;

import org.springframework.beans.factory.annotation.Value;


public class TestConfig {

    @Value("${test.input}")
    private String input;
    @Value("${test.input1}")
    private String input1;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getInput1() {
        return input1;
    }

    public void setInput1(String input1) {
        this.input1 = input1;
    }
}
