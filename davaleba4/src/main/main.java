package main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import generators.GenerateTexT;
import generators.Generator;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // write your code here
        String language;
        String parameters;
        Scanner scanner = new Scanner(System.in);
        System.out.print("language input: ");
        language = scanner.nextLine();
        System.out.print("parameters input: ");
        parameters = scanner.nextLine();
//        language = "en";
//        parameters = "p-2-s-5-17-w-7-9";
        String[] parametersArray = parameters.split("-");
        ArrayList param = new ArrayList();
        for (String parameter: parametersArray) {
            try {
                param.add(Integer.parseInt(parameter));
            } catch (NumberFormatException e) {

            }
            catch (Exception e) {
                System.out.println("There is something wrong.. pls Type any of them [ru,en,ge] in language input: \n " +
                        "and for example [s-2-4-w-4-5-c-5-2] where s is 'Sentences' w is 'Words' c is 'Characters' ");
            }

        }
        System.out.println(param);
        Generator generator = new Generator(language, param);
        generator.generateAlphabet();
        System.out.println(generator.generateSentens(param));
    }
}