
package dao;



import dados.Med;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author 276970
 */
public class Med_DAO {    
    public void inserir(Med medicamento) throws Exception {
        Conexao c = new Conexao();
        String sql = "INSERT INTO medicamento (NOME, QUANTIDADE, VALOR) VALUES (?, ?,?)";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setString(1, medicamento.getNome());
        ps.setInt(2, medicamento.getQuantidade());
        ps.setDouble(3, medicamento.getValor());
        ps.execute();
        c.confirmar();        
    }

    public Med recuperarcodigo() throws Exception {
       Conexao c = new Conexao();
        String sql = "select max(codigo) as 'codigo' from medicamento;";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        Med medicamento = new Med();
        if (rs.next()) { 
           medicamento.setCodigo(rs.getInt("codigo") + 1);           
        } else {   
            medicamento= null;
        }
        return medicamento;
    }    
}