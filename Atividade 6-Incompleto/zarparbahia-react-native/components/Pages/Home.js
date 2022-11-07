import React from 'react';
function Home() {
  return (
    <div>


      <br />

      <div class="container d-flex">
        <div class="row" >

          <div class="col-sm-4">
            <div class="mb-4">
              <label for="destino" class="form-label">Destino</label>
              <input type="text" class="form-control" id="destino" placeholder="Destino" />
            </div>
          </div>

          <div className="col-sm-4">
            <div className="mb-4">
              <label for="destino" class="form-label">Data</label>
              <input type="date" class="form-control" id="destino" placeholder="Data" />
            </div>
          </div>

          <div className="col-sm-4">
            <div class="mb-4">
              <label for="destino" class="form-label">Saída</label>
              <input type="text" class="form-control" id="destino" placeholder="Saída" />

            </div>
          </div>
        </div>
      </div>

      <div className="container d-flex">
        <div className="row">
          <div className="col-sm-4">
            <div >
              <img src={require('../assets/img/barra grande.jpg')} width="170px" alt="logo" />
            </div>
            <div>
              <ul className="list-unstyled">
                <li>Pacotes para Barra grande</li>
                <li> R$ 553,00</li>
                <li>Ida + Volta </li>
                <li> Hospedagem </li>
                <li> Café Da Manhã </li>

              </ul>
            </div>
          </div>
          <div class="col-sm-4">
            <div >
              <img src={require('../assets/img/itacare ba.jpg')} width="170px" alt="imagem" />
              <div>
              </div>
              <ul className="list-unstyled">
                <li>Pacotes para Porto Seguro</li>
                <li> R$ 453,00</li>
                <li>Ida + Volta </li>
                <li> Hospedagem </li>
                <li> Café Da Manhã </li>

              </ul>
            </div>
          </div>
          <div class="col-sm-3">
            <div>
              <img src={require('../assets/img/porto de galinhas.jpg')} width="170px" alt="imagem" />
            </div>
            <div>
              <ul className="list-unstyled">
                <li>Pacotes Morro de São Paulo</li>
                <li> R$ 353,00</li>
                <li>Ida + Volta </li>
                <li> Hospedagem </li>
                <li> Café Da Manhã </li>

              </ul>
            </div>
          </div>


        </div>
      </div>

    </div>




  );
}

export default Home;