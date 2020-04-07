package com.oocl;

import org.junit.Assert;
import org.junit.Test;

public class KlassTest {

    @Test
    public void testNumOfClassLeader_givenStudentInThatClass_ForQ6(){
        Student studentA = new Student("A", 18);
        Klass klass2 = new Klass(2);
        studentA.setKlassForStudent(klass2);

        klass2.setKlassLeader(studentA);

        Assert.assertEquals("A", klass2.getKlassLeader().getName());
    }

}
