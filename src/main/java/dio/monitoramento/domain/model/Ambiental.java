
package dio.monitoramento.domain.model;
import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity(name = "tb_ambiental")
public class Ambiental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "pegada_de_carbono", nullable = false, precision = 5, scale = 2)
    private BigDecimal pegadaDeCarbono;

    @Column(name = "uso_de_energia_renovavel", nullable = false, precision = 5, scale = 2)
    private BigDecimal usoDeEnergiaRenovavel;

    @Column(name = "consumo_de_agua", nullable = false, precision = 5, scale = 2)
    private BigDecimal consumoDeAgua;

    @Column(name = "reciclagem_residuos", nullable = false, precision = 5, scale = 2)
    private BigDecimal reciclagemResiduos;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "indicadores_esg_id") // Chave estrangeira que se relaciona com a classe IndicadoresESG
    private IndicadoresESG indicadoresESG;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getPegadaDeCarbono() {
        return pegadaDeCarbono;
    }

    public void setPegadaDeCarbono(BigDecimal pegadaDeCarbono) {
        this.pegadaDeCarbono = pegadaDeCarbono;
    }

    public BigDecimal getUsoDeEnergiaRenovavel() {
        return usoDeEnergiaRenovavel;
    }

    public void setUsoDeEnergiaRenovavel(BigDecimal usoDeEnergiaRenovavel) {
        this.usoDeEnergiaRenovavel = usoDeEnergiaRenovavel;
    }

    public BigDecimal getConsumoDeAgua() {
        return consumoDeAgua;
    }

    public void setConsumoDeAgua(BigDecimal consumoDeAgua) {
        this.consumoDeAgua = consumoDeAgua;
    }

    public BigDecimal getReciclagemResiduos() {
        return reciclagemResiduos;
    }

    public void setReciclagemResiduos(BigDecimal reciclagemResiduos) {
        this.reciclagemResiduos = reciclagemResiduos;
    }
    public void setIndicadoresESG(IndicadoresESG indicadoresESG) {
        this.indicadoresESG = indicadoresESG;
    }

    public IndicadoresESG getIndicadoresESG() {
        return indicadoresESG;
    }
}
