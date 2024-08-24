/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.piedrapapeltijera;

/**
 *
 * @author Roy Fiorilo
 */
public interface Move {
    String getName();
    Move vs(Move other);
    Move losesTo(Move other);
    Move winsAgainst(Move other);
}
