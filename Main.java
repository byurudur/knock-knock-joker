import java.util.Objects;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        String[] jokes = {

                (
                        "Water.\n" +
                                "Water who?\n" +
                                "Water you asking so many questions for, just open up!\n"),

                (
                        "A little old lady.\n" +
                                "A little old lady who?\n" +
                                "Hey, I didn’t know you could yodel!\n"),

                (
                        "Nobel.\n" +
                                "Nobel who?\n" +
                                "Nobel … that’s why I knocked!\n"),

                (
                        "Needle.\n" +
                                "Needle who?\n" +
                                "Needle little help opening the door!\n"),


                (
                        "Venice.\n" +
                                "Venice who?\n" +
                                "Venice your dad coming home?\n"),


                (
                        "You.\n" +
                                "You who?\n" +
                                "Yoo-hoo! Anybody home?\n"),

                (
                        "Radio.\n" +
                                "Radio who?\n" +
                                "Radio not, here I come!\n"),

                (
                        "Ice cream.\n" +
                                "Ice cream who?\n" +
                                "ICE CREAM SO YOU CAN HEAR ME!\n"),

                (
                        "Weirdo.\n" +
                                "Weirdo who?\n" +
                                "Weirdo you think you’re going?\n"),

                (
                        "Canoe.\n" +
                                "Canoe who?\n" +
                                "Canoe come out now?\n"),

                (
                        "Tank.\n" +
                                "Tank who?\n" +
                                "You’re welcome.\n"),

                (
                        "Howl.\n" +
                                "Howl who?\n" +
                                "Howl you know unless you open the door?\n"),

                (
                        "Hatch.\n" +
                                "Hatch who?\n" +
                                "Bless you!\n"),

                (
                        "Spell.\n" +
                                "Spell who?\n" +
                                "Okay, W-H-O!\n"),


                (
                        "Avenue.\n" +
                                "Avenue who?\n" +
                                "Avenue knocked on this door before?")
        };

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        String randomJoke;
        int knock;
        randomJoke = jokes[rand.nextInt(jokes.length)];

        System.out.println("Hey! Wanna hear a joke?");
        System.out.println("type '1' to ask 'who is there?' ");
        knock = input.nextInt();
        if (knock == 1) {
            System.out.println("Knock Knock!");
            System.out.println("Who is there?");
            System.out.println(randomJoke);
        } else {
            do {
                System.out.println("You don't know how to math? ");
                break;
            } while (knock != 1);
        }
    }
}
