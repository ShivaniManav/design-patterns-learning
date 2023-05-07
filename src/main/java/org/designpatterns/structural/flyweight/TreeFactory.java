package org.designpatterns.structural.flyweight;

import java.util.*;

public class TreeFactory {

    private static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, String color, String texture) {
        TreeType treeType = treeTypes.get(getKey(name,color,texture));
        if(Objects.isNull(treeType)) {
            treeType = new TreeType(name, color, texture);
            treeTypes.put(getKey(name, color, texture), treeType);
        }
        return treeType;
    }

    private static String getKey(String name, String color, String texture) {
        return String.format("%s_%s_%s", name, color, texture);
    }
}
