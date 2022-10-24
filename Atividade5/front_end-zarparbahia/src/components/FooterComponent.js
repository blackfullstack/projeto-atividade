// Criar rodapé
import React, { Component } from 'react'
class FooterComponent extends Component {
  constructor(props) {
    super(props)
    this.state = {
    }
  }
  render() {
    return (

      <div style={{
        backgroundColor: '#454545'
      }}   >
        <div class="p-3 mb-2  text-white">
          <footer >

            <div className="container ">

              <div className="row">
                <div className="col-sm-4">

                  <h6> Formas de pagamentos </h6>

                  <img src={require('../assets/img/forma de pagamento 1.png')} width="170px" alt="logo" />

                </div>
                <div className="col-sm-4">

                  <nav>

                    <ul className="list-unstyled" >

                      <li className="h6">ZarparBahia VIAGENS E TURISMO LTDA.</li>
                      <li>CNPJ: 00.111.222/0001-00</li>
                      <li>Rua dev aristoteles, 04 - Pelourinho</li>
                      <li>CEP: 40243-000, Salvador/Ba</li>

                    </ul>
                  </nav>

                </div>
                <div className="col-sm-4">

                  <nav>

                    <ul className="list-unstyled">

                      <li className="h5">Termos</li>
                      <li>Condições de uso do site</li>
                      <li>Condições Gerais</li>
                      <li>Politica de privacidade</li>
                      <li>Código de Conduta Ética</li>

                    </ul>

                  </nav>

                </div>
              </div>
            </div>

            <center>
              <font face="Arial" size="2">&copy;ZarparBahia</font>
            </center>
          </footer>
        </div>
      </div>
    )
  }
}
export default FooterComponent