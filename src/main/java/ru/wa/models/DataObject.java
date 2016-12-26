package ru.wa.models;

import javafx.scene.chart.PieChart;
import org.springframework.stereotype.Component;

/**
 * Created by Oleg on 26.12.2016.
 */
@Component
public class DataObject {
    private String title;
    private String message;
    private int id;

    public DataObject(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
