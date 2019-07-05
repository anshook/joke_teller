package com.udacity.ak.jokedata;

import java.util.Random;

public class JokeProvider {
    private static final String[] jokes = new String[]{
            "Why was six afraid of seven? Because seven ate nine!",
            "What musical instrument is found in the bathroom? A tuba toothpaste!",
            "What do elves learn in school? The elf-abet!",
            "Where do pencils go for vacation? Pencil-vania!",
            "What did zero say to eight? Nice belt!"
    };

    public String getJoke() {
        int i = new Random().nextInt(jokes.length);
        return jokes[i];
    }
}
