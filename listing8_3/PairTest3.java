package listing8_3;

import listing8_1.Pair;

public class PairTest3 {
    public static void main(String[] args) {
        var ceo = new Manager("Gus Greedy", 800000, 2003, 12, 15);
        var cfo = new Manager("Sid Sneaky", 600000, 2003, 12, 15);
        var buddies = new Pair<Manager>(ceo, cfo);
        printBuddies(buddies); // buddies adalah Manager yang meng extends Employee

        ceo.setBonus(1000000);
        cfo.setBonus(500000);
        Manager[] managers = { ceo, cfo };

        var result = new Pair<Employee>(); // Employee adalah super dari Manager
        minmaxBonus(managers, result); // set min max berdasarkan bonus
        System.out.println("first: " + result.getFirst().getName()
                + ", second: " + result.getSecond().getName());
        maxminBonus(managers, result); // sama seperti minmax tetapi ditukar
        System.out.println("first: " + result.getFirst().getName()
                + ", second: " + result.getSecond().getName());
    }

    public static void printBuddies(Pair<? extends Employee> p) {
        Employee first = p.getFirst(); // ceo
        Employee second = p.getSecond(); // cfo
        System.out.println(first.getName() + " and " + second.getName() + " are buddies.");
    }

    public static void minmaxBonus(Manager[] a, Pair<? super Manager> result) {
        // yang merupakan super dari Manager adalah Employee
        if (a.length == 0)
            return;
        Manager min = a[0];
        Manager max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min.getBonus() > a[i].getBonus())
                min = a[i];
            if (max.getBonus() < a[i].getBonus())
                max = a[i];
        }
        result.setFirst(min);
        result.setSecond(max);
        // first dan second nya diubah berdasarkan min max dari bonus
    }

    public static void maxminBonus(Manager[] a, Pair<? super Manager> result) {
        minmaxBonus(a, result);
        PairAlg.swapHelper(result); // OK--swapHelper captures wildcard type
    }
}
