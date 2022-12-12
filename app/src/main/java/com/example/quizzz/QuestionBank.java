package com.example.quizzz;

import androidx.collection.CircularArray;

import java.util.ArrayList;
import java.util.Arrays;

public class QuestionBank {
    private final int topicNumber = 6;
    private final int levelNumber = 3;

    private static final ArrayList<Questions> easyMath = new ArrayList<> (
            Arrays.asList(
                    new Questions("1 + 1 = 2", true),
                    new Questions("2 - 1 = 1", true),
                    new Questions("5 + 5 + 5 = 15", true),
                    new Questions("10 - 1 - 2 - 3 - 4 = 0", true),
                    new Questions("3 x 3 = 9", true),
                    new Questions("1 - 1 = 3", false),
                    new Questions("12 - 1 = -11", false),
                    new Questions("2 + 4 / 2 = 3", false),
                    new Questions("10 x 10 = 1000", false),
                    new Questions("42 / 7 = 8", false)
            )
    );

    private static final ArrayList<Questions> mediumMath = new ArrayList<> (
            Arrays.asList(
                    new Questions("sin π/2 = 1", true),
                    new Questions("2 log 100 = 4", true),
                    new Questions("1^2^3^4^5 = 1", true),
                    new Questions("||1 + i|| = sqrt(2)", true),
                    new Questions("ln a + ln b = ln ab", true),
                    new Questions("cos π/2 = 1", false),
                    new Questions("2 log 100 = 200", false),
                    new Questions("sin(π/3)^2 +  sin(π/6)^2 = 0", false),
                    new Questions("4/9 ≈ 0.45", false),
                    new Questions("||1 + i|| = 2", false)
            )
    );

    private static final ArrayList<Questions> hardMath = new ArrayList<> (
            Arrays.asList(
                    new Questions("x(x+2)(x+5) = 0 has 3 solutions", true),
                    new Questions("lim e^-n = 0 ", true),
                    new Questions("141 is a prime number", true),
                    new Questions("d(x^2 + x + 3)/dx = 2x + 1", true),
                    new Questions("cos(a+b) = cos a x cos b - sin a x sin b", true),
                    new Questions("x^3 + 3x^2 + 9x + 1 = 0 has 3 real solutions", false),
                    new Questions("The coefficient of x^4 in (x^8 + 1/x^4)^6 is 288", false),
                    new Questions("u'v - uv' = (uv)'", false),
                    new Questions("Need at least 6 points to determine a 3D object", false),
                    new Questions("P(ab) = P(a)P(b), with any a,b", false)
            )
    );

    private static final ArrayList<Questions> easyArt = new ArrayList<> (
            Arrays.asList(
                    new Questions("Red is one of the primary colors", true),
                    new Questions("Crayons and pencils can be used to color", true),
                    new Questions("Musical notes mean pitch and duration", true),
                    new Questions("Landscape pictures involve as fewer as id as possible", true),
                    new Questions("Green is one of the primary", false),
                    new Questions("Mix blue and green to receive yellow", false),
                    new Questions("Note A is always higher than note B", false),
                    new Questions("Music sheets are used to write and read lyrics", false)
            ));

    private static final ArrayList<Questions> mediumArt = new ArrayList<> (
            Arrays.asList(
                    new Questions("Taylor Swift is a famous singer", true),
                    new Questions("There are plenty of music genres", true),
                    new Questions("Paintings can be displayed in parks or galleries", true),
                    new Questions("A singer cannot be a composer", false),
                    new Questions("Black and White aren't needed in the color palette", false),
                    new Questions("Music sheets are used to write and read lyrics", false)
            ));
    private static final ArrayList<Questions> hardArt = new ArrayList<> (
            Arrays.asList(
                    new Questions("Abstract paintings have implicit meanings to be inferred", true),
                    new Questions("Mona Lisa painting is from Renaissance period", true),
                    new Questions("Rhythm is the traveling of space in time", true),
                    new Questions("Sampling a piece of music can be done with any works", false),
                    new Questions("Consistent cracking is normal", false),
                    new Questions("Line tracing is not a form of copyright infringement", false)
            ));

