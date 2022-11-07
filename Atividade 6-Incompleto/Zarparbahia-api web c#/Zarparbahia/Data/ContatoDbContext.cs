using Microsoft.EntityFrameworkCore;
using Zarparbahia.Models;

namespace Zarparbahia.Data
{
    public class ContatoDbContext : DbContext
    {
        public ContatoDbContext(DbContextOptions<ContatoDbContext> options)
            : base(options)
            
            {


            }
      public DbSet<Contato> contato { get; set; }
}
}
