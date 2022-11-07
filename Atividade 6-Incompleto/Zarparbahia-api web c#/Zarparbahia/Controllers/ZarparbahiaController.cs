using System;
using System.Collections.Generic;
using System.Linq;
using Zarparbahia.Models;
using Zarparbahia.Data;
using Microsoft.EntityFrameworkCore;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Authorization;

namespace Zarparbahia.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
 
    public class ZarparbahiaController : ControllerBase
    {
        private readonly ContatoDbContext _context;

        public ZarparbahiaController(ContatoDbContext context)
        {
            _context = context;
        }

        // GET: api/Contato
        [HttpGet]
    
        public IEnumerable<Contato> GetContatos()
        {
            return _context.contato;

        }


        [HttpGet("{id}")]
        
        public IActionResult GetContatoPorId (int id)
        {

            var contato = _context.contato.SingleOrDefault(m => m.ID == id);

            if (contato == null)
            {
                return NotFound();
            }

            return new ObjectResult(contato);
        }

        // POST: api/contatoitem
  
        [HttpPost]
      
        public IActionResult CreateContato([FromBody] Contato item)
        {
            if (item == null)
            {
                return BadRequest();
            }

            _context.contato.Add(item);
            _context.SaveChanges();

            return CreatedAtAction(
                "GetContatos",
                new { id = item.ID }, item);

        }


        // PUT: api/Contatos/4

        [HttpPut("{id}")]
        [Authorize]
        public IActionResult UpdateContato(int id, [FromBody] Contato item)
        {
            if (id != item.ID)
            {
                return BadRequest();
            }
            _context.Entry(item).State = EntityState.Modified;
            _context.SaveChanges();

            return new NoContentResult();

        }


        // DELETE: api/TodoItems/5
        [HttpDelete("{id}")]
        
        public IActionResult DeleteContato(int id)
        {
            var contato = _context.contato.SingleOrDefault(m => m.ID == id);

            if (contato == null)
            {
                return BadRequest();
            }

            _context.contato.Remove(contato);
            _context.SaveChanges();

            return Ok(contato);
        }

    }
}
