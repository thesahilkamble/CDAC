using System;
using System.Collections.Generic;

namespace prac2.Models;

public partial class Voting
{
    public int Id { get; set; }

    public string Name { get; set; } = null!;

    public int Age { get; set; }

    public string Area { get; set; } = null!;
}
