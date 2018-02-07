package ru.lesson.lessons;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateTest {
    @Test
    public void main() throws Exception {
        Testq testq = new Testq();
        Assert.assertEquals(3,testq.send(1,2));
    }

}