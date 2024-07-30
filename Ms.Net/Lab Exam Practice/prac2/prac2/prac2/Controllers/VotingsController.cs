using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.Rendering;
using Microsoft.EntityFrameworkCore;
using prac2.Models;

namespace prac2.Controllers
{
    public class VotingsController : Controller
    {
        private readonly VoterContext _context;

        public VotingsController(VoterContext context)
        {
            _context = context;
        }

        // GET: Votings
        public async Task<IActionResult> Index()
        {
            return View(await _context.Votings.ToListAsync());
        }

        // GET: Votings/Details/5
        public async Task<IActionResult> Details(int? id)
        {
            if (id == null)
            {
                return NotFound();
            }

            var voting = await _context.Votings
                .FirstOrDefaultAsync(m => m.Id == id);
            if (voting == null)
            {
                return NotFound();
            }

            return View(voting);
        }

        // GET: Votings/Create
        public IActionResult Create()
        {
            return View();
        }

        // POST: Votings/Create
        // To protect from overposting attacks, enable the specific properties you want to bind to.
        // For more details, see http://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public async Task<IActionResult> Create([Bind("Id,Name,Age,Area")] Voting voting)
        {
            if (ModelState.IsValid)
            {
                _context.Add(voting);
                await _context.SaveChangesAsync();
                return RedirectToAction(nameof(Index));
            }
            return View(voting);
        }

        // GET: Votings/Edit/5
        public async Task<IActionResult> Edit(int? id)
        {
            if (id == null)
            {
                return NotFound();
            }

            var voting = await _context.Votings.FindAsync(id);
            if (voting == null)
            {
                return NotFound();
            }
            return View(voting);
        }

        // POST: Votings/Edit/5
        // To protect from overposting attacks, enable the specific properties you want to bind to.
        // For more details, see http://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public async Task<IActionResult> Edit(int id, [Bind("Id,Name,Age,Area")] Voting voting)
        {
            if (id != voting.Id)
            {
                return NotFound();
            }

            if (ModelState.IsValid)
            {
                try
                {
                    _context.Update(voting);
                    await _context.SaveChangesAsync();
                }
                catch (DbUpdateConcurrencyException)
                {
                    if (!VotingExists(voting.Id))
                    {
                        return NotFound();
                    }
                    else
                    {
                        throw;
                    }
                }
                return RedirectToAction(nameof(Index));
            }
            return View(voting);
        }

        // GET: Votings/Delete/5
        public async Task<IActionResult> Delete(int? id)
        {
            if (id == null)
            {
                return NotFound();
            }

            var voting = await _context.Votings
                .FirstOrDefaultAsync(m => m.Id == id);
            if (voting == null)
            {
                return NotFound();
            }

            return View(voting);
        }

        // POST: Votings/Delete/5
        [HttpPost, ActionName("Delete")]
        [ValidateAntiForgeryToken]
        public async Task<IActionResult> DeleteConfirmed(int id)
        {
            var voting = await _context.Votings.FindAsync(id);
            if (voting != null)
            {
                _context.Votings.Remove(voting);
            }

            await _context.SaveChangesAsync();
            return RedirectToAction(nameof(Index));
        }

        private bool VotingExists(int id)
        {
            return _context.Votings.Any(e => e.Id == id);
        }
    }
}
