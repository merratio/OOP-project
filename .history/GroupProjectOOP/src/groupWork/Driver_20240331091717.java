package groupWork;

import java.io.IOException;

public class Driver {

    public static void main(String arg[]) {

        Coach coach = new Coach("000",
                "Andre Mason",
                new Date(29, 1, 2005),
                "F",
                new Date(29, 3, 2015),
                new Date(0, 0, 0),
                20000.00F);

        try {
            coach.edit_coach("Andre Mason", "Germain White");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    /*
     * coach.addCoach("000",
     * "Andre Mason",
     * new Date(29, 1, 2005),
     * "F",
     * new Date(29, 3, 2015),
     * new Date(0, 0, 0),
     * 20000.00F);
     */

}
