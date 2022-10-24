// Codigo para visualizar os contatos
import React, { Component } from 'react'
import ContatoService from '../services/ContatoService'
class ViewContatoComponent extends Component {
    constructor(props) {
        super(props)
        this.state = {
            idcadastro: this.props.match.params.idcadastro,
            contato: {}
        }
    }
    componentDidMount() {
        ContatoService.getContatoById(this.state.idcadastro).then(res => {
            this.setState({ contato: res.data });
        })
    }
    render() {
        return (
            <div>
                <br></br>
                <div className="card col-md-6 offset-md-3">
                    <h3 className="text-center"> Dados do Contato</h3>
                    <div className="card-body">
                        <div className="row">
                            <label> nome: </label>
                            <div> {this.state.contato.nome}</div>
                        </div>
                        <div className="row">
                            <label> nascimento: </label>
                            <div> {this.state.contato.nascimento}</div>
                        </div>
                        <div className="row">
                            <label> Cpf: </label>
                            <div> {this.state.contato.cpf}</div>
                        </div>
                        <div className="row">
                            <label> Cep: </label>
                            <div> {this.state.contato.cep}</div>
                            <div className="row">
                                <label> Celular: </label>
                                <div> {this.state.contato.celular}</div>
                            </div>
                        </div>
                        <div className="row">
                            <label> Email: </label>
                            <div> {this.state.contato.email}</div>
                        </div>
                        <div className="row">
                            <label> Senha: </label>
                            <div> {this.state.contato.senha}</div>
                        </div>
                    </div>
                </div>
            </div>
        )
    }
}
export default ViewContatoComponent