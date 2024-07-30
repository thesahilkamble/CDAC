using System;
using System.Collections.Generic;

namespace Company.Models;

public partial class Emp
{
    public int Id { get; set; }

    public string Name { get; set; } = null!;

    public decimal Salary { get; set; }
}
