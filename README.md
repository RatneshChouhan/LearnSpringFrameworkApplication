# LearnSpringFrameworkApplication
Spring framework basics with spring boot
1. First Commit - GameRunner Class in com.rc.LearnSpringFrameworkApplication.game is tighty coupled with MarioGame/ContraGame object, If GameRunner object needs to use ContraGame
object then change is required in GameRunner class and vice-versa for MarioGame.

2. Second Commit - Loose coupling Level-1:- Changing the dependency of GamingRunner from concrete objects of, Game classes
[MarioGame & ContraGame] to interface GamingConsole which is implemented by Game Classes. 
Now, no changes are required in GameRunner class if different game class objects are passed to its constructor, Since its accepting
GamingConsole reference in its constructor instead of concrete game clas objects.
This way GameRunner is loosely dependent on Concrete Game classes.