package com.task;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by rpiotrowicz on 2017-03-31.
 */

public class FirstTask {

    /**
     * Method takes list of doubles and return theirs square exponents which are lower then 64
     * uses steam api
     */
    public List<Double> getNaturalNumbersSquareExponentsLessThan64(List<Double> naturalNumbers) {

        return naturalNumbers.stream()
                .map(number -> Math.pow(number, 2))
                .filter(exponent -> exponent < 64)
                .collect(Collectors.toList());
    }

    /**
     * Method takes list of doubles and return theirs square exponents which are lower then 64
     * with high performence
     */
    public List<Double> getNaturalNumbersSquareExponentsLessThan64HighPerformence(List<Double> naturalNumbers) {

        List<Double> exponentsNumbers = new LinkedList<>();

        for (Double number : naturalNumbers) {
            double squareRoot = Math.sqrt(64d);

            if (Math.abs(number) < squareRoot)
                exponentsNumbers.add(Math.pow(number, 2));
        }

        return exponentsNumbers;
    }
}
