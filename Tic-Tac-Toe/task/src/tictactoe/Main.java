package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        userInput();

    }
    //test2

    public static char[] userInput() {
        Scanner scanner = new Scanner(System.in);

        // input from user
        String input = scanner.nextLine();
        scanner.close();

        char[] charsOfInput = input.toCharArray();
//             [X, X, X, O, O, _, _, O, _]
      //  ticTac(charsOfInput);
        return charsOfInput;
    }
    public static void ticTac() {
        for (int i = 0; i < userInput().length; i++) {
            System.out.println(userInput());
        }

/*
        char[][] board = {{'-', '-', '-', '-', '-', '-', '-', '-', '-'},
//                              i:1 j:2  i:1 j:4  i:1 j:6
                          {'|', ' ', a1, ' ', a2, ' ', a3, ' ', '|'},
//                              i:2 j:2  i:2 j:4  i:2 j:6
                          {'|', ' ', b1, ' ', b2, ' ', b3, ' ', '|'},
//                              i:3 j:2  i:3 j:4  i:3 j:6
                          {'|', ' ', c1, ' ', c2, ' ', c3, ' ', '|'},
                          {'-', '-', '-', '-', '-', '-', '-', '-', '-'}
        };

 */

    }

}