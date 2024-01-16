# Estacionamento
Este é um projeto em Java conectado com um banco de dados que diz respeito a um estacionamento, no qual permite que crie, altere, exclua ou liste as informações de cada carro estacionado no local.

## Passo a passo

### 1º passo: criar a tabela no SQL Developer:
<br>drop table carro cascade constraints
<br>create table carro(
<br>&nbsp;placa char(7) not null primary key,
<br>&nbsp;cor varchar(20),
<br>&nbsp;descricao varchar(100)
<br>);

### 2º passo: clonar o código em sua máquina

### 3º passo: colocar suas permissões na classe Conexao

### 4º passo: rodar o programa
