package ch09annotations;

import java.lang.reflect.Field;

public class ModifyWithReflection {

    public static void main(String[] args) {

        Match match = new Match("Chelsea", "Newcastle");

        try {
            Field homeGoals = match.getClass().getDeclaredField("homeGoals");
            Field awayGoals = match.getClass().getDeclaredField("awayGoals");
            homeGoals.setAccessible(true);
            awayGoals.setAccessible(true);
            homeGoals.set(match, 0);
            awayGoals.set(match, 17);
            System.out.println(match);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            System.out.println(e.getMessage());;
        }


    }

}
