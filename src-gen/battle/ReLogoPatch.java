package battle;

import static repast.simphony.relogo.Utility.*;
import static repast.simphony.relogo.UtilityG.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import groovy.lang.Closure;
import repast.simphony.relogo.*;
import repast.simphony.relogo.ast.Diffusible;
import repast.simphony.relogo.builder.GeneratedByReLogoBuilder;
import repast.simphony.relogo.builder.ReLogoBuilderGeneratedFor;
import repast.simphony.space.SpatialException;
import repast.simphony.space.grid.Grid;
import repast.simphony.space.grid.GridPoint;

@GeneratedByReLogoBuilder
@SuppressWarnings({"unused","rawtypes","unchecked"})
public class ReLogoPatch extends BasePatch{

	/**
	 * Sprouts (makes) a number of new tanks and then executes a set of commands on the
	 * created tanks.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created tanks
	 */
	@ReLogoBuilderGeneratedFor("battle.relogo.Tank")
	public AgentSet<battle.relogo.Tank> sproutTanks(int number, Closure closure) {
		AgentSet<battle.relogo.Tank> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.sprout(number,closure,"Tank");
		for (Turtle t : createResult){
			if (t instanceof battle.relogo.Tank){
				result.add((battle.relogo.Tank)t);
			}
		} 
		return result;
	}

	/**
	 * Sprouts (makes) a number of new tanks and then executes a set of commands on the
	 * created tanks.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created tanks
	 */
	@ReLogoBuilderGeneratedFor("battle.relogo.Tank")
	public AgentSet<battle.relogo.Tank> sproutTanks(int number) {
		return sproutTanks(number,null);
	}

	/**
	 * Returns an agentset of tanks from the patch of the caller.
	 * 
	 * @return agentset of tanks from the caller's patch
	 */
	@ReLogoBuilderGeneratedFor("battle.relogo.Tank")
	public AgentSet<battle.relogo.Tank> tanksHere(){
	  Grid grid = getMyObserver().getGrid();
	  GridPoint gridPoint = grid.getLocation(this);
	  AgentSet<battle.relogo.Tank> result = new AgentSet<battle.relogo.Tank>();
	  for (Turtle t : Utility.getTurtlesOnGridPoint(gridPoint,getMyObserver(),"tank")){
			if (t instanceof battle.relogo.Tank)
			result.add((battle.relogo.Tank)t);
		}
		return result;
	}

