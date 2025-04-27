package org.example;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;


public class StateOfTicTacToe {
    public GameState determineState(String[] board) {
        List<Character> letters = (board[0] + board[1] + board[2]).chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        int xCount = Collections.frequency(letters, 'X');
        int oCount = Collections.frequency(letters, 'O');

        boolean isAnyAvailable = false;
        boolean isXWins = false;
        boolean isOWins = false;

        String[] extended = {"", "", "", "", "", "", "", ""};

        for (String row : board)
        {
            extended[0] += "" + row.charAt(0); // 1 col
            extended[1] += "" + row.charAt(1); // 2 col
            extended[2] += "" + row.charAt(2); // 3 col
            extended[3] += "" + row.charAt(0 + extended[3].length()); // 1 diagonal
            extended[4] += "" + row.charAt(2 - extended[4].length()); // 2 diagonal
        }
        // getting all together
        extended[5] += board[0];
        extended[6] += board[1];
        extended[7] += board[2];

        for (String ext : extended)
        {

            letters = ext.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
            int xExtCount = Collections.frequency(letters, 'X');
            int oExtCount = Collections.frequency(letters, 'O');

            System.out.println(ext + " " + xExtCount + " " + oExtCount + ( xExtCount <= 2 && oExtCount == 0 || oExtCount <= 2 && xExtCount == 0 ));

            if (xExtCount <= 2 && oExtCount == 0 || oExtCount <= 2 && xExtCount == 0)
            {
                isAnyAvailable = true;
            }

            if (xExtCount == 3)
            {
                isXWins = true;
            }

            if (oExtCount == 3)
            {
                isOWins = true;
            }
        }


        GameState state = GameState.DRAW;
        if (oCount > xCount)
        {
            throw new IllegalArgumentException("Wrong turn order: O started");
        }
        else if (xCount - oCount > 1)
        {
            throw new IllegalArgumentException("Wrong turn order: X went twice");
        }
        else if (isXWins && isOWins)
        {
            throw new IllegalArgumentException("Impossible board: game should have ended after the game was won");
        }
        else if (isXWins || isOWins)
        {
            state = GameState.WIN;
        }
        else if (isAnyAvailable)
        {
            state = GameState.ONGOING;
        }

        return state;

    }
}
