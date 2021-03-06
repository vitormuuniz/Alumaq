package entidade;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pagamento {

    private ContratoOperacao contrato;
    private Double valor;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Date dataDevolucao;
    
    public Pagamento(){
        
    }

    public Pagamento(ContratoOperacao contrato, String dataDevolucao) throws ParseException {
        if (contrato instanceof Locacao) {
            this.contrato = new Locacao();
            this.contrato = contrato;
        } else {
            this.contrato = new Venda();
            this.contrato = contrato;
        }
        this.dataDevolucao = sdf.parse(dataDevolucao);
    }

    public void realizarPagamento() {

        if (contrato instanceof Locacao) {
            if (contrato.getFase() == Fase.FASE1) {
//            contrato.setSaldoDevedor(contrato.getSaldoDevedor() - valor);
                contrato.setFase(Fase.FASE2);
            } else {
                if (contrato.getFase() == Fase.FASE2) {
//                contrato.setSaldoDevedor(contrato.getSaldoDevedor() - valor);
                    Devolucao d = new Devolucao();
                    d.devolverLocacao((Locacao) contrato, dataDevolucao);
                }
            }
        }else{
            
        }
    }
}
