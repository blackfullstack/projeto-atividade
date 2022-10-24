import React from 'react';


function Faleconosco() {
  return (
    <div>
      <div className="container ">
        <h3>Fale conosco</h3>
        <br />
        <div className="row">
          <div className="col-sm-6">

            <h5>
              <img src={require('../assets/icons/email.jpg')} width="20px" height="20px" alt="logo" />
              <font face="Arial" size="4">zarparbahia@gmail.com</font>
            </h5>

          </div>


          <div className="col-sm-6">
            <h3>
              <img src={require('../assets/icons/whatsaap.jpg')} width="20px" height="20px" alt="logo" />
              <font face="Arial" size="4">(71)9999-44444</font>
            </h3>
          </div>
        </div>

        <br />
        <form>
          <label>
            <h4>Nome</h4>
            <input type="text" name="name" />
          </label>
        </form>
        <br />
        <h4>Mensagem</h4>
        <textarea>

        </textarea>
        <br />
        <input type="submit" value="Enviar" />

        <br />
      </div>
      <br />
    </div>




  );


}

export default Faleconosco;