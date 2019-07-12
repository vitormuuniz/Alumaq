package entidade;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contrato implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idC;
    private Locacao locacao;
    private Date dataInicio, dataFim;
    private boolean contratoAceito;
    Fase fase;
    private Double multa;
    private Double saldoDevedor;
    private Tipo tipo;
    private Double total;
    private Cliente cliente;
    private Funcionario f;
    private Operacao op;
    //assinatura digital

    public Contrato(Integer id, Locacao locacao) {
        setIdC(id);
        this.setLocacao(locacao);
        fase = Fase.FASE1;

    }

    public Contrato() {
    }

    public Locacao getLocacao() {
        return locacao;
    }

    public void setLocacao(Locacao locacao) {
        this.locacao = locacao;
    }

    public Integer getIdC() {
        return idC;
    }

    public void setIdC(Integer idC) {
        this.idC = idC;
    }

    public Double getSaldoDevedor() {
        return saldoDevedor;
    }

    public void setSaldoDevedor(Double saldoDevedor) {
        this.saldoDevedor = saldoDevedor;
    }

    public Contrato buscaContrato(int id) {
        Contrato contrato = null;

        //busca no banco de dados o contrato com aquele id
        //contrato = query(...)
        return contrato;
    }
}
