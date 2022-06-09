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
public class MedicoDAO extends Conexao {
    
    public String CadastratarMedico(Medico medico)
    {
        try 
        {       
            String sentenca ;
            
            sentenca = "INSERT INTO medico values (NULL, '" +
            medico.getNome() + "','" + medico.getEspecialidade() +
            "','" + medico.getCrm() +
            "','" + medico.getCpf() + "')";
            
            return this.atualizarBanco(sentenca);
        }
        catch (Exception e)
        {
           return e.getMessage();
        }
    }
    
      public String AtualizarMedico (Medico medico)
    {
        try 
        {
            String sentenca ;
            
            sentenca = "UPDATE medico set NOME = '" + medico.getNome() + 
            "',CPF = '" + medico.getCpf() +
            "',ESPECIALIDADE = '" + medico.getEspecialidade() + 
            "',CRM = '" + medico.getCrm() + "' WHERE IDMEDICO = " +
            medico.getIdmedico();      
            return this.atualizarBanco(sentenca);
        }
        catch (Exception e)
        {
           return e.getMessage();
        }
    }
    
      public String ExcluirMedico (String idMedico)
    {
        try 
        {
            String sentenca ;
            
            sentenca = "DELETE FROM medico WHERE IDMEDICO = " + idMedico;              
            return this.atualizarBanco(sentenca);
        }
        catch (Exception e)
        {
           return e.getMessage();
        }
    }
      
      
      public ArrayList listarMedico()
    {
        try    
        {   
            ArrayList medicos = new ArrayList();
            String sentenca = "SELECT * FROM medico order by Nome";
            ResultSet rs = this.getResultSet(sentenca);  
            while (rs.next())
                
            {   
                
            Medico medico = new Medico();
            medico.setIdmedico(rs.getInt("Idmedico"));
            medico.setNome(rs.getString("NOME"));
            medico.setEspecialidade(rs.getInt("ESPECIALIDADE"));
            medico.setCrm(rs.getInt("CRM"));
            medico.setCpf(rs.getString("CPF"));
            
            
            
            medicos.add(medico); 
            
            }               
            return medicos;
        }
        catch(Exception e)
        {
        
            System.out.println(e.getMessage());
            return null;
        }
    }
      
      
      
    
}

