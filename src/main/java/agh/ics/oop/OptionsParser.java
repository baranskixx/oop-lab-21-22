package agh.ics.oop;

import java.util.ArrayList;

public class OptionsParser {
    public MoveDirection[] parse(String[] instructions){
        ArrayList<MoveDirection> moves = new ArrayList<>();

        for (String i : instructions){
            switch (i) {
                case "f", "forward" -> moves.add(MoveDirection.FORWARD);
                case "b", "backward" -> moves.add(MoveDirection.BACKWARD);
                case "r", "right" -> moves.add(MoveDirection.RIGHT);
                case "l", "left" -> moves.add(MoveDirection.LEFT);
                default -> {
                    throw new IllegalArgumentException(i + " is not legal move specification");
                }
            }
        }
        return moves.toArray(new MoveDirection[0]);
    }
}
