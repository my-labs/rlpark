package rltoys.environments;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import rltoys.environments.continuousgridworld.TestContinuousGridworld;
import rltoys.environments.envio.actions.ActionArrayTest;
import rltoys.environments.envio.observations.ObsFilterTest;
import rltoys.environments.mountaincar.MountainCarBehaviourPolicyTest;
import rltoys.environments.mountaincar.MountainCarTest;
import rltoys.environments.pendulum.SwingPendulumTest;
import rltoys.environments.stategraph.FiniteStateGraphTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({ FiniteStateGraphTest.class, ActionArrayTest.class, ObsFilterTest.class, MountainCarTest.class,
    SwingPendulumTest.class, MountainCarBehaviourPolicyTest.class, TestContinuousGridworld.class })
public class Tests {
}