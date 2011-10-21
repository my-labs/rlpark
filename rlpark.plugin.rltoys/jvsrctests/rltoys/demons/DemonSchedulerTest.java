package rltoys.demons;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import rltoys.algorithms.learning.predictions.LinearLearner;
import rltoys.algorithms.representations.actions.Action;
import rltoys.horde.demons.Demon;
import rltoys.horde.demons.DemonScheduler;
import rltoys.math.vector.RealVector;
import rltoys.math.vector.implementations.BVector;
import rltoys.utils.Utils;

@SuppressWarnings("serial")
public class DemonSchedulerTest {
  static class FakeDemon implements Demon {
    RealVector x_tp1;
    Action a_t;
    RealVector x_t;

    @Override
    public void update(RealVector x_t, Action a_t, RealVector x_tp1) {
      this.x_t = x_t;
      this.a_t = a_t;
      this.x_tp1 = x_tp1;
    }

    @Override
    public LinearLearner learner() {
      return null;
    }
  }

  @Test
  public void testScheduler() {
    FakeDemon d1 = new FakeDemon(), d2 = new FakeDemon();
    List<FakeDemon> demons = Utils.asList(d1, d2);
    DemonScheduler scheduler = new DemonScheduler(3);
    RealVector x0 = new BVector(1), x1 = new BVector(1);
    Action a0 = new Action() {
    };
    scheduler.update(demons, x0, a0, x1);
    Assert.assertEquals(d1.x_t, x0);
    Assert.assertEquals(d1.a_t, a0);
    Assert.assertEquals(d1.x_tp1, x1);
    Assert.assertEquals(d2.x_t, x0);
    Assert.assertEquals(d2.a_t, a0);
    Assert.assertEquals(d2.x_tp1, x1);
  }
}
