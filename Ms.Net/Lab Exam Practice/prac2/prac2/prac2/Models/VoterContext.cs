using System;
using System.Collections.Generic;
using Microsoft.EntityFrameworkCore;

namespace prac2.Models;

public partial class VoterContext : DbContext
{
    public VoterContext()
    {
    }

    public VoterContext(DbContextOptions<VoterContext> options)
        : base(options)
    {
    }

    public virtual DbSet<Voting> Votings { get; set; }

    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
#warning To protect potentially sensitive information in your connection string, you should move it out of source code. You can avoid scaffolding the connection string by using the Name= syntax to read it from configuration - see https://go.microsoft.com/fwlink/?linkid=2131148. For more guidance on storing connection strings, see https://go.microsoft.com/fwlink/?LinkId=723263.
        => optionsBuilder.UseSqlServer("Data Source=(localdb)\\MsSqlLocalDb;Initial Catalog=voter;Integrated Security=true");

    protected override void OnModelCreating(ModelBuilder modelBuilder)
    {
        modelBuilder.Entity<Voting>(entity =>
        {
            entity.HasKey(e => e.Id).HasName("PK__voting__3214EC07EBCAA247");

            entity.ToTable("voting");

            entity.Property(e => e.Id).ValueGeneratedNever();
            entity.Property(e => e.Area)
                .HasMaxLength(50)
                .IsUnicode(false);
            entity.Property(e => e.Name)
                .HasMaxLength(50)
                .IsUnicode(false);
        });

        OnModelCreatingPartial(modelBuilder);
    }

    partial void OnModelCreatingPartial(ModelBuilder modelBuilder);
}
