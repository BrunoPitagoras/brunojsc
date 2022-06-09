/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brunojsc;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Bruno Josue
 */
public class PacienteDAO extends Conexao{
    
     public String CadastratarPaciente(Paciente paciente)
    {
        try 
        {       
            String sentenca ;
            
             sentenca = "INSERT INTO paciente values (NULL, '" +
            paciente.getNome()+ "','" + paciente.getCpf()+
            "','" + paciente.getIdade()+ "')";
            
            return this.atualizarBanco(sentenca);
        }
        catch (Exception e)
        {
           return e.getMessage();
        }
    }
    
      public String AtualizarPaciente (Paciente paciente)
    {
        try 
        {
            String sentenca ;
            
            sentenca = "UPDATE paciente set NOME = '" + paciente.getNome() + 
            "',CPF = '" + paciente.getCpf() +
            "',IDADE = '" + paciente.getIdade()+ 
            "' WHERE IDPACIENTE = " +
            paciente.getIdpaciente();      
            return this.atualizarBanco(sentenca);
        }
        catch (Exception e)
        {
           return e.getMessage();
        }
    }
    
      public String ExcluirPaciente (String idPaciente)
    {
        try 
        {
            String sentenca ;
            
            sentenca = "DELETE FROM paciente WHERE IDPACIENTE = " + idPaciente;              
            return this.atualizarBanco(sentenca);
        }
        catch (Exception e)
        {
           return e.getMessage();
        }
    }
      
      
      public ArrayList listarPaciente()
    {
        try    
        {   
            ArrayList pacientes = new ArrayList();
            String sentenca = "SELECT * FROM paciente order by Nome";
            ResultSet rs = this.getResultSet(sentenca);  
            while (rs.next())
                
            {   
                
            Paciente paciente = new Paciente();
            paciente.setIdpaciente(rs.getInt("Idpaciente"));
            paciente.setNome(rs.getString("NOME"));
            paciente.setCpf(rs.getString("CPF"));
            paciente.setIdade(rs.getInt("IDADE"));
            
            
            
            pacientes.add(paciente); 
            
            }               
            return pacientes;
        }
        catch(Exception e)
        {
        
            System.out.println(e.getMessage());
            return null;
        }
    }
    
}
