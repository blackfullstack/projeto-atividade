import React from 'react'
import './App.css';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';
import ListContatoComponent from './components/ListContatoComponent';
import HeaderComponent from './components/HeaderComponent';
import FooterComponent from './components/FooterComponent';
import CreateContatoComponent from './components/CreateContatoComponent';
import ViewContatoComponent from './components/ViewContatoComponent';
import Home from './Pages/Home';
import Promocoes from './Pages/Promocoes';
import Faleconosco from './Pages/Faleconosco';
import Login from './Pages/Login';
function App() {
return (
<div>
<Router>
    
<HeaderComponent />

<div className="container">

<Switch>
<Route path = "/" exact component = {Home}></Route>
<Route path = "/Promocoes" component = {Promocoes}></Route>
<Route path = "/Faleconosco"  component = {Faleconosco}></Route>
<Route path = "/Login"  component = {Login}></Route>
<Route path = "/contatos" component = {ListContatoComponent}></Route>
<Route path = "/add-contato/:idcadastro" component = {CreateContatoComponent}></Route>
<Route path = "/view-contato/:idcadastro" component = {ViewContatoComponent}></Route>
</Switch>

</div>
<FooterComponent />
</Router>
</div>
);
}
export default App;