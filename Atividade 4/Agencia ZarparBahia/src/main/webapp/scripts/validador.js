function validar() {
	let nome = frmCliente.nome.value
	let celular = frmCliente.celular.value
	
	if (nome === "") {
		alert('O nome do cliente não pode ser vazio')
		frmCliente.nome.focus()
		return false
	} else if (celular==="") {
		alert('O telefone do cliente não pode ser vazio')
		frmCliente.fone.focus()
		return false
	} else {
		document.forms["frmCliente"].submit()
	}
} 
 