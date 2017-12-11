var usuarios = [];
var perfils = [];

function buscarTodos() {
	$.get("/usuarios", function(resposta){
		usuarios = resposta;
		atualizarTabela();
	});
}

function atualizarTabela() {
	for (i = 0; i < usuarios.length; i++){
		var linha = $("#tabelaUsuario").append("<tr></tr>");
		linha.append("<td>" + usuarios[i].nome + "</td>");
		linha.append("<td>" + usuarios[i].login + "</td>");
		linha.append("<td>" + usuarios[i].perfil.descricao + "</td>");
		
		linha.append('<td><button class="btn green" onclick="editar()">Editar</button><button class="btn red" onclick="remover()">Remover</button></td>');
	}
}

function remover(){
	window.confirm("tem certeza que deseja remover este usuario?");
}

function editar(){
	window.alert("Editar usuario");
}

function atualizarSelect(){
	for(i = 0; i < perfils.length; i++){
		var opcao = $("#perfilSelect").append("<option value = " + i + ">" + perfils[i].descricao + "</option>");
		opcao.attr("value", i);
	}
	$('select').material_select();
}

function buscarPerfils() {
	$.get("/perfils", function(resposta){
		perfils = resposta;
		atualizarSelect();
	})
}

function salvar(){
	var usuario = {};
	usuario.nome = $("#nome").val();
	usuario.login = $("#login").val();
	usuario.senha = $("#senha").val();
	usuario.perfil = perfils[$("#perfilSelect")[0].value]; 

	$.ajax({
		type: "POST",
		url: "/usuarios",
		data: JSON.stringify(usuario),
		contentType: "application/json; charset=utf8",
		dataType: "json",
	}).always(function(resposta){
		if(resposta.status < 399){
			Materialize.toast("Usuario salvo com sucesso!", 4000, 'green rounded');
			 $("#nome").val("");
			 $("#login").val("");
			 $("#senha").val("");
			 var linha = $("#tabelaUsuario").append("<tr></tr>");
				linha.append("<td>" + usuario.nome + "</td>");
				linha.append("<td>" + usuario.login + "</td>");
				linha.append("<td>" + usuario.perfil.descricao + "</td>");
				
		}else{
			Materialize.toast("Erro ao salvar o usuario!", 4000, 'red rounded');
		}
	});
}

$(document).ready(function(){
	buscarTodos();
	buscarPerfils();
	$('select').material_select();
});
