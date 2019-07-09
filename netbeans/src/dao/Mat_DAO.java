
package dao;


import dados.Mat;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author 276970
 */
public class Mat_DAO {    
    public void inserir(Mat material) throws Exception {
        Conexao c = new Conexao();
        String sql = "INSERT INTO material (NOME, QUANTIDADE, VALOR) VALUES (?, ?,?)";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setString(1, material.getNome());
        ps.setInt(2, material.getQuantidade());
        ps.setDouble(3, material.getValor());
        ps.execute();
        c.confirmar();        
    }

    public Mat recuperarcodigo() throws Exception {
       Conexao c = new Conexao();
        String sql = "select max(codigo) as 'codigo' from material;";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        Mat material = new Mat();
        if (rs.next()) { 
           material.setCodigo(rs.getInt("codigo") + 1);
        } else {   
            material= null;
        }
        return material;
    }    
}