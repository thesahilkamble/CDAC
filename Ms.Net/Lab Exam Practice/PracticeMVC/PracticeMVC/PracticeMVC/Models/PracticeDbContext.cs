using System;
using System.Collections.Generic;
using Microsoft.EntityFrameworkCore;

namespace PracticeMVC.Models;

public partial class PracticeDbContext : DbContext
{
    public PracticeDbContext()
    {
    }

    public PracticeDbContext(DbContextOptions<PracticeDbContext> options)
        : base(options)
    {
    }

    public virtual DbSet<Pdb> Pdbs { get; set; }

    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
#warning To protect potentially sensitive information in your connection string, you should move it out of source code. You can avoid scaffolding the connection string by using the Name= syntax to read it from configuration - see https://go.microsoft.com/fwlink/?linkid=2131148. For more guidance on storing connection strings, see https://go.microsoft.com/fwlink/?LinkId=723263.
        => optionsBuilder.UseSqlServer("Data Source=(localdb)\\MsSqlLocalDb;Initial Catalog=PracticeDB;Integrated Security=true");

    protected override void OnModelCreating(ModelBuilder modelBuilder)
    {
        modelBuilder.Entity<Pdb>(entity =>
        {
            entity.HasKey(e => e.Id).HasName("PK__PDB__3214EC0708B4714F");

            entity.ToTable("PDB");

            entity.Property(e => e.Id).ValueGeneratedNever();
            entity.Property(e => e.Name)
                .HasMaxLength(50)
                .IsUnicode(false);
        });

        OnModelCreatingPartial(modelBuilder);
    }

    partial void OnModelCreatingPartial(ModelBuilder modelBuilder);
}
