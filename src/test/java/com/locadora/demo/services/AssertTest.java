package com.locadora.demo.services;

import com.locadora.demo.entities.Usuario;
import org.junit.Assert;
import org.junit.Test;

public class AssertTest {

    @Test
    public void test(){
        Assert.assertTrue(true); //boolean
        Assert.assertFalse(false);

        Assert.assertEquals("Erro de comparação","amor", "amor");
        Assert.assertNotEquals("bola", "chuteira");
        Assert.assertEquals(0.6123, 0.612, 0.01);
        Assert.assertEquals(Math.PI, 3.14, 0.01);


        Assert.assertTrue("bola".equalsIgnoreCase("BOLA"));
        Assert.assertTrue("bola".startsWith("bo"));

        Usuario u1 = new Usuario("Clara");
        Usuario u2 = new Usuario("Clara");
        Usuario u3 = null;

        Assert.assertEquals(u1, u2);
        Assert.assertSame(u2, u2);
        Assert.assertNotSame(u1, u2);

        Assert.assertNull(u3);
        Assert.assertNotNull(u2);
    }
}
