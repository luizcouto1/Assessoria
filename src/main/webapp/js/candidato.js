var candidatos = [];

function buscarTodos(){
	$.get("/candidatos", function(resposta){
		candidatos = resposta;
		atualizarTabela();
	});
}

function atualizarTabela(){
	for(i = 0; i < candidatos.length; i++){
		var linha = $("#tabelaCandidatos").append("<tr></tr>");
		linha.append("<td>" + candidatos[i].id + "</td>");
		linha.append("<td>" + candidatos[i].nome + "</td>");
		linha.append("<td>" + candidatos[i].partido + "</td>");
	}

}

function salvar(){
	var candidato = {};
	candidato.partido = $("#partido").val();
	candidato.nome = $("#nome").val();
	candidato.cargoPolitico = $("#cargoPolitico").val();
	candidato.email = $("#email").val();
	candidato.celular = $("#celular").val();
	candidato.telefone = $("#telefone").val();
	candidato.cep = $("#cep").val();
	candidato.cidade = $("#cidade").val();
	candidato.estado = $("#estado").val();
	candidato.bairro = $("#bairro").val();
	candidato.rua = $("#rua").val();
	candidato.numero = $("#numero").val();
	candidato.complemento = $("#complemento").val();
	
	
	
	$.ajax({
		type: "POST",
		url: "/candidatos",
		data: JSON.stringify(candidato),
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
