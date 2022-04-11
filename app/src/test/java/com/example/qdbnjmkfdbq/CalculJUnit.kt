package com.example.testetvalisation

import org.hamcrest.CoreMatchers
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Assert
import org.junit.Test

class CalculJUnit {

    var calc = Calculs()

    @Test
    fun add(){
        assertThat( calc.add(2, 3), equalTo(5))
        Assert.assertEquals(5, calc.add(2, 3))
    }

    @Test
    fun sub(){
        assertThat( calc.sub(10, 5), equalTo(5))
        Assert.assertEquals(5, calc.sub(10, 5))
    }

    @Test
    fun div(){
        assertThat( calc.div(25, 5), equalTo(5))
        Assert.assertEquals(5, calc.div(25, 5))
    }

    @Test
    fun mul() {
        assertThat( calc.mul(5, 5), equalTo(25))
        Assert.assertEquals(25, calc.mul(5, 5))
    }

}