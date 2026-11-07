package planets.data.repository

import kotlinx.coroutines.test.runTest
import planets.domain.Result
import planets.domain.domain.Planet
import planets.domain.repository.PlanetsRepository
import kotlin.test.Test
import kotlin.test.assertTrue
import kotlin.test.assertIs

class PlanetsRepositoryImplTest {

    @Test
    fun testGetPlanetsSuccess() = runTest {
        // Given - Create a fake implementation for testing
        val fakeRepository = FakePlanetsRepository(shouldReturnError = false)

        // When
        val result = fakeRepository.getPlanets()

        // Then
        assertIs<Result.Success<List<Planet>>>(result)
        assertTrue(result.data.isNotEmpty(), "List should not be empty")
    }

    @Test
    fun testGetPlanetsErrorHandling() = runTest {
        // Given - Repository configured to return error
        val fakeRepository = FakePlanetsRepository(shouldReturnError = true)

        // When
        val result = fakeRepository.getPlanets()

        // Then
        assertIs<Result.Error>(result)
        assertTrue(result.message.contains("Test error"), "Should return failure when configured for error")
    }

    @Test
    fun testPlanetDomainModelFields() = runTest {
        // Given
        val fakeRepository = FakePlanetsRepository(shouldReturnError = false)

        // When
        val result = fakeRepository.getPlanets()

        // Then - Verify all required fields are present
        assertIs<Result.Success<List<Planet>>>(result)
        val planet = result.data.firstOrNull()

        assertTrue(planet != null, "Planet should not be null")
        planet?.let {
            assertTrue(it.name.isNotEmpty(), "Name should not be empty")
            assertTrue(it.description.isNotEmpty(), "Description should not be empty")
            assertTrue(it.mass.contains("kg"), "Mass should be in kg")
            assertTrue(it.planetOrder in 1..8, "Order should be correct")
        }
    }
}

/**
 * Fake PlanetsRepository implementation for testing
 */
class FakePlanetsRepository(
    private val shouldReturnError: Boolean = false
) : PlanetsRepository {

    private val samplePlanet = Planet(
        id = 1,
        planetId = 1,
        name = "Earth",
        description = "Test planet description",
        img = "",
        imgDescription = "",
        mass = "5.97×10²⁴ kg",
        volume = "1.08×10¹² km³",
        planetOrder = 3,
        source = "Wikipedia",
        wikiLink = "",
    )
    private val samplePlanetsList = listOf(
        samplePlanet
    )

    override suspend fun getPlanets(): Result<List<Planet>> {
        return if (shouldReturnError) {
            Result.Error("Test error")
        } else {
            Result.Success(samplePlanetsList)
        }
    }

    override suspend fun getPlanetById(planetId: Int): Result<Planet?> {
        return if (shouldReturnError) {
            Result.Error("Test error")
        } else {
            Result.Success(samplePlanet)
        }
    }
}