var funcionarios =[];

function buscarTodos(){
	$.get("/funcionarios", function(resposta){
		funcionarios = resposta;
		atualizarTabela();
	});
}

function atualizarTabela(){
	for(i = 0; i < funcionarios.length; i++){
		var linha = $("#tabelaUsuario").append("<tr></tr>");
		linha.append("<td>" + funcionarios[i].id + "</td>");
		linha.append("<td>" + funcionarios[i].nome + "</td>");
		linha.append("<td>" + funcionarios[i].login + "</td>");
		linha.append("<td>" + funcionarios[i].cargo + "</td>");
		linha.append("<td>" + funcionarios[i].celular + "</td>");
	}

}

function salvar(){
	var funcionario = {};
	funcionario.nome = $("#nome").val();
	funcionario.cpf = $("#cpf").val();
	funcionario.rg = $("#rg").val();
	funcionario.telefone = $("#telefone").val();
	funcionario.celular = $("#celular").val();
	funcionario.email = $("#email").val();
	funcionario.orgao_emissor = $("#orgao_emissor").val();
	funcionario.cep = $("#cep").val();
	funcionario.estado = $("#estado").val();
	funcionario.cidade = $("#cidade").val();
	funcionario.bairro = $("#bairro").val();
	funcionario.numero = $("#numero").val();
	funcionario.rua = $("#rua").val();
	funcionario.complemento = $("#complemento").val();
	funcionario.login = $("#login").val();
	funcionario.senha = $("#senha").val();
	funcionario.cargo = $("#cargo").val();
	
	
	$.ajax({
		type: "POST",
		url: "/funcionarios",
		data: JSON.stringify(funcionario),
		contentType: "application/json; charset=utf8",
		dataType: "json",
	}).always(function(resposta){
		if(resposta.status < 399){
			Materialize.toast("Usuário salvo com sucesso", 3000);
		}else{
			Materialize.toast("Erro ao salvar o usuário", 3000);
		}
	});
}

$(document).ready(function() {
	buscarTodos();

});