package dio.monitoramento.domain.model;


import jakarta.persistence.*;

import java.util.List;

@Entity (name = "tb_empresa")
public class Empresa {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    private String setor;

    @Column(name = "cnpj", nullable = false)
    private String cnpj;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "localizacao_id")
    private Localizacao localizacao;

    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "indicadoresESG_id")
    private IndicadoresESG indicadoresEsg;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY , mappedBy = "empresa")// EAGER- acesso rapido  - lazy  deixa a aplicação mais eficiente
    private List<HistoricoAvaliacao> historicoAvaliacoes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }

    public IndicadoresESG getIndicadoresEsg() {
        return indicadoresEsg;
    }

    public void setIndicadoresEsg(IndicadoresESG indicadoresEsg) {
        this.indicadoresEsg = indicadoresEsg;
    }

    public List<HistoricoAvaliacao> getHistoricoAvaliacoes() {
        return historicoAvaliacoes;
    }

    public void setHistoricoAvaliacoes(List<HistoricoAvaliacao> historicoAvaliacoes) {
        this.historicoAvaliacoes = historicoAvaliacoes;
    }
}

