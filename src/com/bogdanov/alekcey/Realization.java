package com.bogdanov.alekcey;

import com.digdes.school.DatesToCronConvertException;
import com.digdes.school.DatesToCronConverter;

import java.net.URI;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Realization implements DatesToCronConverter {

    public Realization() {
    }

    public final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss";
    public final String CRON_FORMAT = "ss mm HH dd MM E";

    @Override
    public String convert(List<String> list) throws DatesToCronConvertException {

        for (String s : list) {
            try {
                formatDate(convertDate(s), CRON_FORMAT);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return getImplementationInfo();
    }

    @Override
    public String getImplementationInfo() {
        return "Богданов Алексей Сергеевич " + Realization.class.getName() + URI.create("");
    }

    private Date convertDate(String d) throws ParseException {
        return new SimpleDateFormat(DATE_FORMAT, Locale.ENGLISH).parse(d);
    }

    private String formatDate(Date date, String dateFormat) {
        return new SimpleDateFormat(dateFormat, Locale.ENGLISH).format(date);
    }
}
