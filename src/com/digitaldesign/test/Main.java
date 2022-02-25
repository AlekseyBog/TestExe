package com.digitaldesign.test;

import com.bogdanov.alekcey.Realization;
import com.digdes.school.DatesToCronConvertException;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws DatesToCronConvertException {
        List<String> list = new ArrayList<>();
        list.add("2022-01-25T08:00:00");
        list.add("2022-01-25T08:30:00");
        list.add("2022-01-25T09:00:00");
        list.add("2022-01-25T09:30:00");
        Realization realization = new Realization();
        System.out.println(realization.convert(list));
    }
}
