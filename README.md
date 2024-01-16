# Estacionamento

1º passo: criar a tabela no SQL Developer:
<br>drop table carro cascade constraints
<br>create table carro(
<br>&nbsp;placa char(7) not null primary key,
<br>&nbsp;cor varchar(20),
<br>&nbsp;descricao varchar(100)
<br>);
