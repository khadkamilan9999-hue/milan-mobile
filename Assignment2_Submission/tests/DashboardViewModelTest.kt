package com.example.assignment2

import com.example.assignment2.viewmodel.DashboardViewModel
import com.example.assignment2.repository.Repository
import com.example.assignment2.data.remote.Entity
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Test

@OptIn(ExperimentalCoroutinesApi::class)
class DashboardViewModelTest {
    private val repo = mockk<Repository>()
    private val vm = DashboardViewModel(repo)

    @Test fun loadsEntities() = runTest {
        coEvery { repo.dashboard("abc") } returns listOf(Entity("p1","p2","d"))
        vm.load("abc")
        assertEquals(1, vm.entities.first().size)
    }
}
