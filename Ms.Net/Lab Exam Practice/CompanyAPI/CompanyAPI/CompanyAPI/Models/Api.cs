using System;
using System.Collections.Generic;
using CompanyAPI.Models;
using Microsoft.AspNetCore.Http.HttpResults;
using Microsoft.AspNetCore.OpenApi;
using Microsoft.EntityFrameworkCore;

namespace CompanyAPI.Models;

public partial class Api
{
    public int Id { get; set; }

    public string? Name { get; set; }
}


public static class ApiEndpoints
{
	public static void MapApiEndpoints (this IEndpointRouteBuilder routes)
    {
        var group = routes.MapGroup("/api/Api").WithTags(nameof(Api));

        group.MapGet("/", async (ApidbContext db) =>
        {
            return await db.Apis.ToListAsync();
        })
        .WithName("GetAllApis")
        .WithOpenApi();

        group.MapGet("/{id}", async Task<Results<Ok<Api>, NotFound>> (int id, ApidbContext db) =>
        {
            return await db.Apis.AsNoTracking()
                .FirstOrDefaultAsync(model => model.Id == id)
                is Api model
                    ? TypedResults.Ok(model)
                    : TypedResults.NotFound();
        })
        .WithName("GetApiById")
        .WithOpenApi();

        group.MapPut("/{id}", async Task<Results<Ok, NotFound>> (int id, Api api, ApidbContext db) =>
        {
            var affected = await db.Apis
                .Where(model => model.Id == id)
                .ExecuteUpdateAsync(setters => setters
                  .SetProperty(m => m.Id, api.Id)
                  .SetProperty(m => m.Name, api.Name)
                  );
            return affected == 1 ? TypedResults.Ok() : TypedResults.NotFound();
        })
        .WithName("UpdateApi")
        .WithOpenApi();

        group.MapPost("/", async (Api api, ApidbContext db) =>
        {
            db.Apis.Add(api);
            await db.SaveChangesAsync();
            return TypedResults.Created($"/api/Api/{api.Id}",api);
        })
        .WithName("CreateApi")
        .WithOpenApi();

        group.MapDelete("/{id}", async Task<Results<Ok, NotFound>> (int id, ApidbContext db) =>
        {
            var affected = await db.Apis
                .Where(model => model.Id == id)
                .ExecuteDeleteAsync();
            return affected == 1 ? TypedResults.Ok() : TypedResults.NotFound();
        })
        .WithName("DeleteApi")
        .WithOpenApi();
    }
}