package com.locadora.demo.services;

import com.locadora.demo.entities.Filme;
import com.locadora.demo.entities.Locacao;
import com.locadora.demo.entities.Usuario;
import com.locadora.demo.utils.DataUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

public class LocacaoServiceTest {
    @Test
    public void teste() {
        //cenario

        LocacaoService service = new LocacaoService();
        Usuario usuario = new Usuario("Usuario 1");
        Filme filme = new Filme("Filme 1", 2, 5.0);

        //acao

        Locacao locacao = service.alugarFilme(usuario, filme);

        //verificao
        Assert.assertEquals(5.0, locacao.getValor(), 0.01);
        Assert.assertThat(locacao.getValor(), is(not(6.0)));
        Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()));
        Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)));

    }
}
