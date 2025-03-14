package dio.monitoramento.domain.model;

import jakarta.persistence.*;

@Entity(name = "tb_avaliacao")
public class HistoricoAvaliacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data", nullable = false)
    private String data;

    @Column(name = "nota_esg", nullable = false)
    private int notaEsg;

    @Column(name = "comentario")
    private String comentario;

    @ManyToOne(cascade = CascadeType.ALL)  // Se a avaliação for de uma empresa específica
    @JoinColumn(name = "empresa_id", referencedColumnName = "id", nullable = false)  // Definindo a chave estrangeira
    private Empresa empresa;


    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getNotaEsg() {
        return notaEsg;
    }

    public void setNotaEsg(int notaEsg) {
        this.notaEsg = notaEsg;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
