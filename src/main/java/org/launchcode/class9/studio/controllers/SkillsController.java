package org.launchcode.class9.studio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @ResponseBody
    @GetMapping
    public String homePage() {
        return "<html>" +
                "<body>" +
                "<h1> Skills Tracker </h1>" +
                "<h2> We have a few skills we would like to learn. Here is the list! </h2>" +
                "<ol>" +
                "<li> Java </li>" +
                "<li> Javascript </li>" +
                "<li> Python </li>" +
                "</ol>" +
                "</body>" +
                "</html>";

    }

    @ResponseBody
    @GetMapping("/form")
    public String skillForm() {

        return "<html>" +
                "<body>" +
                "<form action = '/form' method = 'post'>" +
                "<label> Name: </label>" +
                "<input type = 'text' name = 'name'><br>" +

                "<label> My Favorite Language </label>" +
                "<select name = 'fav1'>" +
                "<option value = 'Java'> Java </option>" +
                "<option value = 'JavaScript'> JavaScript </option>" +
                "<option value = 'Python'> Python </option>" +
                "</select><br>" +

                "<label> My 2nd Favorite Language </label>" +
                "<select name = 'fav2'>" +
                "<option value = 'Java'> Java </option>" +
                "<option value = 'JavaScript'> JavaScript </option>" +
                "<option value = 'Python'> Python </option>"  +
                "</select><br>" +

                "<label> My 3rd Favorite Language </label>" +
                "<select name = 'fav3'>" +
                "<option value = 'Java'> Java </option>" +
                "<option value = 'JavaScript'> JavaScript </option>" +
                "<option value = 'Python'> Python </option>" +
                "</select><br>" +

                "<input type = 'submit' value = 'Submit'><br>" +

                "</form>" +
                "</body>" +
                "</html>";

    }

    @ResponseBody
    @PostMapping ("/form")
    public String answers(@RequestParam String name, @RequestParam String fav1, @RequestParam String fav2, @RequestParam String fav3) {
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + fav1 + "</li>" +
                "<li>" + fav2 + "</li>" +
                "<li>" + fav3 + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
//sbfbdfbdf
    }

}