    private static final ArrayList<Questions> easyHistory = new ArrayList<> (
            Arrays.asList(
                    new Questions("Ho Chi Minh was Vietnam's president", true),
                    new Questions("WWII ended in 1945", true),
                    new Questions("Vietnam used to have kings", true),
                    new Questions("Human race originates from China", false),
                    new Questions("Hung Kings ruled VN after 1000", false),
                    new Questions("America was part of the ancient world", false)
            ));

    private static final ArrayList<Questions> mediumHistory = new ArrayList<> (
            Arrays.asList(
                    new Questions("Ho Chi Minh left VN to France on June 5 1911", true),
                    new Questions("WWII has 2 sides, one of which has Germany", true),
                    new Questions("Vietnam was under colonization for under 2 centuries", true),
                    new Questions("Human race originates from Africa and Europe", false),
                    new Questions("Hung Kings ruled the second dynasty in VN", false),
                    new Questions("Mesopotamia and Scandinavian was part of the ancient world", false)
            ));

    private static final ArrayList<Questions> hardHistory = new ArrayList<> (
            Arrays.asList(
                    new Questions("Ho Chi Minh was the one declaring the independence of VN", true),
                    new Questions("WWII ended where the Nazi side lost", true),
                    new Questions("Vietnam used to have kings", true),
                    new Questions("Human race populated the world, starting from South Korean", false),
                    new Questions("Feudatory period in VN started in 938 AD ", false),
                    new Questions("America was the winner of both world wars happened in 1890s and 1940s", false)
            ));

    private static final ArrayList<Questions> easyScience = new ArrayList<> (
            Arrays.asList(
                    new Questions("F = ma", true),
                    new Questions("H2 + O2 = 2H2O", true),
                    new Questions("Most birds can fly", true),
                    new Questions("P = mg^2", false),
                    new Questions("Na2SO4 + 2KNO3 = K2SO4 + 2NaNO3", false),
                    new Questions("All bananas do not have seed", false)
            ));

    private static final ArrayList<Questions> mediumScience = new ArrayList<> (
            Arrays.asList(
                    new Questions("Torque is the rotational equivalent of linear force", true),
                    new Questions("Combustion requires oxygen", true),
                    new Questions("Whale is mammal, not fish", true),
                    new Questions("We only know 3 subatomic particles", false),
                    new Questions("Oxygen is the most prominent element on Earth", false),
                    new Questions("Chameleon changes their color to camouflage", false)
            ));

    private static final ArrayList<Questions> hardScience = new ArrayList<> (
            Arrays.asList(
                    new Questions("The inertia of a body is directly proportional to its weight", true),
                    new Questions("Sugar and woods are from the same class of organic substance", true),
                    new Questions("Crossbreed, GM food,... are genetically interfere", true),
                    new Questions("Electrical and magnetic characteristics are independent", false),
                    new Questions("Na or K extraction is simpler than Al", false),
                    new Questions("Human exists outside the circle of life", false)
            ));

    private static final ArrayList<Questions> easySport = new ArrayList<> (
            Arrays.asList(
                    new Questions("Soccer needs a ball", true),
                    new Questions("Chess doesn't need a team on each side", true),
                    new Questions("Swimming can take place outside a pool", true),
                    new Questions("Each football team has up to 10 members", false),
                    new Questions("Basketball has 2 baskets and 2 balls", false),
                    new Questions("Chess is not a sport", false)
            ));

    private static final ArrayList<Questions> mediumSport = new ArrayList<> (
            Arrays.asList(
                    new Questions("WorldCup happens every 4 years in normal conditions", true),
                    new Questions("There are 4 tennis GrandSlam", true),
                    new Questions("Golf needs expensive equipment", true),
                    new Questions("Sports are team-based games", false),
                    new Questions("Fencing can take place outside", false),
                    new Questions("Tournaments are in a national range only", false)
            ));

    private static final ArrayList<Questions> hardSport = new ArrayList<> (
            Arrays.asList(
                    new Questions("E-sport is considered a competitive sport because of their large audiences", true),
                    new Questions("The first modern Summer Olympic games take place in Athens", true),
                    new Questions("American Football Games SuperBowl invites famous art", true),
                    new Questions("SEA Games' sports are results of voting from all countries in the region", false),
                    new Questions("Howard Wilkinson was the first Olympic gymnast to score a perfect 10", false),
                    new Questions("Italy won the first FIFA World Cup in 1930", false)
            ));

