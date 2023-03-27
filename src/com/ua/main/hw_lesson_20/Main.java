package com.ua.main.hw_lesson_20;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, List<String>> vocabulary = new LinkedHashMap<>();

        vocabulary.put("Привіт", List.of("Hello","Hallo","こんにちは"));
        vocabulary.put("Дім", List.of("Home","Heim","家"));
        vocabulary.put("Країна", List.of("Country","Land","国"));
        vocabulary.put("Війна", List.of("War","Krieg","戦争"));
        vocabulary.put("Вулиця", List.of("Street","Straße","街"));
        vocabulary.put("Літак", List.of("Plane","Ebene","飛行機"));
        vocabulary.put("Потяг", List.of("Train","Zug","訓練"));
        vocabulary.put("Сонце", List.of("Sun","Sonne","太陽"));
        vocabulary.put("Хмара", List.of("Cloud","Wolke","雲"));
        vocabulary.put("Кавун", List.of("Watermelon","Wassermelone","スイカ"));

        System.out.println("Please enter word from list you want to translate:");

        for(Map.Entry<String, List<String>> entry : vocabulary.entrySet()){
            System.out.println(entry.getKey());
        }

        Scanner scanner = new Scanner(System.in);

        String stringToTranslate = scanner.nextLine();

        if(vocabulary.get(stringToTranslate) != null){
            System.out.println(vocabulary.get(stringToTranslate));
        }
        else {
            System.out.println("Word not found! Try again with number");
            vocabularu_version_1();
        }

    }

    public static void vocabularu_version_1(){

        Map<String, List<String>> vocablulary = new HashMap<>();

        vocablulary.put("UKR", List.of("Привіт",
                "Дім",
                "Країна",
                "Війна",
                "Вулиця",
                "Літак",
                "Потяг",
                "Сонце",
                "Хмара",
                "Кавун"));

        vocablulary.put("ENG", List.of("Hello",
                "Home",
                "Country",
                "War",
                "Street",
                "Plane",
                "Train",
                "Sun",
                "Cloud",
                "Watermelon"));

        vocablulary.put("GER",List.of("Hallo",
                "Heim",
                "Land",
                "Krieg",
                "Straße",
                "Ebene",
                "Zug",
                "Sonne",
                "Wolke",
                "Wassermelone"));

        vocablulary.put("JPN", List.of("こんにちは",
                "家",
                "国",
                "戦争",
                "街",
                "飛行機",
                "訓練",
                "太陽",
                "雲",
                "スイカ"));


        System.out.println("Please enter number of word you want to translate or 0 to exit: ");

        int worldValue = 1;
        for(int i = 0; i < vocablulary.get("UKR").toArray().length; i++)
        {
            System.out.println(worldValue + "\t" + vocablulary.get("UKR").toArray()[i]);
            worldValue++;
        }

        Scanner scanner = new Scanner(System.in);
        int numberOfWordToTranslate = scanner.nextInt();

        while(numberOfWordToTranslate > 0 && numberOfWordToTranslate <=10)
        {
            System.out.println("UKR:\t" + vocablulary.get("UKR").toArray()[numberOfWordToTranslate - 1]);
            System.out.println("ENG:\t" + vocablulary.get("ENG").toArray()[numberOfWordToTranslate - 1]);
            System.out.println("GER:\t" + vocablulary.get("GER").toArray()[numberOfWordToTranslate - 1]);
            System.out.println("JPN:\t" + vocablulary.get("JPN").toArray()[numberOfWordToTranslate - 1]);

            System.out.println("\nInput next number");
            numberOfWordToTranslate = scanner.nextInt();
        }

    }

}
