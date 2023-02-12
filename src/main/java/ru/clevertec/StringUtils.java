package ru.clevertec;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {

    public static boolean isPositiveNumber(String str){
        return NumberUtils.isCreatable(str) &&
                NumberUtils.compare((long) NumberUtils.toDouble(str), 0) > 0;
    }
}
