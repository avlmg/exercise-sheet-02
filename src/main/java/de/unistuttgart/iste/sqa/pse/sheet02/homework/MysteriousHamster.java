package de.unistuttgart.iste.sqa.pse.sheet02.homework;

import de.hamstersimulator.objectsfirst.external.model.Hamster;

/**
 *
 * Mysterious hamsters are a mystery, their actions are very mysterious.
 *
 * Class for exercise 3 on sheet 02.
 *
 */
public final class MysteriousHamster {
	private Integer stepCounter = 0;
	private Hamster hamster;

	/**
	 * This constructor allows to access methods of a mysterous hamster on a specified hamster.
	 * @param hamster A mysterioshamster-object will be created from this hamster.
	 */
	public MysteriousHamster(final Hamster hamster) {
		this.hamster = hamster;
	}

	/**
	 * This mysterious method makes the Hamster turn left.
	 */
	void lookLeft() {
		hamster.turnLeft();
	}

	/**
	 * Walk one step and add it to the counter. Return a String with the amount of steps taken.
	 */
	void moveCounter() {
		hamster.move();
		stepCounter++;
		hamster.write("I have already walked " + stepCounter + " steps.");
	}

	/**
	 * Turn to opposite direction.
	 */
	void lookOppositeSide() {
		hamster.turnLeft();
		hamster.turnLeft();
	}

	/**
	 * Turn to right. Example: If it looks to the East, will look South.
	 */
	void lookRight() {
		hamster.turnLeft();
		hamster.turnLeft();
		hamster.turnLeft();
	}

	/**
	 * Return the value of steps taken.
	 */
	int counterValue() {
		return stepCounter;
	}

	/**
	 * Print the value of steps taken as string.
	 */
	void stepsTaken() {
		hamster.write(stepCounter.toString());
	}

	/**
	 * Pick up a grain.
	 */
	void eat() {
		hamster.pickGrain();
	}

	/**
	 * Return a string indicating when the Hamster is done.
	 */
	void finished() {
		hamster.write("I'm done! :)");
	}

	/**
	 * Move one step and add it to the counter. Leave all the grains from the Hamsters mouth in one tile.
	 * Take another step. If the Hamster lost all grains will return a string explaining it was too fast.
	 */
	void carelessWalk() {
		hamster.move();
		stepCounter++;
		boolean hadGrain = !hamster.mouthEmpty();
		while (!hamster.mouthEmpty()) {
			hamster.putGrain();
		}
		hamster.move();
		stepCounter++;
		if (hadGrain) {
			hamster.write("Oops! I guess I was too fast there!");
		}
	}
	/**
	 * This method is used to grant mysterioushamster-objects access the {@link Hamster#write(String)} method.
	 * @param text This text will be printed out in the game log.
	 */
	void write(final String text) {
		hamster.write(text);
	}
}
