#Author: janeleaodasilva@hotmail.com

@Cadastrar
Feature: Validar cadastro com e-mail
 Como usuaria
 Quero realizar cadastro 
 Para me matricular em um curso

 @tag1
 Scenario: realizar cadastro com e-mail
   Given que esteja no formulario de cadastro
   When  preenha dados validos
   And clicar em cadastrar-se
   Then valido cadastro com sucesso
  

