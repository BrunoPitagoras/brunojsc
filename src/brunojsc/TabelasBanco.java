/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brunojsc;

/**
 *
 * @author Bruno Josue
 */
public class TabelasBanco {
 
}
/*
 * create table Medico (
 * idmedico int auto_increment primary key,
 * Nome varchar(60) not null,
 * Especialidade int not null,
 * CRM int not null,
 * cpf char(12) not null
 *);
      
 *create table Paciente (
 *idpaciente int auto_increment primary key,
 *Nome varchar(60) not null,
 *cpf char(12) not null,
 *idade int not null
 *);

 *create table Consulta (
 *idconsulta  int auto_increment primary key,
 *id_medico int not null,
 *id_paciente int not null,
 *Convenio varchar (100) not null
 *);

ALTER TABLE `brunojsc`.`consulta` 
ADD INDEX `id_medico_idx` (`id_medico` ASC) VISIBLE;
;
ALTER TABLE `brunojsc`.`consulta` 
ADD CONSTRAINT `id_medico`
  FOREIGN KEY (`id_medico`)
  REFERENCES `brunojsc`.`medico` (`idmedico`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;

ALTER TABLE `brunojsc`.`consulta` 
ADD INDEX `id_paciente_idx` (`id_paciente` ASC) VISIBLE;
;
ALTER TABLE `brunojsc`.`consulta` 
ADD CONSTRAINT `id_paciente`
  FOREIGN KEY (`id_paciente`)
  REFERENCES `brunojsc`.`paciente` (`idpaciente`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;

*/