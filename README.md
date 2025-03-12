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
        +String pais
        +String estado
        +String cidade
    }

    class IndicadoresESG {
        +Ambiental ambiental
        +Social social
        +Governanca governanca
    }

    class Ambiental {
        +String pegada_de_carbono
        +String uso_de_energia_renovavel
        +String consumo_de_agua
        +String reciclaje_residuos
    }

    class Social {
        +String diversidade_inclusao
        +String bem_estar_trabalhador
        +String treinamento_e_educacao
        +String relacao_com_comunidade
    }

    class Governanca {
        +String conselho_diverso
        +String politicas_anticorrupcao
        +String transparencia_relatorios
        +String conformidade_regulatoria
    }

    class HistoricoAvaliacao {
        +String data
        +int nota_esg
        +String comentario
    }

    %% Cardinalidades
    Empresa "1" --> "1" Localizacao : 
    Empresa "1" --> "0" IndicadoresESG : 
    Empresa "1" --> "*" HistoricoAvaliacao : 
    IndicadoresESG "1" --> "*" Ambiental : "componente"
    IndicadoresESG "1" --> "*" Social : "componente"
    IndicadoresESG "1" --> "*" Governanca : "componente"
    HistoricoAvaliacao "*" --> "1" Empresa : 
