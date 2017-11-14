var cliente =[];

function buscarTodos(){
	$.get("/clientes", function(resposta){
		clientes = resposta;
		atualizarTabela();
		atualizarRein();
	});
}

function atualizarTabela(){
	for(i = 0; i < clientes.length; i++){
		var linha = $("#tabelaCliente").append("<tr></tr>");
		linha.append("<td>" + clientes[i].id + "</td>");
		linha.append("<td>" + clientes[i].nome + "</td>");
		linha.append("<td>" + clientes[i].telefone + "</td>");
		linha.append("<td>" + clientes[i].celular + "</td>");
		linha.append("<td>" + clientes[i].rua + "	" +clientes[i].bairro + "</td>");
	}
}
function atualizarRein(){
	for(i=0; i< clientes.length; i++){
		var linha = $("#tabelaReinvindi").append("<tr></tr>");
	linha.append("<td>" + clientes[i].id + "</td>");
	linha.append("<td>" + clientes[i].nome + "</td>");
	linha.append("<td>" + clientes[i].bairro + "</td>");
	linha.append("<td>" + clientes[i].rua + "</td>");
	linha.append("<td>" + clientes[i].reinvendicacao + "</td>");
}
}
function salvar(){
	var cliente = {};
	cliente.nome = $("#nome").val();
	cliente.data_nascimento = $("#data_nascimento").val();
	cliente.cpf = $("#cpf").val();
	cliente.rg = $("#rg").val();
	cliente.orgao_emissor = $("#orgao_emissor").val();
	cliente.email = $("#email").val();
	cliente.celular = $("#celular").val();
	cliente.telefone = $("#telefone").val();
	cliente.quantidade_residencia = $("#quantidade_residencia").val();
	cliente.maioresde16 = $("#maioresde16").val();
	cliente.menoresde16 = $("#menoresde16").val();
	cliente.cep = $("#cep").val();
	cliente.estado = $("#estado").val();
	cliente.cidade = $("#cidade").val();
	cliente.bairro = $("#bairro").val();
	cliente.rua = $("#rua").val();
	cliente.numero = $("#numero").val();
	cliente.complemento = $("#complemento").val();
	cliente.reinvendicacao = $("#reinvendicacao").val();
	
	$.ajax({
		type: "POST",
		url: "/clientes",
		data: JSON.stringify(cliente),
		contentType: "application/json; charset=utf8",
		dataType: "json",
	}).always(function(resposta){
		if(resposta.status < 399){
			Materialize.toast("Usuário salvo com sucesso", 4000);
		}else{
			Materialize.toast("Erro ao salvar o usuário", 4000);
		}
	});
}

$(document).ready(function() {
	buscarTodos();
});
