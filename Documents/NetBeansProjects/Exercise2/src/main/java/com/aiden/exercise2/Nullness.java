/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aiden.exercise2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 211121614
 */
public class Nullness {
        
    String add(String str) throws NullPointerException
    {
        if (str == null) {
            throw new NullPointerException();
        }
        return str;
    }
}
