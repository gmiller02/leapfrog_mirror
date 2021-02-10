package leapfrog;

public class Game {

    Hider hider = new Hider();
    Seeker seeker = new Seeker(hider);
}
   // instantiating a new Hider and Seeker in Game: Containment
   // made sure that the Seeker knows about an instance of Hider: association