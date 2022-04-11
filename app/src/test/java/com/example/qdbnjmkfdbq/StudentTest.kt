package com.example.testetvalisation

import com.example.qdbnjmkfdbq.Student
import com.example.qdbnjmkfdbq.User
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Assert
import org.junit.Before
import org.junit.Test
class StudentTest {

    private var student : MutableList<Student>? = null
    private var schoolProject : MutableList<Student>? = null

    //private var listSchoolSubject:
    @Before
    fun setup()
    {
        student = mutableListOf()

        schoolProject = mutableListOf()
        //addUser()
    }

    @Test
    fun addStudent(){
        student?.add(Student("Alexis"))
        assertThat( student!!.size, equalTo(1) )
    }
@Test
    fun addSchoolProject(){
        schoolProject?.add(Student("SES"))
        assertThat( schoolProject!!.size, equalTo(1) )
    }
    @Test
    fun deleteStudent(){
        student?.remove(Student("Alexis"))
        //assertThat( users!!.size, equalTo(0) ) //Hamcrest
        Assert.assertEquals(0, student!!.size)  // JUnit
    }

    @Test
    fun deleteSchoolProject(){
        schoolProject?.remove(Student("SES"))
        //assertThat( users!!.size, equalTo(0) ) //Hamcrest
        Assert.assertEquals(0, schoolProject!!.size)  // JUnit
    }

    @Test

    fun updateStudent(){
        assertThat( student!!.size, equalTo(1) )
        val user = student!![0]
        user.name = "Alexis"
        assertThat( student!![0].name, equalTo("Cedric") )

    }
    @Test

    fun updateSchoolProject(){
        assertThat( schoolProject!!.size, equalTo(1) )
        val user = schoolProject!![0]
        user.name = "SES"
        assertThat( schoolProject!![0].name, equalTo("Application ") )

    }

    @Test
    fun listStudent(){
        for (i in student){
            print(i)

        }
    }
    @Test
    fun listSchoolProject(){
        for (i in schoolProject()){
            print(i)

        }
    }
}