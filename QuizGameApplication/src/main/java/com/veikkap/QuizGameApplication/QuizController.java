package com.veikkap.QuizGameApplication;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class QuizController {
    private List<QuizQuestionModel> questions = new ArrayList<>();

    // Ohjetiedot endpointin käyttämiseen
    @GetMapping("/")
    public String getInfo() {
        return "Tervetuloa visailupeliin! Voit käyttää seuraavia endpointeja:\n" +
                "GET /questions - Hae kaikki kysymykset\n" +
                "GET /questions/{id} - Hae kysymys tietyllä ID:llä\n" +
                "POST /questions - Lisää uusi kysymys (syötä JSON-muodossa)\n";
    }

    // GET /questions
    @GetMapping("/questions")
    public List<QuizQuestionModel> getAllQuestions() {
        return questions;
    }

    // GET /questions/{id}
    @GetMapping("/questions/{id}")
    public QuizQuestionModel getQuestionById(@PathVariable int id) {
        if (id >= 0 && id < questions.size()) {
            return questions.get(id);
        } else {
            return null;
        }
    }

    // POST /questions
    @PostMapping("/questions")
    public String addQuestion(@RequestBody QuizQuestionModel question) {
        questions.add(question);
        return "Kysymys lisätty onnistuneesti!";
    }
}
