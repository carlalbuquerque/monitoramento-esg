
package dio.monitoramento.domain.model;
import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity(name = "tb_ambiental")
public class Ambiental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "pegada_de_carbono", nullable = false)
    private BigDecimal pegadaDeCarbono;

    @Column(name = "uso_de_energia_renovavel", nullable = false)
    private BigDecimal usoDeEnergiaRenovavel;

    @Column(name = "consumo_de_agua", nullable = false)
    private BigDecimal consumoDeAgua;

    @Column(name = "reciclaje_residuos", nullable = false)
    private BigDecimal reciclajeResiduos;

    @OneToOne(cascade = CascadeType.ALL) // Relação bidirecional com IndicadoresESG
    private IndicadoresESG indicadoresESG;




    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public BigDecimal getReciclajeResiduos() {
        return reciclajeResiduos;
    }

    public void setReciclajeResiduos(BigDecimal reciclajeResiduos) {
        this.reciclajeResiduos = reciclajeResiduos;
    }
    public IndicadoresESG getIndicadoresESG() {
        return indicadoresESG;
    }

    public void setIndicadoresESG(IndicadoresESG indicadoresESG) {
        this.indicadoresESG = indicadoresESG;
    }
}
