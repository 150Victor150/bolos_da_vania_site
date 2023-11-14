function cap_nome(){
var nome = document.getElementById("nome").value;
return nome;
};

function cap_email(){
var email = document.getElementById("email").value;
return email;
};

function cap_telefone(){
var telefone = document.getElementById("telefone").value;
return telefone;
};


function cap_mensg(){
var mensagem = document.getElementById("mensagem").value;
return mensagem;
};

function escrever(){
  event.preventDefault();
  var n = cap_nome();
  var e = cap_email();
  var t = cap_telefone();
  var m = cap_mensg();

  console.log(n);
  console.log(e);
  console.log(t);
  console.log(m);
}