package cat.itacademy.barcelonactiva.salgadosalichs.josep.s04.t01.n02.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    //region ATTRIBUTES


    //endregion ATTRIBUTES


    //region CONSTRUCTOR

    //endregion CONSTRUCTOR


    //region METHODS
    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(name="nom", required=false, defaultValue="UNKNOWN") String nom){
        return String.format("Hola, %s. Estàs executant un projecte Maven", nom);
    }

    @GetMapping(value = {"/HelloWorld2", "/HelloWorld2/{nom}"})
    public String saluda2(@PathVariable(required = false) String nom){
        //region VARIABLES
        String text;

        //endregion VARIABLES


        //region ACTIONS
        text =(nom!=null)? nom: "UNKNOWN";

        //endregion ACTIONS

        // OUT
        return String.format("Hola, %s. Estàs executant un projecte Maven", text);

    }

    //endregion METHODS


}
