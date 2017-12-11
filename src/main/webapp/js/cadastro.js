var clientes = [];
var contatos = [];
var enderecos = [];
var reinvidicacao = [];

function buscarTodos() {
	$.get("/clientes", function(resposta){
		clientes = resposta;
		atualizarTabela();
	});
}

function atualizarTabela() {
	for (i = 0; i < usuarios.length; i++){
		var linha = $("#tabelaClientes").append("<tr></tr>");
		linha.append("<td>" + clientes[i].nome + "</td>");
		linha.append("<td>" + clientes[i].datanascimento + "</td>");
		linha.append("<td>" + clientes[i].cpf + "</td>");
		
		linha.append('<td><button class="btn green" onclick="editar()">Editar</button><button class="btn red" onclick="remover()">Remover</button></td>');
	}
}

function salvarCliente(){
	var cliente = {};
	cliente.nome = $("#nome").val();
	cliente.datanascimento = $("#datanascimento").val();
	cliente.cpf = $("#cpf").val();
	cliente.rg = $("#rg").val();
	cliente.orgaoemissor = $("#orgaoemissor").val();
	cliente.qtdreside = $("#qtd_reside").val();
	cliente.maiores16 = $("#maiores_16").val();
	cliente.menores16 = $("#menores_16").val();
	cliente.email = contatos[$("#email")[0].value];
	cliente.celular = contatos[$("#celular")[0].value];
	cliente.telefone = contatos[$("#telefone")[0].value];
	cliente.cep = enderecos[$("#cep")[0].value];
	cliente.estado = enderecos[$("#estado")[0].value];
	cliente.cidade = enderecos[$("#cidade")[0].value];
	cliente.bairro = enderecos[$("#bairro")[0].value];
	cliente.rua = enderecos[$("#rua")[0].value];
	cliente.numero = enderecos[$("#numero")[0].value];
	cliente.complemento = enderecos[$("#complemento")[0].value];
	cliente.reinvidicacao = reinvidicacoes[$("#reinvidicacao")[0].value];

	$.ajax({
		type: "POST",
		url: "/clientes",
		data: JSON.stringify(cliente),
		contentType: "application/json; charset=utf8",
		dataType: "json",
	}).always(function(resposta){
		if(resposta.status < 399){
			Materialize.toast("Cliente salvo com sucesso!", 3000, 'green rounded');
			 
			$("#nome").val("");
			 $("#datanascimento").val("");
			 $("#cpf").val("");
			 $("#rg").val("");
			 $("#orgaoemissor").val("");
			 $("#qtd_reside").val("");
			 $("#maiores_16").val("");
			 $("#menores_16").val("");
			 $("#email").val("");
			 $("#celular").val("");
			 $("#telefone").val("");
			 $("#cep").val("");
			 $("#estado").val("");
			 $("#cidade").val("");
			 $("#bairro").val("");
			 $("#rua").val("");
			 $("#numero").val("");
			 $("#complemento").val("");
			 $("#reinvidicacao").val("");
			 
		}else{
			Materialize.toast("Erro ao salvar o Cliente!", 3000, 'red rounded');
		}
	});
}

$(document).ready(function(){
	buscarTodos();
	$('select').material_select();
});