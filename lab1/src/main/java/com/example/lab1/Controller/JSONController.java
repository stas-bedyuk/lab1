package com.example.lab1.Controller;


public record JSONController(long id,double sq,int pr) {
    @Override
    public long id() {
        return id;
    }

    @Override
    public double sq() {
        return sq;
    }

    @Override
    public int pr() {
        return pr;
    }
}
