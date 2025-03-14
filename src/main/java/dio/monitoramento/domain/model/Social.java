package dio.monitoramento.domain.model;
import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity(name = "tb_social")
public class Social {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "diversidade_inclusao", nullable = false , precision = 5, scale = 2)
    private BigDecimal diversidadeInclusao;

    @Column(name = "engajamento_comunidade", nullable = false, precision = 5, scale = 2)
    private BigDecimal engajamentoComunidade;

    @Column(name = "satisfacao_funcionarios", nullable = false, precision = 5, scale = 2)
    private BigDecimal satisfacaoFuncionarios;

    @Column(name = "direitos_trabalhistas", nullable = false , precision = 5, scale = 2)
    private BigDecimal direitosTrabalhistas;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "indicadores_esg_id") // A chave estrangeira
    private IndicadoresESG indicadoresESG;

    // Getters e Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BigDecimal getDiversidadeInclusao() {
        return diversidadeInclusao;
    }

    public void setDiversidadeInclusao(BigDecimal diversidadeInclusao) {
        this.diversidadeInclusao = diversidadeInclusao;
    }

    public BigDecimal getEngajamentoComunidade() {
        return engajamentoComunidade;
    }

    public void setEngajamentoComunidade(BigDecimal engajamentoComunidade) {
        this.engajamentoComunidade = engajamentoComunidade;
    }

    public BigDecimal getSatisfacaoFuncionarios() {
        return satisfacaoFuncionarios;
    }

    public void setSatisfacaoFuncionarios(BigDecimal satisfacaoFuncionarios) {
        this.satisfacaoFuncionarios = satisfacaoFuncionarios;
    }

    public BigDecimal isDireitosTrabalhistas() {
        return direitosTrabalhistas;
    }

    public void setDireitosTrabalhistas(BigDecimal direitosTrabalhistas) {
        this.direitosTrabalhistas = direitosTrabalhistas;
    }
    public IndicadoresESG getIndicadoresESG() {
        return indicadoresESG;
    }

    public void setIndicadoresESG(IndicadoresESG indicadoresESG) {
        this.indicadoresESG = indicadoresESG;
    }
}
