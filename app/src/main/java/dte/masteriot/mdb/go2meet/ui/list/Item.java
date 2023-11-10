package dte.masteriot.mdb.go2meet.ui.list;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Item {

    private Date date;
    private String eventName;
    private Long key;

    public Item(String eventName, String date, Long key) {
        this.eventName = eventName;
        SimpleDateFormat formatter = new SimpleDateFormat("DD/MM/YYYY");
        try {
            this.date= formatter.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        this.key=key;
    }
    public String getEventName() {
        return eventName;
    }
}
