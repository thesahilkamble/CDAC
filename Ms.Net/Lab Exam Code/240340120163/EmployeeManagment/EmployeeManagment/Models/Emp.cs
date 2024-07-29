﻿using System;
using System.Collections.Generic;

namespace EmployeeManagment.Models;

public partial class Emp
{
    public int Id { get; set; }

    public string Name { get; set; } = null!;

    public string City { get; set; } = null!;

    public string Address { get; set; } = null!;
}
