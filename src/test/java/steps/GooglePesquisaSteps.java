package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class GooglePesquisaSteps {
    @Dado("que o usuario esta na pagina de pesquisa")
    public void que_o_usuario_esta_na_pagina_de_pesquisa() {
    }

    @Quando("o usuario preenche a pesquisa com {string}")
    public void o_usuario_preenche_a_pesquisa_com(String string) {
    }

    @Quando("o usuario clica no botao PESQUISAR")
    public void o_usuario_clica_no_botao_pesquisar() {
    }

    @Entao("o sistema redireciona para a pagina de resultado")
    public void o_sistema_redireciona_para_a_pagina_de_resultado() {
    }

    @Entao("o sistema mostra um numero de pesquisa")
    public void o_sistema_mostra_um_numero_de_pesquisa() {
    }

    @Entao("o sistema mostra uma lista de links")
    public void o_sistema_mostra_uma_lista_de_links() {
    }
}
