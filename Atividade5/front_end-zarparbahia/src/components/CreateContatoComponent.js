// Criar a pagina para adicionar e alterar um funcionario
import React, { Component } from 'react'
import ContatoService from '../services/ContatoService';
class CreateContatoComponent extends Component {
    constructor(props) {
        super(props)
        this.state = {
            idcadastro: this.props.match.params.idcadastro,
            nome: '',
            nascimento: '',
            cpf: '',
            cep: '',
            celular: '',
            email: '',
            senha: ''
        }
        this.changeNomeHandler = this.changeNomeHandler.bind(this);
        this.changeNascimentoHandler = this.changeNascimentoHandler.bind(this);
        this.changeCpfHandler = this.changeCpfHandler.bind(this);
        this.changeCepHandler = this.changeCepHandler.bind(this);
        this.changeCelularHandler = this.changeCelularHandler.bind(this);
        this.saveOrUpdateContato = this.saveOrUpdateContato.bind(this);
        this.changeEmailHandler = this.changeEmailHandler.bind(this);
        this.changeSenhaHandler = this.changeSenhaHandler.bind(this);
    }
    componentDidMount() {
        if (this.state.idcadastro === '_add') {
            return
        } else {
            ContatoService.getContatoById(this.state.idcadastro).then((res) => {
                let contato = res.data;
                this.setState({
                    nome: contato.nome,
                    nascimento: contato.nascimento, cpf: contato.cpf, cep: contato.Cep, celular: contato.celular,
                    email: contato.email, senha: contato.senha
                });
            });
        }
    }
    saveOrUpdateContato = (cont) => {
        cont.preventDefault();
        let contato = { nome: this.state.nome, nascimento: this.state.nascimento, cpf: this.state.cpf, cep: this.state.cep, celular: this.state.celular, email: this.state.email, senha: this.state.senha };
        console.log('contato => ' + JSON.stringify(contato));
        if (this.state.idcadastro === '_add') {
            ContatoService.createContato(contato).then(res => {
                this.props.history.push('/Login');
            });
        } else {
            ContatoService.updateContato(contato, this.state.idcadastro).then(res => {
                this.props.history.push('/contatos');
            });
        }
    }
    changeNomeHandler = (event) => {
        this.setState({ nome: event.target.value });
    }
    changeNascimentoHandler = (event) => {
        this.setState({ nascimento: event.target.value });
    }
    changeCpfHandler = (event) => {
        this.setState({ cpf: event.target.value });
    }

    changeCepHandler = (event) => {
        this.setState({ cep: event.target.value });
    }
    changeCelularHandler = (event) => {
        this.setState({ celular: event.target.value });
    }
    changeEmailHandler = (event) => {
        this.setState({ email: event.target.value });
    }
    changeSenhaHandler = (event) => {
        this.setState({ senha: event.target.value });
    }
    cancel() {
        this.props.history.push('/');
    }
    getTitle() {
        if (this.state.idcadastro === '_add') {
            return <h3 className="text-center">Cadastro</h3>
        } else {
            return <h3 className="text-center">Alterar Dados Contato</h3>
        }
    }
    render() {
        return (

            <div>
                <br></br>
                <div className="container">
                    <div className="row">
                        <div className="card col-md-6 offset-md-3 offset-md-3">
                            {
                                this.getTitle()
                            }
                            <div className="card-body">
                                <form>
                                    <div className="form-group">
                                        <label> Nome: </label>
                                        <input placeholder=" Nome" name="nome" className="form-control"
                                            value={this.state.nome} onChange={this.changeNomeHandler} />
                                    </div>
                                    <div className="form-group">
                                        <label> Nascimento: </label>
                                        <input placeholder="nascimento" name="nascimento" className="form-control"
                                            value={this.state.nascimento} onChange={this.changeNascimentoHandler} />
                                    </div>

                                    <div className="form-group">
                                        <label> Cpf: </label>
                                        <input placeholder="Cpf" name="cpf" className="form-control"
                                            value={this.state.cpf} onChange={this.changeCpfHandler} />
                                    </div>

                                    <div className="form-group">
                                        <label> Cep: </label>
                                        <input placeholder="Cep" name="cep" className="form-control"
                                            value={this.state.cep} onChange={this.changeCepHandler} />
                                    </div>

                                    <div className="form-group">
                                        <label> Celular: </label>
                                        <input placeholder="Celular" name="celular" className="form-control"
                                            value={this.state.celular} onChange={this.changeCelularHandler} />
                                    </div>

                                    <div className="form-group">
                                        <label> Email: </label>
                                        <input placeholder="Email" name="email" className="form-control"
                                            value={this.state.email} onChange={this.changeEmailHandler} />
                                    </div>

                                    <div className="form-group">
                                        <label> Senha: </label>
                                        <input placeholder="Senha" name="senha" className="form-control"
                                            value={this.state.senha} onChange={this.changeSenhaHandler} />
                                        <br />
                                    </div>
                                    <button className="btn btn-primary" onClick={this.saveOrUpdateContato}>Salvar</button>


                                </form>

                            </div>
                        </div>
                    </div>
                </div>
                <br />
            </div>
        )
    }



}
export default CreateContatoComponent