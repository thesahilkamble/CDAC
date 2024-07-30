using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.Rendering;
using Microsoft.EntityFrameworkCore;
using PracticeMVC.Models;

namespace PracticeMVC.Controllers
{
    public class PdbsController : Controller
    {
        private readonly PracticeDbContext _context;

        public PdbsController(PracticeDbContext context)
        {
            _context = context;
        }

        // GET: Pdbs
        public async Task<IActionResult> Index()
        {
            return View(await _context.Pdbs.ToListAsync());
        }

        // GET: Pdbs/Details/5
        public async Task<IActionResult> Details(int? id)
        {
            if (id == null)
            {
                return NotFound();
            }

            var pdb = await _context.Pdbs
                .FirstOrDefaultAsync(m => m.Id == id);
            if (pdb == null)
            {
                return NotFound();
            }

            return View(pdb);
        }

        // GET: Pdbs/Create
        public IActionResult Create()
        {
            return View();
        }

        // POST: Pdbs/Create
        // To protect from overposting attacks, enable the specific properties you want to bind to.
        // For more details, see http://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public async Task<IActionResult> Create([Bind("Id,Name,Age")] Pdb pdb)
        {
            if (ModelState.IsValid)
            {
                _context.Add(pdb);
                await _context.SaveChangesAsync();
                return RedirectToAction(nameof(Index));
            }
            return View(pdb);
        }

        // GET: Pdbs/Edit/5
        public async Task<IActionResult> Edit(int? id)
        {
            if (id == null)
            {
                return NotFound();
            }

            var pdb = await _context.Pdbs.FindAsync(id);
            if (pdb == null)
            {
                return NotFound();
            }
            return View(pdb);
        }

        // POST: Pdbs/Edit/5
        // To protect from overposting attacks, enable the specific properties you want to bind to.
        // For more details, see http://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public async Task<IActionResult> Edit(int id, [Bind("Id,Name,Age")] Pdb pdb)
        {
            if (id != pdb.Id)
            {
                return NotFound();
            }

            if (ModelState.IsValid)
            {
                try
                {
                    _context.Update(pdb);
                    await _context.SaveChangesAsync();
                }
                catch (DbUpdateConcurrencyException)
                {
                    if (!PdbExists(pdb.Id))
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
            return View(pdb);
        }

        // GET: Pdbs/Delete/5
        public async Task<IActionResult> Delete(int? id)
        {
            if (id == null)
            {
                return NotFound();
            }

            var pdb = await _context.Pdbs
                .FirstOrDefaultAsync(m => m.Id == id);
            if (pdb == null)
            {
                return NotFound();
            }

            return View(pdb);
        }

        // POST: Pdbs/Delete/5
        [HttpPost, ActionName("Delete")]
        [ValidateAntiForgeryToken]
        public async Task<IActionResult> DeleteConfirmed(int id)
        {
            var pdb = await _context.Pdbs.FindAsync(id);
            if (pdb != null)
            {
                _context.Pdbs.Remove(pdb);
            }

            await _context.SaveChangesAsync();
            return RedirectToAction(nameof(Index));
        }

        private bool PdbExists(int id)
        {
            return _context.Pdbs.Any(e => e.Id == id);
        }
    }
}
