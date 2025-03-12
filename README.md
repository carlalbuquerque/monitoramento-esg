# Monitoramento ESG
api criada para monitorar atividade ESG de empresas.


## Diagrama de classes
```mermaid
classDiagram
    class Empresa {
        +int id
        +String nome
        +String setor
        +String cnpj
        +Localizacao localizacao
        +IndicadoresESG indicadores_esg
        +List<HistoricoAvaliacao> historico_avaliacoes
    }

    class Localizacao {
        +int id
        +String pais
        +String estado
        +String cidade
    }

    class IndicadoresESG {
        +int id
        +Ambiental ambiental
        +Social social
        +Governanca governanca
    }

    class Ambiental {
        +int id
        +Double pegada_de_carbono
        +Double uso_de_energia_renovavel
        +Double consumo_de_agua
        +Double reciclaje_residuos
    }

    class Social {
        +int id
        +Double diversidade_inclusao
        +Double bem_estar_trabalhador
        +Double treinamento_e_educacao
        +Double relacao_com_comunidade
    }

    class Governanca {
        +int id
        +Double conselho_diverso
        +Double politicas_anticorrupcao
        +Double transparencia_relatorios
        +Double conformidade_regulatoria
    }

    class HistoricoAvaliacao {
        +int id
        +String data
        +int nota_esg
        +String comentario
    }

    %% Cardinalidades
    Empresa "1" --> "1" Localizacao : 
    Empresa "0" --> "0" IndicadoresESG : 
    Empresa "1" --> "*" HistoricoAvaliacao : 
    IndicadoresESG "0" --> "*" Ambiental : "componente"
    IndicadoresESG "0" --> "*" Social : "componente"
    IndicadoresESG "0" --> "*" Governanca : "componente"
    HistoricoAvaliacao "*" --> "1" Empresa : 
