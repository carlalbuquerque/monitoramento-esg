package dio.monitoramento.domain.model;

import jakarta.persistence.*;

@Entity(name = "tb_indicadoresESG")
public class IndicadoresESG {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ambiental_id")
    private Ambiental ambiental;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "social_id")
    private Social social;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "governaca_id")
    private Governanca governanca;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Ambiental getAmbiental() {
        return ambiental;
    }

    public void setAmbiental(Ambiental ambiental) {
        this.ambiental = ambiental;
    }

    public Social getSocial() {
        return social;
    }

    public void setSocial(Social social) {
        this.social = social;
    }

    public Governanca getGovernanca() {
        return governanca;
    }

    public void setGovernanca(Governanca governanca) {
        this.governanca = governanca;
    }
}

