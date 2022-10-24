import React, { Component } from 'react'
import ContatoService from '../services/ContatoService'
class ListContatoComponent extends Component {
    constructor(props) {
        super(props)
        this.state = {
            contatos: []
        }
        this.addContato = this.addContato.bind(this);
        this.editContato = this.editContato.bind(this);
        this.deleteContato = this.deleteContato.bind(this);
    }
    deleteContato(idcadastro) {
        ContatoService.deleteContato(idcadastro).then(res => {
            this.setState({ contatos: this.state.contatos.filter(contato => contato.idcadastro !== idcadastro) });
        });
    }
    viewContato(idcadastro) {
        this.props.history.push(`/view-contato/${idcadastro}`);
    }
    editContato(idcadastro) {
        this.props.history.push(`/add-contato/${idcadastro}`);
    }
    componentDidMount() {
        ContatoService.getContatos().then((res) => {
            this.setState({ contatos: res.data });
        });
    }
    addContato() {
        this.props.history.push('/add-contato/_add');
    }
    render() {
        return (
            <div container >
                <h2 className="text-center">Lista de Empregados</h2>
                <div className="row">
                    <button className="btn btn-primary" onClick={this.addContato}> Inserir Contato</button>
                </div>
                <br></br>
                <div className="row">
                    <table className="table table-striped table-bordered">
                        <thead>
                            <tr>
                                <th> Nome </th>
                                <th> Nascimento </th>
                                <th> Cpf </th>
                                <th> Cep </th>
                                <th> Celular </th>
                                <th> Email </th>
                                <th> Senha</th>
                            </tr>
                        </thead>
                        <tbody>
                            {
                                this.state.contatos.map(
                                    contato =>
                                        <tr key={contato.idcadastro}>
                                            <td> {contato.nome}</td>
                                            <td> {contato.nascimento}</td>
                                            <td> {contato.cpf}</td>
                                            <td> {contato.cep}</td>
                                            <td> {contato.celular}</td>
                                            <td> {contato.email}</td>
                                            <td> {contato.senha}</td>

                                            <div>
                                                <button onClick={() => this.editContato(contato.idcadastro)} className="btn btn-info">Alterar </button>
                                            </div>
                                            <div>
                                                <button style={{ height: '10%' }} onClick={() => this.deleteContato(contato.idcadastro)} className="btn btn-danger">Apagar </button>
                                            </div>
                                            <div>
                                                <button style={{ marginLeft: "10px" }} onClick={() => this.viewContato(contato.idcadastro)} className="btn btn-info">Visualizar </button>
                                            </div>

                                        </tr>

                                )
                            }




                        </tbody>
                    </table>
                </div>
            </div>
        )
    }
}
export default ListContatoComponent