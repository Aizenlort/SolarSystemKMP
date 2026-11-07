package planets.data.repository

import planets.data.service.PlanetsService
import planets.domain.Result
import planets.domain.domain.Planet
import planets.domain.repository.PlanetsRepository

class PlanetsRepositoryImpl(
    private val service: PlanetsService,
) : PlanetsRepository {

    override suspend fun getPlanets(): Result<List<Planet>> {
        return try {
            val planets = service.getPlanets()
            Result.Success(planets)
        } catch (e: Exception) {
            Result.Error(e.message ?: "Не удалось загрузить данные")
        }
    }

    override suspend fun getPlanetById(planetId: Int): Result<Planet?> {
        return try {
            val planet = service.getPlanetById(planetId)
            Result.Success(planet)
        } catch (e: Exception) {
            Result.Error(e.message ?: "Не удалось загрузить данные")
        }
    }
}