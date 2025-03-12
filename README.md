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
        +String pegada_de_carbono
        +String uso_de_energia_renovavel
        +String consumo_de_agua
        +String reciclaje_residuos
    }

    class Social {
        +int id
        +String diversidade_inclusao
        +String bem_estar_trabalhador
        +String treinamento_e_educacao
        +String relacao_com_comunidade
    }

    class Governanca {
        +int id
        +String conselho_diverso
        +String politicas_anticorrupcao
        +String transparencia_relatorios
        +String conformidade_regulatoria
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
