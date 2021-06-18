package Collections;

import java.util.LinkedList;
import java.util.List;

public class LInkedLIstTask {
    public static void main(String[] args) {
        List<String> teams =  new LinkedList<>();

        teams.add("Cowboys");
        teams.add("Eagles");
        teams.add("Patriots");
        teams.add("Seahawks");
        teams.add("Packers");
        teams.add(2,"Giants ");
        System.out.println(teams);
    }
}
