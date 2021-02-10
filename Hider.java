package leapfrog;

import cs15.prj.leapFrogSupport.CS15LilyPad;
import cs15.prj.leapFrogSupport.HiderSupport;
import cs15.prj.leapFrogSupport.CS15Cloak;

/**
 * Welcome to the Hider class! You should read all the commented hints, as well
 * as the JavaDocs for this class, before coding here.
 *
 * Remember to use the support methods for this class, which you can call
 * using the "this" keyword (e.g. this.getCurrentLilyPad()):
 *     setCurrentLilyPad
 *     getCurrentLilyPad
 *     putOnCloak
 *
 * Don't worry about the 'extends' stuff. That just gives you access to
 * support code methods written for the Hider (see the Javadocs!), which you
 * should call. Pretend like it just says 'public class Hider'.
 */
public class Hider extends HiderSupport {

	// We've declared this instance variable for you to keep track
	// of the hider's previous lily pad.
	private CS15LilyPad _previousLilyPad;
	public CS15Cloak _newCS15Cloak;

	// declared new instance variable for a cloak

	/**
	 * This is the Hider's constructor, which constructs an instance of the Hider.
	 */
	public Hider() {
		super();
		//Don't remove the line above - it is necessary for the Hider to appear onscreen.

		// We've also initialized this instance variable for you.
		_previousLilyPad = null;
		_newCS15Cloak = new CS15Cloak();
		// initialized the cloak

		this.putOnCloak(_newCS15Cloak);


	}

	/**
	 * This method is called automatically on each click.
	 * You should never call this method yourself.
	 * The CS15LilyPad passed in corresponds to the tile clicked.
	 *
	 * Make the hider move to its new lily pad and hide itself using the CS15Cloak.
	 */
	@Override
	public void moveAndHide(CS15LilyPad newLilyPad) {
		// The previous lily pad updates to the current lily pad *before* it moves.
		_previousLilyPad = this.getCurrentLilyPad();
		this.setCurrentLilyPad(newLilyPad);

		_previousLilyPad.getColor();
		_newCS15Cloak.setColor(newLilyPad.getColor());


	}

	public CS15LilyPad getPreviousLilyPad() {
		return _previousLilyPad;
	}

}