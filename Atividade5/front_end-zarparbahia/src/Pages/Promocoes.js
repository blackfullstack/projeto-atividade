import React from 'react';
function Promocoes() {
  return (
    <div>
      <h2 >Promo zarparbahia</h2>
      <br />
      <center />

      <div class="container">

        <div class="row">
          <div class="col"> <img src={require('../assets/img/barra grande.jpg')} width="170px" alt="imagem" />
            <div>
              <ul className="list-unstyled">
                <li> Barra grande-Marau-ba</li>
                <li> R$ 553,00</li>
              </ul>
            </div>
          </div>

          <div class="col"><img src={require('../assets/img/itacare ba.jpg')} width="170px" alt="imagem" />
            <div>
              <ul className="list-unstyled">
                <li> Itacaré-ba</li>
                <li> R$ 400,00</li>
              </ul>
            </div>
          </div>
          <div class="col"><img src={require('../assets/img/porto de galinhas.jpg')} width="170px" alt="imagem" />
            <div>
              <ul className="list-unstyled">
                <li> Porto seguro-ba</li>
                <li> R$ 453,00</li>
              </ul>
            </div>
          </div>
        </div>

        <div class="container ">
          <div class="row">
            <div class="col"> <img src={require('../assets/img/ilheus.jpg')} width="170px" alt="imagem" />
              <div>
                <ul className="list-unstyled">
                  <li> Ilheus-ba</li>
                  <li> R$ 350,00</li>
                </ul>
              </div>

            </div>
            <div class="col"><img src={require('../assets/img/chapada.jpg')} width="170px" alt="imagem" />
              <div>
                <ul className="list-unstyled">
                  <li> Chapada Diamantina-ba</li>
                  <li> R$ 450,00</li>
                </ul>
              </div>
            </div>

            <div class="col"><img src={require('../assets/img/salvador 1.jpg')} width="170px" alt="imagem" />
              <div>
                <ul className="list-unstyled">
                  <li> Salvador-ba</li>
                  <li> R$ 650,00</li>
                </ul>
              </div>
            </div>



          </div>
        </div>


      </div>
    </div>

  );


}

export default Promocoes;