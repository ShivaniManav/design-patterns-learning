package org.designpatterns.creational.builder;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class House {

    private int windows;

    private int doors;

    private int rooms;

    private boolean hasSwimPool;

    private boolean hasGarage;

    private boolean hasGarden;

}
