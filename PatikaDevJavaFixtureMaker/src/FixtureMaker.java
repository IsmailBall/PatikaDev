
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class FixtureMaker {

    public static int term = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LinkedList<String> teams = new LinkedList<>();

        getTeams(teams, scanner);
        balanceTeams(teams);
        
        makeFixture(teams);//creates fixture for first term of the teams
        makeFixture(teams);//creates fixture for second term of the teams

    }

    private static void makeFixture(LinkedList<String> teams) {

        LinkedList<String[]> seperatedFixtures = createEachTeamFixture(teams);
        int size = teams.size();

        //FixtureMaker algorithm part one
        for (int i = 0; i < size / 2; i++) {

            int k = 1;
            for (int j = size - 1; j > i * 2; j--) {
                String opponentTeam = teams.get((size - k) - i);
                String[] opponentTeamFixture = getTheTeam(seperatedFixtures, opponentTeam);

                seperatedFixtures.get(i)[k] = opponentTeam;
                opponentTeamFixture[k] = seperatedFixtures.get(i)[0];

                k = k + 1;
            }
        }

        //FixtureMaker algorithm part two
        for (int i = 1; i < size / 2; i++) {
            int k = 0;
            for (int j = 0; j < size; j++) {
                if (seperatedFixtures.get(i)[j] == null) {
                    String opponentTeam = teams.get((size - 1) - (k++));
                    String[] opponentTeamFixture = getTheTeam(seperatedFixtures, opponentTeam);

                    seperatedFixtures.get(i)[j] = opponentTeam;
                    opponentTeamFixture[j] = seperatedFixtures.get(i)[0];
                }

            }
        }

        //FixtureMaker algorithm part three
        for (int i = size - 1; i > size / 2; i--) {
            int k = 1;
            for (int j = 0; j < size; j++) {
                if (seperatedFixtures.get(i)[j] == null) {
                    String opponentTeam = teams.get(i - (k++));
                    String[] opponentTeamFixture = getTheTeam(seperatedFixtures, opponentTeam);

                    seperatedFixtures.get(i)[j] = opponentTeam;
                    opponentTeamFixture[j] = seperatedFixtures.get(i)[0];
                }

            }

        }

        displayFixtures(seperatedFixtures);
        Collections.shuffle(teams);//shuffles for the second term of league
    }

    //Returns searched team's fixture
    private static String[] getTheTeam(LinkedList<String[]> seperatedFixtures, String searchedTeam) {
        for (String[] seperatedFixture : seperatedFixtures) {
            if (seperatedFixture[0].compareTo(searchedTeam) == 0) {
                return seperatedFixture;
            }
        }
        return null;
    }

    //Creates ficture array for each teams
    private static LinkedList<String[]> createEachTeamFixture(LinkedList<String> teams) {
        LinkedList<String[]> seperatedFixtures = new LinkedList<>();

        for (int i = 0; i < teams.size(); i++) {
            String[] fixture = new String[teams.size()];
            fixture[0] = teams.get(i);
            seperatedFixtures.add(fixture);
        }

        return seperatedFixtures;
    }

    //Dynamic inputs are given
    private static void getTeams(LinkedList<String> teams, Scanner scanner) {
        String team;
        while (true) {
            System.out.print("Enter the team name (Type 'exit' to exit): ");
            team = scanner.next();
            if (team.compareTo("exit") == 0) {
                break;
            }
            teams.add(team);
        }
        Collections.shuffle(teams);
        System.out.println("");
    }

    //If the size of teams is even number, this function balances the list of teams by adding 'Bay' for the days which there is not match for corresponding team
    private static void balanceTeams(LinkedList<String> teams) {
        if (teams.size() % 2 == 1) {
            teams.add("Bay");
        }
    }

    //Displays each team's fixture week by week 
    private static void displayFixtures(LinkedList<String[]> seperatedFixtures) {
        for (String[] seperatedFixture : seperatedFixtures) {
            System.out.println("===================================================================");
            System.out.println((term + 1) + ".Term\tFixture\tof:\t" + seperatedFixture[0] + "\n");
            int i = 1;
            for (i = 1; i < seperatedFixture.length; i++) {
                System.out.printf("%d.week =>\t%s\tvs\t\t%s\n", (i + (seperatedFixture.length * term)), seperatedFixture[0], seperatedFixture[i]);
            }
        }
        term = term + 1;
    }

}
