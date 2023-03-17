package com.formacaoandroidstudio.estruturaresstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /* É possível acessar diretamente as cores que estão nos arquivos xml (colors.xml)
        * Ou o string também, que seria o  valor do text, no caso, 'CADASTRAR' */

        R.color.botão_cadastrar_azul;
        R.string.botao_cadastro;

        /* Para acessar diretamemte o valor nos arquivos xml é preciso utilizar a anotação @, por exemplo,
        * no arquivo colors.xml fariamos assim:
        *
        * <color name="botão_cadastrar_azul">@color/botão_cadastrar_azul</color>
        *
        *  */
    }

    /**
     * ANOTAÇÃO:
     *
     * Podemos criar referências para ser atribuídas aos mesmos tipos de componentes, por
     * exemplo, digamos que temos vários layouts com um botão e queremos nomear esses botões
     * com o mesmo 'text' e para não nomear um a um, vamos criar uma referência a partir de uma
     * string name que facilitará as modificações a serem feitas nesses vários botões diretamente
     * pela interface.
     *
     * Como criar a referência:
     * A referência é criado no activity_main.xml. Digamos que foi colocado um botão no layout, ao clicar
     * no botão vai na aba de 'attributes' e no atributo 'text' tem um simbolo de um retângulo vertical (Pick resource)
     * onde você irá clicar e lá você vai criar um 'string value' e vai dar um 'name resource' (botão_cadastro) e o
     * 'value resorce' (CADASTRAR) > ok. Essa String vai ser criado em:
     * res > values > strings.xml
     *
     * Se você ir a aba 'attributes' e ir ao atributo 'text' você verá q o valor será uma referência
     * da seguinte maneira: @string/botao_cadastro
     *
     * Para atribuir a referência a outros butões:
     * Para fazer isso basta ir nos botões que estão nos layouts e clicar nele, depois clicar no simbolo
     * retangular vertical e vai na aba de pesquisa e procure pelo 'botão_cadastro', depois basta clicar
     * nele e apertar ok que automaticamente o botão irá fazer referencia a essa string criada, string essa
     * que nomeia o botão 'CADASTRAR'.
     *
     * MAIS LEGAL!!!
     * Caso você queira renomear o 'CADASTRAR' para 'CADASTRE-SE', basta ir ao arquivo strings.xml e
     * modificar o valor para 'CADASTRE-SE'. Dessa maneira facilita a modificação caso seu app tenha
     * inúmeros botões.
     *
     * OBS. É possível fazer o mesmo com os styles e os colors! Que são os estilos e as cores do app.
     * Por exemplo, podemos definir uma cor padrão para o background do botão. Basta criar uma referência
     * para criar uma cor ou um estilo.
     *
     * */
}
