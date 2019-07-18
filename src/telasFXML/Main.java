package telasFXML;


import controllers.PagamentoController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import persistencia.DAO;

public class Main extends Application {
    
    private static Stage stage;
    
    private static Scene indexScene;
    private static Scene cadastroClienteScene;
    private static Scene cadastroFuncScene;
    private static Scene cadastroFornecedorScene;
    private static Scene cadastroEquipScene;
    private static Scene loginScene;
    private static Scene contratoScene;
    private static Scene reservaScene;
    private static Scene pagamentoScene;
    
    
    protected static DAO dao = new DAO();      
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        stage = primaryStage;
        
        Parent index = FXMLLoader.load(getClass().getResource("Index.fxml"));
        Parent cadastroCliente = FXMLLoader.load(getClass().getResource("CadastrarCliente.fxml"));
        Parent cadastroEquipamento = FXMLLoader.load(getClass().getResource("CadastrarEquipamento.fxml"));
        Parent cadastroFornecedor = FXMLLoader.load(getClass().getResource("CadastrarFornecedor.fxml"));
        Parent cadastroFuncionario = FXMLLoader.load(getClass().getResource("CadastrarFuncionario.fxml"));
        Parent reserva = FXMLLoader.load(getClass().getResource("ReservaEquipamento.fxml"));
        Parent login = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Parent contrato = FXMLLoader.load(getClass().getResource("Contrato.fxml"));
        Parent pagamentoTela = FXMLLoader.load(getClass().getResource("Pagamento.fxml"));
        
        indexScene = new Scene(index);
        cadastroClienteScene = new Scene(cadastroCliente);
        cadastroFuncScene = new Scene(cadastroFuncionario);
        cadastroEquipScene = new Scene(cadastroEquipamento);
        cadastroFornecedorScene = new Scene(cadastroFornecedor);
        contratoScene = new Scene(contrato);
        reservaScene = new Scene(reserva);
        loginScene = new Scene(login);
        pagamentoScene = new Scene(pagamentoTela);
           
        //PagamentoController c= new PagamentoController(1);
        //stage.setScene(pagamentoScene);
        stage.setScene(loginScene);
        stage.show();
    }
    
     
    public static void changeScreen(String scr){
        switch(scr){
            case("index"):
               stage.setScene(indexScene);
            break;
            case("cadastroCliente"):
                stage.setScene(cadastroClienteScene);
            break;            
            case("reserva"):
                stage.setScene(reservaScene);
            break;
            case("contrato"):
                stage.setScene(contratoScene);
            break;
            case("cadastroFornecedor"):
                stage.setScene(cadastroFornecedorScene);
            break;
            case("cadastroFuncionario"):
                stage.setScene(cadastroFuncScene);
            break;
            case("cadastroEquipamento"):
                stage.setScene(cadastroEquipScene);
            break;
            
        }
            
    }

    
  
    public static void main(String[] args) {        
        launch(args);
    }
    
}
