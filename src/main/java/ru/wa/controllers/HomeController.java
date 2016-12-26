package ru.wa.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import javafx.scene.chart.PieChart;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import ru.wa.models.DataObject;

/**
 * Created by Oleg on 22.12.2016.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView main(){
        return new ModelAndView("index");
    }
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(){
        return new ModelAndView("login");
    }
    @RequestMapping(value="/getData", method = RequestMethod.GET)
    public @ResponseBody String getData(){
        DataObject result = new DataObject();
        result.setId(1);
        result.setMessage("This is the message from getData function!");
        result.setTitle("Result Data");
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = "";
        try {
            json = ow.writeValueAsString(result);
        } catch (JsonProcessingException e) {
            json = e.toString();
        }
        return json;
    }
}
