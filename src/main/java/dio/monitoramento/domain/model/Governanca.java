package dio.monitoramento.domain.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity(name = "tb_governanca")
public class Governanca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false , precision = 5, scale = 2)
    private BigDecimal conselhoDiverso;

    @Column(nullable = false, precision = 5, scale = 2)
    private BigDecimal politicasAnticorrupcao;

    @Column(nullable = false, precision = 5, scale = 2)
    private BigDecimal transparenciaRelatorios;

    @Column(nullable = false, precision = 5, scale = 2)
    private BigDecimal conformidadeRegulatoria;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "indicadores_esg_id")  // A chave estrangeira
    private IndicadoresESG indicadoresESG;



    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
    public IndicadoresESG getIndicadoresESG() {
        return indicadoresESG;
    }

    public void setIndicadoresESG(IndicadoresESG indicadoresESG) {
        this.indicadoresESG = indicadoresESG;
    }
}
