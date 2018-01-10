import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import models.Place;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");

        //get: show new place form
        get("/places/new", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "place-form.hbs");
        }, new HandlebarsTemplateEngine());

        //post: process new place form
        post("places/new", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            String name = request.queryParams("name");
            String location = request.queryParams("location");
            String notes = request.queryParams("notes");
            Place myPlace = new Place(name, location, notes);
            model.put("place", myPlace)
            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());

        //get: show all places
        get("/", (request, response) -> {
           Map<String, Object> model = new HashMap<>();
           ArrayList<Place> places = Place.getAll();
           model.put("places", places);
           return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        //get: show and individual place
        get("/places/:id", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            int idOfPostToFind = Integer.parseInt(request.params("id"));
            Place foundPlace = Place.findById(idOfPostToFind);
            model.put("place", foundPlace);
            return new ModelAndView(model, "place-detail.hbs");
        }, new HandlebarsTemplateEngine());

        //get: show a form to update a place
        get("/places/:id/update", (request, response) -> {

        }, new HandlebarsTemplateEngine()))

        //post: process a form to update a place
    }
}
