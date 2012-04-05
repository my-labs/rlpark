package rlpark.plugin.rltoys.testing.experiments.tests;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import rlpark.plugin.rltoys.testing.experiments.parametersweep.ParametersTest;
import rlpark.plugin.rltoys.testing.experiments.parametersweep.SweepTest;
import rlpark.plugin.rltoys.testing.experiments.reinforcementlearning.OffPolicyContinuousEvaluationSweepTest;
import rlpark.plugin.rltoys.testing.experiments.reinforcementlearning.OffPolicyPerEpisodeBasedEvaluationSweepTest;
import rlpark.plugin.rltoys.testing.experiments.reinforcementlearning.OnPolicySweepTest;
import rlpark.plugin.rltoys.testing.experiments.scheduling.JobPoolTest;
import rlpark.plugin.rltoys.testing.experiments.scheduling.SchedulerTest;
import rlpark.plugin.rltoys.testing.experiments.scheduling.UnreliableNetworkClientTest;
import rlpark.plugin.rltoys.testing.experiments.scheduling.UnreliableNetworkClientWithPoolTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({ ParametersTest.class, SchedulerTest.class, JobPoolTest.class, UnreliableNetworkClientTest.class,
    UnreliableNetworkClientWithPoolTest.class, SweepTest.class, OnPolicySweepTest.class,
    OffPolicyContinuousEvaluationSweepTest.class, OffPolicyPerEpisodeBasedEvaluationSweepTest.class })
public class Tests {
}