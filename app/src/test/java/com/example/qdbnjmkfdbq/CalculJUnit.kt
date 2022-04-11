package com.example.testetvalisation

import org.hamcrest.CoreMatchers
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Assert
import org.junit.Test

class CalculJUnit {

    var calc = Calculs()

    @Test
    fun calculAdd(){
        assertThat( calc.calculAdd(2, 3), equalTo(5))
        Assert.assertEquals(5, calc.calculAdd(2, 3))//Hamcrest

    }

    @Test
    fun calculSub(){
        assertThat( calc.calculSub(10, 5), equalTo(5))
        Assert.assertEquals(5, calc.calculSub(10, 5))//Hamcrest
    }

    @Test
    fun calculDiv(){
        assertThat( calc.calculDiv(25, 5), equalTo(5))
        Assert.assertEquals(5, calc.calculDiv(25, 5))//Hamcrest
    }

    @Test
    fun calculMul() {
        assertThat( calc.calculMul(5, 5), equalTo(25))
        Assert.assertEquals(25, calc.calculMul(5, 5))//Hamcrest
    }

}