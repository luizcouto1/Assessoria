var perfils = [];

function salvar() {
	var perfil = {};
	perfil.descricao = $("#descricao").val();

	$.ajax({
		url : '/perfils',
		type : 'POST',
		data : JSON.stringify(perfil),
		contentType : "application/json; charset=utf8",
		dataType : "json"
	}).always(function(resposta) {
		if (resposta.status < 399) {
			Materialize.toast("Perfil salvo com sucesso!", 3000, 'green rounded');
			$("#descricao").val("");
			buscarTodos();
		} else {
			Materialize.toast("Erro ao Salvar!", 3000, 'red rounded');
		}
	});
}

function buscarTodos() {
	$.get("/perfils", function(resposta){
		perfils = resposta;
		atualizarTabela();
	});
}

function atualizarTabela() {
	for (i = 0; i < perfils.length; i++){
		var linha = $("#tabelaPerfil").append("<tr></tr>");
		linha.append("<td>" + perfils[i].descricao + "</td>");
	}
}

$(document).ready(function(){
	buscarTodos();
});

