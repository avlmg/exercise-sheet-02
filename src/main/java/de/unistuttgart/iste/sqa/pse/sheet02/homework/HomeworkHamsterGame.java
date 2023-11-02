package de.unistuttgart.iste.sqa.pse.sheet02.homework;

/**
 * Describe the class HomeworkHamsterGame here.
 *
 * @author (Your name)
 * @version (a version number or a date)
 */
public class HomeworkHamsterGame extends InternalHomeworkHamsterGame {

	/*
	 * Confused Paule! Help Paule to walk through the territory and to bring all the
	 * grains into his cave. In the process Paule should collect all grains on the
	 * field and deposit them in his cave (lower left corner - row 4 * column 1 and
	 * indexing starts with 0).
	 */
	@Override
	protected void hamsterRun() {
		// EXERCISE 2:
		// Help Paule to walk through the territory and to bring all the grains
		// into his cave.

		// Walk to the first grain
		paule.move();
		paule.move();
		paule.move();
		paule.move();
		paule.move();

		// Pick up the first grain
		paule.pickGrain();

		// Turn in the direction of the second grain
		paule.turnLeft();
		paule.turnLeft();
		paule.turnLeft();

		// You can remove this line
		// paule.write("I do not know how to continue:'(");

		paule.move();
		paule.move();
		paule.turnLeft();
		paule.turnLeft();
		paule.turnLeft();
		paule.move();
		paule.move();
		paule.move();

		// Pick up the second grain
		// TODO:implement
		paule.pickGrain();

		// Move to the third grain
		// TODO:implement
		paule.turnLeft();
		paule.move();
		paule.turnLeft();
		paule.turnLeft();
		paule.turnLeft();
		paule.move();
		paule.move();

		// Pick up the third grain
		// TODO:implement
		paule.pickGrain();

		// Move and pick all the grains in (1,6)
		// TODO:implement
		paule.turnLeft();
		paule.turnLeft();
		paule.move();
		paule.move();
		paule.move();
		paule.turnLeft();
		paule.turnLeft();
		paule.turnLeft();
		paule.move();
		paule.move();
		paule.turnLeft();
		paule.turnLeft();
		paule.turnLeft();
		paule.move();
		paule.move();
		paule.move();
		paule.pickGrain();
		paule.pickGrain();
		paule.pickGrain();

		// Move to the cave
		// TODO:implement
		paule.turnLeft();
		paule.turnLeft();
		paule.move();
		paule.move();
		paule.move();
		paule.turnLeft();
		paule.move();
		paule.move();
		paule.move();
		paule.turnLeft();
		paule.turnLeft();
		paule.turnLeft();
		paule.move();
		paule.move();
		paule.turnLeft();
		paule.turnLeft();
		paule.turnLeft();
		paule.move();
		paule.move();
		paule.move();
		paule.pickGrain();

		// Put down all grains in the cave
		// TODO:implement
		while (!paule.mouthEmpty())
			paule.putGrain();

	}
}