    private static final ArrayList<Questions> easyLiterature = new ArrayList<> (
            Arrays.asList(
                    new Questions("A story needs characters and events", true),
                    new Questions("English is related to German", true),
                    new Questions("Onomatopoeia refers to words that mimic a sound", true),
                    new Questions("SMS is a signal that means “Help!”", false),
                    new Questions("Symbolism refers to the use of emoji and icons in literature", false),
                    new Questions("Nursery rhymes are the same with poems", false)
            ));

    private static final ArrayList<Questions> mediumLiterature = new ArrayList<> (
            Arrays.asList(
                    new Questions("The Montagues and the Capulets are the rival houses in Romeo and Juliet", true),
                    new Questions("Simile compares two thing without using 'like' or 'as'", true),
                    new Questions("A sentence can just be 1 word", true),
                    new Questions("In Hamlet, Hamlet is Prince of Finland", false),
                    new Questions("A metaphor compares two things using “Like” or “As", false)
            ));

    private static final ArrayList<Questions> hardLiterature = new ArrayList<> (
            Arrays.asList(
                    new Questions("Edmond Dantès is the main character in The Count of Monte Cristo", true),
                    new Questions("A ruba’i is the same as a sonnet", true),
                    new Questions("The Brothers Grimm, authors of fairy tales such as “Hansel and Gretel,” were from Germany", true),
                    new Questions("Agatha Christie wrote only novels", false),
                    new Questions("Herlock Sholmes is the penned name of Sherlock Holmes", false)
            ));

    private static final ArrayList<ArrayList<Questions>> topicMath = createBankTopic(easyMath, mediumMath, hardMath);
    private static final ArrayList<ArrayList<Questions>> topicArt = createBankTopic(easyArt, mediumArt, hardArt);
    private static final ArrayList<ArrayList<Questions>> topicHistory = createBankTopic(easyHistory, mediumHistory, hardHistory);
    private static final ArrayList<ArrayList<Questions>> topicScience = createBankTopic(easyScience, mediumScience, hardScience);
    private static final ArrayList<ArrayList<Questions>> topicSport = createBankTopic(easySport, mediumSport, hardSport);
    private static final ArrayList<ArrayList<Questions>> topicLiterature = createBankTopic(easyLiterature, mediumLiterature, hardLiterature);


    public static ArrayList<ArrayList<ArrayList<Questions>>> list = getBank();

    public static ArrayList<ArrayList<ArrayList<Questions>>> getBank() {
        ArrayList<ArrayList<ArrayList<Questions>>> bank = new ArrayList<>();

        bank.add(topicMath);
        bank.add(topicArt);
        bank.add(topicHistory);
        bank.add(topicScience);
        bank.add(topicSport);
        bank.add(topicLiterature);

        return bank;
    }

    public static ArrayList<ArrayList<Questions>> createBankTopic(ArrayList<Questions> easyBank,
                                                           ArrayList<Questions> mediumBank,
                                                           ArrayList<Questions> hardBank) {
        ArrayList<ArrayList<Questions>> bankTopic = new ArrayList<>();

        bankTopic.add(easyBank);
        bankTopic.add(mediumBank);
        bankTopic.add(hardBank);

        return bankTopic;
    }

    // get Topic Name
    public static String getTopicName(int topicID) {
        String topicName = "";
        switch(topicID) {
            case 0: topicName = "Math"; break;
            case 1: topicName = "Art & Music"; break;
            case 2: topicName = "History"; break;
            case 3: topicName = "Science"; break;
            case 4: topicName = "Sport"; break;
            case 5: topicName = "Literature"; break;
        }

        return topicName;
    }

    // get Difficulty Name
    public static String getDiffName(int difID) {
        String difName = "";
        switch(difID) {
            case 0: difName = "Easy"; break;
            case 1: difName = "Medium"; break;
            case 2: difName = "Hard"; break;
        }

        return difName;
    }
}
