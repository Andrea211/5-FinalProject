package com.example.jokeslib;

import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

public class MyJokesClass {

    List<String> listOfJokes = asList(
        "When I see lovers' names carved in a tree, I don't think it's sweet. I just think it's surprising how many people bring a knife on a date.",
            "I'm sorry but you suffer from a terminal illness and have only 10 to live.\"\n" +
                    "\n" +
                    "Patient: \"What do you mean, 10? 10 what? Months? Weeks?!\"\n" +
                    "\n" +
                    "Doctor: \"Nine.",
            "My old aunts would come and tease me at weddings: “Well Sarah? Do you think you/ll be next?” \n" +
                    "-\n" +
                    "We’ve settled this quickly once I’ve started doing the same to them at funerals",
            "A doctor accidentally prescribes his patient a laxative instead of a coughing syrup.\n" +
                    "-\n" +
                    "Three days later the patient comes for a check-up and the doctor asks: “Well? Are you still coughing?”\n" +
                    "-\n" +
                    "The patient replies: “No. I’m afraid to.” ",
            "Job interviewer: “And where would you see yourself in five years’ time Mr. Jeffries?\"\n" +
                    "-\n" +
                    "Mr. Jeffries: \"Personally I believe my biggest weakness is in listening.\"",
            "An old grandma brings a bus driver a bag of peanuts every day. \n" +
                    "\n" +
                    "First the bus driver enjoyed the peanuts but after a week of eating them he asked: \"Please granny, don't bring me peanuts anymore. Have them yourself.\". \n" +
                    "\n" +
                    "The granny answers: \"You know, I don't have teeth anymore. I just prefer to suck the chocolate around them.\"",
            "Dentist: “This will hurt a little.”\n" +
                    "\n" +
                    "Patient: “OK.”\n" +
                    "\n" +
                    "Dentist: “I’ve been having an affair with your wife for a while now.”",
            "I got another letter from this lawyer today. It said “Final Notice”. Good that he will not bother me anymore. ",
            "I dreamed I was forced to eat a giant marshmallow. When I woke up, my pillow was gone.",
            "An eskimo brings his friend to his home for a visit. When they arrive, his friend asks, puzzled – “So where’s your igloo?”\n" +
                    "-\n" +
                    "The friend replies “Oh no, I must’ve left the iron on…”",
            "\"Can you please hold my hand?\"A mother asks her son: \"Anton, do you think I’m a bad mom?\"\n" +
                    "-\n" +
                    "Son: \"My name is Paul.\"",
            "\n" +
                    "Doctor: You're obese. \n" +
                    "-\n" +
                    "Patient: For that I definitely want a second opinion. \n" +
                    "-\n" +
                    "Doctor: You’re quite ugly, too.",
            "Two donkeys are standing at a roadside, one asks the other: So, shall we cross?\n" +
                    "-\n" +
                    "The other shakes his head: \"No way, look at what happened to the zebra.\"",
            "Guest to the waiter: “Can you bring me what the lady at the next table is having?” \n" +
                    "-\n" +
                    "Waiter: “Sorry, sir, but I’m pretty sure she wants to eat it herself.”",
            "\"Mom, where do tampons go?\"\n" +
                    "\n" +
                    "\"Where the babies come from, darling.\"\n" +
                    "\n" +
                    "\"In the stork?\"",
            "A husband and a wife sit at the table, having dinner. The woman drops a bit of tomato sauce on her white top. \"Oh no, I look like a pig!\" \n" +
                    "\n" +
                    "The man nods, \"And you dropped tomato sauce on your top!\"",
            "Husband: Wow, honey, you look really different today. Did you do something to your hair?\n" +
                    "-\n" +
                    "Wife: Michael, I’m over here!",
            "Boy complains to his father: You told me to put a potato in my swimming trunks! You said it would impress the girls at the pool! But you forgot to mention one thing!\n" +
                    "\n" +
                    "Father: Really, what?\n" +
                    "\n" +
                    "Boy: That the potato should go in the front.",
            "One of the most wonderful things in life is to wake up and enjoy a cuddle with somebody; unless you are in prison.",
            "One company owner asks another: “Tell me, Bill, how come your employees are always on time in the mornings?”\n" +
                    "\n" +
                    "Bill replies: “Easy. 30 employees and 20 parking spaces.”"

    );

    public String getJoke(){
        Random random = new Random();
        return listOfJokes.get(random.nextInt(listOfJokes.size()));
    }
}
