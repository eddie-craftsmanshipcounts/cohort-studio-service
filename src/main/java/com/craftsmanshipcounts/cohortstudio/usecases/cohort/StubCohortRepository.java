package com.craftsmanshipcounts.cohortstudio.usecases.cohort;

import java.util.List;

public class StubCohortRepository implements CohortRepository
{
	public static final StubCohortRepository EMPTY_COHORT_REPOSITORY_STUB =
		new StubCohortRepository();

	private List<Cohort> listOfCohorts;
	
	private StubCohortRepository() {
		this(List.of());
	}

	public StubCohortRepository(List<Cohort> listOfCohorts)
	{
		this.listOfCohorts = listOfCohorts;
	}

	@Override
	public List<Cohort> listCohorts()
	{
		return listOfCohorts;
	}
}