package dio.monitoramento.domain.model;
import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity(name = "tb_social")
public class Social {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "diversidade_inclusao", nullable = false)
    private BigDecimal diversidadeInclusao;

    @Column(name = "engajamento_comunidade", nullable = false)
    private BigDecimal engajamentoComunidade;

    @Column(name = "satisfacao_funcionarios", nullable = false)
    private BigDecimal satisfacaoFuncionarios;

    @Column(name = "direitos_trabalhistas", nullable = false)
    private boolean direitosTrabalhistas;

    @OneToOne(cascade = CascadeType.ALL)
    private IndicadoresESG indicadoresESG;


    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public boolean isDireitosTrabalhistas() {
        return direitosTrabalhistas;
    }

    public void setDireitosTrabalhistas(boolean direitosTrabalhistas) {
        this.direitosTrabalhistas = direitosTrabalhistas;
    }
    public IndicadoresESG getIndicadoresESG() {
        return indicadoresESG;
    }

    public void setIndicadoresESG(IndicadoresESG indicadoresESG) {
        this.indicadoresESG = indicadoresESG;
    }
}
