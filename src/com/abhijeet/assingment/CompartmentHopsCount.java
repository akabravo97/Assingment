package com.abhijeet.assingment;

public class CompartmentHopsCount {


    public CompartmentHopsCount() {
    }

    public int countHops(int jetpackValue[], int thesisCompartment) {
        if (jetpackValue.length == 1) {
            return 0;
        }

        if ((jetpackValue[0] == 0) && thesisCompartment > 0) {
            return Integer.MAX_VALUE;
        }

        if (thesisCompartment == 0) {
            return 0;
        }

        return computeHops(jetpackValue, 0, thesisCompartment);

    }

    public int computeHops(int jetpackVal[], int currentCompartment, int thesisCompartment) {
        if (thesisCompartment == currentCompartment)
            return 0;
        if (jetpackVal[currentCompartment] == 0)
            return Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = currentCompartment + 1; i <= thesisCompartment && i <= currentCompartment + jetpackVal[currentCompartment]; i++) {
            int hops = computeHops(jetpackVal, i, thesisCompartment);
            if (hops != Integer.MAX_VALUE && hops + 1 < min)
                min = hops + 1;
        }
        return min;
    }
}
