package com.revature.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("draw")
public class ArtController {

    @GetMapping("cartoon")
    public String drawCartoon(){
        return "DRAWING SPONGEBOB O_o";
    }

    @GetMapping("nature")
    public String drawNature(){
//        System.out.println("Buy my supplies"); // 15 lines of code
//        System.out.println("Play some music"); // 7 lines of code
//        System.out.println("Drink some coffee"); // 9 lines of code

        String result = "DRAWING THE AMAZON --->>>";

        //System.out.println("Braggin to all my friends"); // 6 lines of code

        return result;
    }

    @GetMapping("anime/{character}")
    public String drawAnime(@PathVariable String character){
//        System.out.println("Buy my supplies"); // 15 lines of code
//        System.out.println("Play some music"); // 7 lines of code
//        System.out.println("Drink some coffee"); // 9 lines of code

        String result = "DRAWING " + character + " :)";

        //System.out.println("Braggin to all my friends"); // 6 lines of code

        return result;
    }

    @GetMapping("throwing")
    public String drawThrowing(){
        throw new RuntimeException();
    }

}
