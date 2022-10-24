import React from 'react';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';


function header() {
  return (
    <div >
      <>

        <header style={{
          backgroundColor: 'blue'
        }}>

          <Navbar variant="dark">

            <div >
              <img src={require('../assets/logo/images.png')} width="50px" alt="logo" />
            </div>
            <Navbar.Brand href="/">Zarparbahia</Navbar.Brand>
            <Nav className="me-auto">
              <Nav.Link href="/">Início</Nav.Link>
              <Nav.Link href="/Promocoes">Promoções</Nav.Link>
              <Nav.Link href="/add-contato/_add">Cadastro</Nav.Link>
              <Nav.Link href="/Faleconosco" >Contatos</Nav.Link>
              <Nav.Link href="/Login">Entrar</Nav.Link>
            </Nav>

          </Navbar>
        </header>

        <br />

      </>
      <br />






    </div>
  );
}

export default header;