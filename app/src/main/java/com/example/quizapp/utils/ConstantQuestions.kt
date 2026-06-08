package com.example.quizapp.utils

import com.example.quizapp.R
import com.example.quizapp.model.Questions

object ConstantQuestions {

    fun getQuestions(): ArrayList<Questions> {

        val questionsList = ArrayList<Questions>()

        val ques1 = Questions(
            1,
            "Who painted the Mona Lisa?",
            R.drawable.screenshot_23,
            "Michelangelo",
            "Leonardo da Vinci",
            "Vincent van Gogh",
            "Raphael",
            2
        )

        val ques2 = Questions(
            2,
            "Who invented light bulb?",
            R.drawable.screenshot_24,
            "Nikola Tesla",
            "Alexander Graham Bell",
            "Thomas Edison ",
            "Isaac Newton",
            3
        )

        val ques3 = Questions(
            3,
            "Which country flag is this?",
            R.drawable.screenshot__13_,
            "Eritrea",
            "Djibouti",
            "Dominica",
            "Comoros",
            4
        )

        val ques4 = Questions(
            4,
            "What is the capital of Japan?",
            R.drawable.screenshot_25,
            "Hiroshima",
            "Osaka",
            "Tokyo",
            "Kyoto",
            3
        )

        val ques5 = Questions(
            5,
            "How many bones are present in the human body?",
            R.drawable.screenshot_26,
            "200",
            "196",
            "206",
            "204",
            3
        )

        val ques6 = Questions(
            6,
            "Who wrote the book Harry Potter?",
            R.drawable.screenshot_27,
            "Roald Dahl",
            "C.S. Lewis",
            "Tolkien",
            "J.K. Rowling",
            4
        )

        val ques7 = Questions(
            7,
            "What is the smallest country in the world?",
            R.drawable.screenshot_28,
            "Monaco",
            "San Marino",
            "Vatican City",
            "Croatia",
            3
        )

        val ques8 = Questions(
            8,
            "Which is the longest river in the world?",
            R.drawable.screenshot_29,
            "Yangtze",
            "Nile",
            "Amazon",
            "Ganges",
            2
        )

        val ques9 = Questions(
            9,
            "Which country flag is this?",
            R.drawable.screenshot__19_,
            "Fiji",
            "Tuvalu",
            "San Marino",
            "Tonga",
            3
        )

        val ques10 = Questions(
            10,
            "What is the fastest jet aircraft ever built?",
            R.drawable.screenshot_40,
            "SR-71 Blackbird",
            "F-22 Raptor",
            "F-15 Eagle",
            "MiG-25",
            1
        )

        val ques11 = Questions(
            11,
            "What does cc mean in bike engines?",
            R.drawable.screenshot_41,
            "Cubic Capacity",
            "Carbon Capacity",
            "Cylinder Count",
            "Core Combustion",
            1
        )


        val ques12 = Questions(
            12,
            "Which ancient wonder was located in Egypt?",
            R.drawable.screenshot_31,
            "Colosseum",
            "The Great Pyramid of Giza",
            "Hanging Gardens",
            "Statue of Zeus",
            2
        )

        val ques13 = Questions(
            13,
            "Who was known as the Iron Man of India?",
            R.drawable.screenshot_32,
            "Jawaharlal Nehru",
            "Mahatma Gandhi",
            "Subhas Chandra Bose",
            "Sardar Vallabhbhai Patel",
            4
        )

        val ques14 = Questions(
            14,
            "Who was the first woman to win a Nobel Prize?",
            R.drawable.screenshot_33,
            "Mother Teresa",
            "Ada Lovelace",
            "Rosalind Franklin",
            "Marie Curie",
            4
        )

        val ques15 = Questions(
            15,
            "Who invented the telephone?",
            R.drawable.screenshot_34,
            "Alexander Graham Bell",
            "Thomas Edison",
            "Nikola Tesla",
            "Albert Einstein",
            1
        )

        val ques16 = Questions(
            16,
            "Which country has the largest population?",
            R.drawable.screenshot_35,
            "Indonesia",
            "India",
            "USA",
            "China",
            2
        )

        val ques17 = Questions(
            17,
            "What does BMW stand for?",
            R.drawable.screenshot_37,
            "British Motor Works",
            "Bavarian Motor Works",
            "Belgian Motor Works",
            "Berlin Motor Works",
            2
        )

        val ques18 = Questions(
            18,
            "What force keeps us on the ground?",
            R.drawable.screenshot_30,
            "Gravity",
            "Friction",
            "Magnetism",
            "Tension",
            1
        )

        val ques19 = Questions(
            19,
            "What is the speed of light?",
            R.drawable.screenshot_36,
            "3 × 10¹⁰ m/s",
            "3 × 10⁴ m/s",
            "3 × 10⁸ m/s",
            "3 × 10⁶ m/s",
            3
        )

        val ques20 = Questions(
            20,
            "Who invented the first successful airplane?",
            R.drawable.screenshot_39,
            "Charles Lindbergh",
            "Wright Brothers",
            "Amelia Earhart",
            "Howard Hughes",
            2
        )

        val ques21 = Questions(
            21,
            "Which car brand makes the Mustang?",
            R.drawable.screenshot_38,
            "Ford",
            "Toyota",
            "Dodge",
            "Chevrolet",
            1
        )

        val ques22 = Questions(
            22,
            "Which country flag is this?",
            R.drawable.screenshot__14_,
            "Brazil",
            "China",
            "San Marino",
            "Chad",
            1
        )

        val ques23 = Questions(
            23,
            "What does SUV stand for?",
            R.drawable.screenshot_42,
            "Super Utility Van",
            "Sport Utility Vehicle",
            "Standard Utility Van",
            "Speed Utility Vehicle",
            2
        )

        val ques24 = Questions(
            24,
            "What is the derivative of sin(x)?",
            R.drawable.screenshot_43,
            "-sin(x)",
            "-cos(x)",
            "tan(x)",
            "cos(x)",
            4
        )

        val ques25 = Questions(
            25,
            "What is the chemical formula of common salt?",
            R.drawable.screenshot_44,
            "NaOH",
            "KCl",
            "NaCl",
            "CaCl₂",
            3
        )

        questionsList.add(ques1)
        questionsList.add(ques2)
        questionsList.add(ques3)
        questionsList.add(ques4)
        questionsList.add(ques5)
        questionsList.add(ques6)
        questionsList.add(ques7)
        questionsList.add(ques8)
        questionsList.add(ques9)
        questionsList.add(ques10)
        questionsList.add(ques11)
        questionsList.add(ques12)
        questionsList.add(ques13)
        questionsList.add(ques14)
        questionsList.add(ques15)
        questionsList.add(ques16)
        questionsList.add(ques17)
        questionsList.add(ques18)
        questionsList.add(ques19)
        questionsList.add(ques20)
        questionsList.add(ques21)
        questionsList.add(ques22)
        questionsList.add(ques23)
        questionsList.add(ques24)
        questionsList.add(ques25)

        return questionsList
    }
}