#language: pt
  Funcionalidade: Google Pesquisa

    Cenario: Busca com sucesso
      Dado que o usuario esta na pagina de pesquisa
      Quando o usuario preenche a pesquisa com "Prof Mick"
      E o usuario clica no botao PESQUISAR
      Entao o sistema redireciona para a pagina de resultado
      E o sistema mostra um numero de pesquisa
      E o sistema mostra uma lista de links