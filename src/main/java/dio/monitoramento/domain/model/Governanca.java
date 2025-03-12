package dio.monitoramento.domain.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity(name = "tb_governanca")
public class Governanca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private BigDecimal conselhoDiverso;

    @Column(nullable = false)
    private BigDecimal politicasAnticorrupcao;

    @Column(nullable = false)
    private BigDecimal transparenciaRelatorios;

    @Column(nullable = false)
    private BigDecimal conformidadeRegulatoria;

    // Construtor padrão
    public Governanca() {}

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getConselhoDiverso() {
        return conselhoDiverso;
    }

    public void setConselhoDiverso(BigDecimal conselhoDiverso) {
        this.conselhoDiverso = conselhoDiverso;
    }

    public BigDecimal getPoliticasAnticorrupcao() {
        return politicasAnticorrupcao;
    }

    public void setPoliticasAnticorrupcao(BigDecimal politicasAnticorrupcao) {
        this.politicasAnticorrupcao = politicasAnticorrupcao;
    }

    public BigDecimal getTransparenciaRelatorios() {
        return transparenciaRelatorios;
    }

    public void setTransparenciaRelatorios(BigDecimal transparenciaRelatorios) {
        this.transparenciaRelatorios = transparenciaRelatorios;
    }

    public BigDecimal getConformidadeRegulatoria() {
        return conformidadeRegulatoria;
    }

    public void setConformidadeRegulatoria(BigDecimal conformidadeRegulatoria) {
        this.conformidadeRegulatoria = conformidadeRegulatoria;
    }
}
