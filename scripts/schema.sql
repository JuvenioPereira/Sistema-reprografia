create table Aluno
 (
   
    nome varchar(50),
    matriculaAluno varchar(50) ,
    confirmarMatricula varchar(50),
    telefone varchar(50) null,
    email varchar(50) null,
primary key (matriculaAluno)
    );

   create table Profesor
   (
  
    nome varchar(50) not null,
    senhaProfessor varchar(50) not null,
    confirmarSenha varchar(50),
    telefone varchar(50) null,
    email varchar(50) null,
    gasto_Semanal varchar(40) null,
    gasto_Mensalmente varchar(40) null,
   primary key (senhaProfessor)
 );

    create table Funcionario
   (
  
   
    nome varchar(50) not null,
    senhaFuncionario varchar(50) not null,
     confirmarSenha varchar(50),
    telefone varchar(50) null,
    email varchar(50) null,
primary key (senhaFuncionario)
    );
create table Tec_Administrativo
   (
   
    nome varchar(50) not null,
    senhaTec_Administrativo varchar(50) not null,
     confirmarSenha varchar(50),
    telefone varchar(50) null,
    email varchar(50) null,
primary key (senhaTec_Administrativo)
    );
 create table Solicitações
   (
   senhaSolicitações varchar(50) not null,
    confirmarSenha varchar(50),
    nome varchar(50) not null,
primary key (senhaSolicitações)
    );
    
    create table Materiais
    (
    codMaterial int not null,
    copias varchar (500) null,
    xerox varchar (500) null,
    folhas varchar (500) null,
    primary key (codMaterial)
);
  create table Mensagens
  (
  senhaSolicitações varchar(50) not null,
  caixaDeEntrada varchar(1000)null,
  
  );
   



