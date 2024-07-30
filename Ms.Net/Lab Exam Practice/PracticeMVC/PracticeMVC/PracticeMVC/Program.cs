using Microsoft.EntityFrameworkCore;
using PracticeMVC.Models;

var builder = WebApplication.CreateBuilder(args);

// Add services to the container.
builder.Services.AddControllersWithViews();
builder.Services.AddDbContext<PracticeDbContext>(options =>
                        options.UseSqlServer(builder.Configuration.GetConnectionString("sahil")));
var app = builder.Build();

// Configure the HTTP request pipeline.
if (!app.Environment.IsDevelopment())
{
    app.UseExceptionHandler("/Home/Error");
}
app.UseStaticFiles();

app.UseRouting();

app.UseAuthorization();

app.MapControllerRoute(
    name: "default",
    pattern: "{controller=Pdbs}/{action=Index}/{id?}");

app.Run();
