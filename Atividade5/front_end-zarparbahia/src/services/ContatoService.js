import axios from 'axios';
const Contato_API_BASE_URL = "http://localhost:8080/api/v1/contatos";


class ContatoService {

   getContatos() {
      return axios.get(Contato_API_BASE_URL);
   }
   createContato(contato) {
      return axios.post(Contato_API_BASE_URL, contato);
   }
   getContatoById(contatoIdcadastro) {
      return axios.get(Contato_API_BASE_URL + '/' + contatoIdcadastro);
   }
   updateContato(contato, contatoIdcadastro) {
      return axios.put(Contato_API_BASE_URL + '/' + contatoIdcadastro, contato);
   }
   deleteContato(contatoIdcadastro) {
      return axios.delete(Contato_API_BASE_URL + '/' + contatoIdcadastro);
   }
}
export default new ContatoService()