	/**
	 * Returns the agentset of tanks on the patch at the direction (ndx, ndy) from the
	 * caller.
	 * 
	 * @param nX
	 *            a number
	 * @param nY
	 *            a number
	 * @returns agentset of tanks at the direction (nX, nY) from the caller
	 */
	@ReLogoBuilderGeneratedFor("battle.relogo.Tank")
	public AgentSet<battle.relogo.Tank> tanksAt(Number nX, Number nY){
		double dx = nX.doubleValue();
		double dy = nY.doubleValue();
		double[] displacement = {dx,dy};

		try{
		GridPoint gridPoint = Utility.getGridPointAtDisplacement(getGridLocationAsNdPoint(),displacement,getMyObserver());
		AgentSet<battle.relogo.Tank> result = new AgentSet<battle.relogo.Tank>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(gridPoint,getMyObserver(),"tank")){
			if (t instanceof battle.relogo.Tank)
			result.add((battle.relogo.Tank)t);
		}
		return result;
		}
		catch(SpatialException e){
			return new AgentSet<battle.relogo.Tank>();
		}
	}

	/**
	 * Returns an agentset of tanks on a given patch.
	 * 
	 * @param p
	 *            a patch
	 * @return agentset of tanks on patch p
	 */
	@ReLogoBuilderGeneratedFor("battle.relogo.Tank")
	public AgentSet<battle.relogo.Tank> tanksOn(Patch p){
		AgentSet<battle.relogo.Tank> result = new AgentSet<battle.relogo.Tank>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),getMyObserver(),"tank")){
			if (t instanceof battle.relogo.Tank)
			result.add((battle.relogo.Tank)t);
		}
		return result;
	}

	/**
	 * Returns an agentset of tanks on the same patch as a turtle.
	 * 
	 * @param t
	 *            a turtle
	 * @return agentset of tanks on the same patch as turtle t
	 */
	@ReLogoBuilderGeneratedFor("battle.relogo.Tank")
	public AgentSet<battle.relogo.Tank> tanksOn(Turtle t){
		AgentSet<battle.relogo.Tank> result = new AgentSet<battle.relogo.Tank>();						
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),getMyObserver(),"tank")){
			if (tt instanceof battle.relogo.Tank)
			result.add((battle.relogo.Tank)tt);
		}
		return result;
	}

	/**
	 * Returns an agentset of tanks on the patches in a collection or on the patches
	 * that a collection of turtles are.
	 * 
	 * @param a
	 *            a collection
	 * @return agentset of tanks on the patches in collection a or on the patches
	 *         that collection a turtles are
	 */
	@ReLogoBuilderGeneratedFor("battle.relogo.Tank")
	public AgentSet<battle.relogo.Tank> tanksOn(Collection c){

		if (c == null || c.isEmpty()){
			return new AgentSet<battle.relogo.Tank>();
		}

		Set<battle.relogo.Tank> total = new HashSet<battle.relogo.Tank>();
		if (c.iterator().next() instanceof Turtle){
			for (Object o : c){
				if (o instanceof Turtle){
					Turtle t = (Turtle) o;
					total.addAll(tanksOn(t));
				}
			}
		}
		else {
			for (Object o : c){
				if (o instanceof Patch){
					Patch p = (Patch) o;
					total.addAll(tanksOn(p));
				}
			}
		}
		return new AgentSet<battle.relogo.Tank>(total);
	}

	/**
	 * Queries if object is a tank.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a tank
	 */
	@ReLogoBuilderGeneratedFor("battle.relogo.Tank")
	public boolean isTankQ(Object o){
		return (o instanceof battle.relogo.Tank);
	}

	/**
	 * Returns an agentset containing all tanks.
	 * 
	 * @return agentset of all tanks
	 */
	@ReLogoBuilderGeneratedFor("battle.relogo.Tank")
	public AgentSet<battle.relogo.Tank> tanks(){
		AgentSet<battle.relogo.Tank> a = new AgentSet<battle.relogo.Tank>();
		for (Object e : this.getMyObserver().getContext().getObjects(battle.relogo.Tank.class)) {
			if (e instanceof battle.relogo.Tank){
				a.add((battle.relogo.Tank)e);
			}
		}
		return a;
	}

	/**
	 * Returns the tank with the given who number.
	 * 
	 * @param number
	 *            a number
	 * @return turtle number
	 */
	@ReLogoBuilderGeneratedFor("battle.relogo.Tank")
	public battle.relogo.Tank tank(Number number){
		Turtle turtle = Utility.turtleU(number.intValue(), getMyObserver());
		if (turtle instanceof battle.relogo.Tank)
			return (battle.relogo.Tank) turtle;
		return null;
	}

	/**
	 * Sprouts (makes) a number of new userTurtles and then executes a set of commands on the
	 * created userTurtles.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created userTurtles
	 */
	@ReLogoBuilderGeneratedFor("battle.relogo.UserTurtle")
	public AgentSet<battle.relogo.UserTurtle> sproutUserTurtles(int number, Closure closure) {
		AgentSet<battle.relogo.UserTurtle> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.sprout(number,closure,"UserTurtle");
		for (Turtle t : createResult){
			if (t instanceof battle.relogo.UserTurtle){
				result.add((battle.relogo.UserTurtle)t);
			}
		} 
		return result;
	}

	/**
	 * Sprouts (makes) a number of new userTurtles and then executes a set of commands on the
	 * created userTurtles.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created userTurtles
	 */
	@ReLogoBuilderGeneratedFor("battle.relogo.UserTurtle")
	public AgentSet<battle.relogo.UserTurtle> sproutUserTurtles(int number) {
		return sproutUserTurtles(number,null);
	}

	/**
	 * Returns an agentset of userTurtles from the patch of the caller.
	 * 
	 * @return agentset of userTurtles from the caller's patch
	 */
	@ReLogoBuilderGeneratedFor("battle.relogo.UserTurtle")
	public AgentSet<battle.relogo.UserTurtle> userTurtlesHere(){
	  Grid grid = getMyObserver().getGrid();
	  GridPoint gridPoint = grid.getLocation(this);
	  AgentSet<battle.relogo.UserTurtle> result = new AgentSet<battle.relogo.UserTurtle>();
	  for (Turtle t : Utility.getTurtlesOnGridPoint(gridPoint,getMyObserver(),"userTurtle")){
			if (t instanceof battle.relogo.UserTurtle)
			result.add((battle.relogo.UserTurtle)t);
		}
		return result;
	}

	/**
	 * Returns the agentset of userTurtles on the patch at the direction (ndx, ndy) from the
	 * caller.
	 * 
	 * @param nX
	 *            a number
	 * @param nY
	 *            a number
	 * @returns agentset of userTurtles at the direction (nX, nY) from the caller
	 */
	@ReLogoBuilderGeneratedFor("battle.relogo.UserTurtle")
	public AgentSet<battle.relogo.UserTurtle> userTurtlesAt(Number nX, Number nY){
		double dx = nX.doubleValue();
		double dy = nY.doubleValue();
		double[] displacement = {dx,dy};

		try{
		GridPoint gridPoint = Utility.getGridPointAtDisplacement(getGridLocationAsNdPoint(),displacement,getMyObserver());
		AgentSet<battle.relogo.UserTurtle> result = new AgentSet<battle.relogo.UserTurtle>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(gridPoint,getMyObserver(),"userTurtle")){
			if (t instanceof battle.relogo.UserTurtle)
			result.add((battle.relogo.UserTurtle)t);
		}
		return result;
		}
		catch(SpatialException e){
			return new AgentSet<battle.relogo.UserTurtle>();
		}
	}

	/**
	 * Returns an agentset of userTurtles on a given patch.
	 * 
	 * @param p
	 *            a patch
	 * @return agentset of userTurtles on patch p
	 */
	@ReLogoBuilderGeneratedFor("battle.relogo.UserTurtle")
	public AgentSet<battle.relogo.UserTurtle> userTurtlesOn(Patch p){
		AgentSet<battle.relogo.UserTurtle> result = new AgentSet<battle.relogo.UserTurtle>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),getMyObserver(),"userTurtle")){
			if (t instanceof battle.relogo.UserTurtle)
			result.add((battle.relogo.UserTurtle)t);
		}
		return result;
	}

	/**
	 * Returns an agentset of userTurtles on the same patch as a turtle.
	 * 
	 * @param t
	 *            a turtle
	 * @return agentset of userTurtles on the same patch as turtle t
	 */
	@ReLogoBuilderGeneratedFor("battle.relogo.UserTurtle")
	public AgentSet<battle.relogo.UserTurtle> userTurtlesOn(Turtle t){
		AgentSet<battle.relogo.UserTurtle> result = new AgentSet<battle.relogo.UserTurtle>();						
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),getMyObserver(),"userTurtle")){
			if (tt instanceof battle.relogo.UserTurtle)
			result.add((battle.relogo.UserTurtle)tt);
		}
		return result;
	}

	/**
	 * Returns an agentset of userTurtles on the patches in a collection or on the patches
	 * that a collection of turtles are.
	 * 
	 * @param a
	 *            a collection
	 * @return agentset of userTurtles on the patches in collection a or on the patches
	 *         that collection a turtles are
	 */
	@ReLogoBuilderGeneratedFor("battle.relogo.UserTurtle")
	public AgentSet<battle.relogo.UserTurtle> userTurtlesOn(Collection c){

		if (c == null || c.isEmpty()){
			return new AgentSet<battle.relogo.UserTurtle>();
		}

		Set<battle.relogo.UserTurtle> total = new HashSet<battle.relogo.UserTurtle>();
		if (c.iterator().next() instanceof Turtle){
			for (Object o : c){
				if (o instanceof Turtle){
					Turtle t = (Turtle) o;
					total.addAll(userTurtlesOn(t));
				}
			}
		}
		else {
			for (Object o : c){
				if (o instanceof Patch){
					Patch p = (Patch) o;
					total.addAll(userTurtlesOn(p));
				}
			}
		}
		return new AgentSet<battle.relogo.UserTurtle>(total);
	}

	/**
	 * Queries if object is a userTurtle.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a userTurtle
	 */
	@ReLogoBuilderGeneratedFor("battle.relogo.UserTurtle")
	public boolean isUserTurtleQ(Object o){
		return (o instanceof battle.relogo.UserTurtle);
	}

	/**
	 * Returns an agentset containing all userTurtles.
	 * 
	 * @return agentset of all userTurtles
	 */
	@ReLogoBuilderGeneratedFor("battle.relogo.UserTurtle")
	public AgentSet<battle.relogo.UserTurtle> userTurtles(){
		AgentSet<battle.relogo.UserTurtle> a = new AgentSet<battle.relogo.UserTurtle>();
		for (Object e : this.getMyObserver().getContext().getObjects(battle.relogo.UserTurtle.class)) {
			if (e instanceof battle.relogo.UserTurtle){
				a.add((battle.relogo.UserTurtle)e);
			}
		}
		return a;
	}

	/**
	 * Returns the userTurtle with the given who number.
	 * 
	 * @param number
	 *            a number
	 * @return turtle number
	 */
	@ReLogoBuilderGeneratedFor("battle.relogo.UserTurtle")
	public battle.relogo.UserTurtle userTurtle(Number number){
		Turtle turtle = Utility.turtleU(number.intValue(), getMyObserver());
		if (turtle instanceof battle.relogo.UserTurtle)
			return (battle.relogo.UserTurtle) turtle;
		return null;
	}

	/**
	 * Queries if object is a userLink.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a userLink
	 */
	@ReLogoBuilderGeneratedFor("battle.relogo.UserLink")
	public boolean isUserLinkQ(Object o){
		return (o instanceof battle.relogo.UserLink);
	}

	/**
	 * Returns an agentset containing all userLinks.
	 * 
	 * @return agentset of all userLinks
	 */
	@ReLogoBuilderGeneratedFor("battle.relogo.UserLink")
	public AgentSet<battle.relogo.UserLink> userLinks(){
		AgentSet<battle.relogo.UserLink> a = new AgentSet<battle.relogo.UserLink>();
		for (Object e : this.getMyObserver().getContext().getObjects(battle.relogo.UserLink.class)) {
			if (e instanceof battle.relogo.UserLink){
				a.add((battle.relogo.UserLink)e);
			}
		}
		return a;
	}

	/**
	 * Returns the userLink between two turtles.
	 * 
	 * @param oneEnd
	 *            an integer
	 * @param otherEnd
	 *            an integer
	 * @return userLink between two turtles
	 */
	@ReLogoBuilderGeneratedFor("battle.relogo.UserLink")
	public battle.relogo.UserLink userLink(Number oneEnd, Number otherEnd) {
		return (battle.relogo.UserLink)(this.getMyObserver().getNetwork("UserLink").getEdge(turtle(oneEnd),turtle(otherEnd)));
	}

	/**
	 * Returns the userLink between two turtles.
	 * 
	 * @param oneEnd
	 *            a turtle
	 * @param otherEnd
	 *            a turtle
	 * @return userLink between two turtles
	 */
	@ReLogoBuilderGeneratedFor("battle.relogo.UserLink")
	public battle.relogo.UserLink userLink(Turtle oneEnd, Turtle otherEnd) {
		return userLink(oneEnd.getWho(), otherEnd.getWho());
	}

	/**
	 * Returns the value of the global variable numTanks.
	 *
	 * @return the value of the global variable numTanks
	 */
	@ReLogoBuilderGeneratedFor("global: numTanks")
	public Object getNumTanks(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("numTanks");
	}

	/**
	 * Sets the value of the global variable numTanks.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: numTanks")
	public void setNumTanks(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("numTanks",value);
	}


}