/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.piedrapapeltijera;

/**
 *
 * @author Roy Fiorilo
 */
public class Rock implements Move {
    @Override
    public String getName() {
        return "Rock";
    }

    @Override
    public Move vs(Move other) {
        return other.losesTo(this);
    }

    @Override
    public Move losesTo(Move other) {
        return other.winsAgainst(this);
    }

    @Override
    public Move winsAgainst(Move other) {
        return other instanceof Scissors ? this : other;
    }
}

