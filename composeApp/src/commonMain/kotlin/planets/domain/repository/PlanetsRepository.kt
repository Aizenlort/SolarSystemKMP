package planets.domain.repository

import planets.domain.Result
import planets.domain.domain.Planet

interface PlanetsRepository {
    suspend fun getPlanets(): Result<List<Planet>>
    suspend fun getPlanetById(planetId: Int): Result<Planet?>
}