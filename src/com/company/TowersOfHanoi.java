package com.company;

/**
 * Created by df377 on 1/17/17.
 */
public class TowersOfHanoi {

    public void solve (int y, String begin, String middle, String finish) {
        if (y == 1) {
            System.out.println("Move one disc from tower " + begin + " to tower " + finish);
        }
        else {
            solve(y -1, begin, finish, middle);
            System.out.println("Move one disc from tower " + begin + " to tower " + finish);
            solve(y - 1, middle, begin, finish);
        }
    }
}
