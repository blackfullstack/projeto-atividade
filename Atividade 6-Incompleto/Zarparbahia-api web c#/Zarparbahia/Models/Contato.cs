using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;



namespace Zarparbahia.Models
{
    [Table("Contato")]
    public class Contato
    {

        [Key]
        public int ID { get; set; }
        [Required(ErrorMessage = "Informe chave")]
        [StringLength(50)]

        public string Nome { get; set; }
        [StringLength(11)]
        public string Nascimento { get; set; }
        [StringLength(15)]
        public string Cpf { get; set; }
        [StringLength(15)]
        public string Cep { get; set; }
        [StringLength(12)]
        public string Celular { get; set; }
        [StringLength(40)]
        public string Email { get; set; }
        [StringLength(40)]
        public string Senha { get; set; }
       


    }
}

