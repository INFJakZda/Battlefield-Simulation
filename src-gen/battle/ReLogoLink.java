package battle;

import static repast.simphony.relogo.Utility.*;
import static repast.simphony.relogo.UtilityG.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import groovy.lang.Closure;
import repast.simphony.relogo.*;
import repast.simphony.relogo.builder.GeneratedByReLogoBuilder;
import repast.simphony.relogo.builder.ReLogoBuilderGeneratedFor;

@GeneratedByReLogoBuilder
@SuppressWarnings({"unused","rawtypes","unchecked"})
public class ReLogoLink<T> extends BaseLink<T>	{

	/**
	 * Returns an agentset of riders on a given patch.
	 * 
	 * @param p
	 *            a patch
	 * @return agentset of riders on patch p
	 */
	@ReLogoBuilderGeneratedFor("battle.relogo.Rider")
	public AgentSet<battle.relogo.Rider> ridersOn(Patch p){
		AgentSet<battle.relogo.Rider> result = new AgentSet<battle.relogo.Rider>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),getMyObserver(),"rider")){
			if (t instanceof battle.relogo.Rider)
			result.add((battle.relogo.Rider)t);
		}
		return result;
	}

	/**
	 * Returns an agentset of riders on the same patch as a turtle.
	 * 
	 * @param t
	 *            a turtle
	 * @return agentset of riders on the same patch as turtle t
	 */
	@ReLogoBuilderGeneratedFor("battle.relogo.Rider")
	public AgentSet<battle.relogo.Rider> ridersOn(Turtle t){
		AgentSet<battle.relogo.Rider> result = new AgentSet<battle.relogo.Rider>();						
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),getMyObserver(),"rider")){
			if (tt instanceof battle.relogo.Rider)
			result.add((battle.relogo.Rider)tt);
		}
		return result;
	}

	/**
	 * Returns an agentset of riders on the patches in a collection or on the patches
	 * that a collection of turtles are.
	 * 
	 * @param a
	 *            a collection
	 * @return agentset of riders on the patches in collection a or on the patches
	 *         that collection a turtles are
	 */
	@ReLogoBuilderGeneratedFor("battle.relogo.Rider")
	public AgentSet<battle.relogo.Rider> ridersOn(Collection c){

		if (c == null || c.isEmpty()){
			return new AgentSet<battle.relogo.Rider>();
		}

		Set<battle.relogo.Rider> total = new HashSet<battle.relogo.Rider>();
		if (c.iterator().next() instanceof Turtle){
			for (Object o : c){
				if (o instanceof Turtle){
					Turtle t = (Turtle) o;
					total.addAll(ridersOn(t));
				}
			}
		}
		else {
			for (Object o : c){
				if (o instanceof Patch){
					Patch p = (Patch) o;
					total.addAll(ridersOn(p));
				}
			}
		}
		return new AgentSet<battle.relogo.Rider>(total);
	}

	/**
	 * Queries if object is a rider.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a rider
	 */
	@ReLogoBuilderGeneratedFor("battle.relogo.Rider")
	public boolean isRiderQ(Object o){
		return (o instanceof battle.relogo.Rider);
	}

	/**
	 * Returns the rider with the given who number.
	 * 
	 * @param number
	 *            a number
	 * @return turtle number
	 */
	@ReLogoBuilderGeneratedFor("battle.relogo.Rider")
	public battle.relogo.Rider rider(Number number){
		Turtle turtle = Utility.turtleU(number.intValue(), getMyObserver());
		if (turtle instanceof battle.relogo.Rider)
			return (battle.relogo.Rider) turtle;
		return null;
	}

	/**
	 * Returns an agentset containing all riders.
	 * 
	 * @return agentset of all riders
	 */
	@ReLogoBuilderGeneratedFor("battle.relogo.Rider")
	public AgentSet<battle.relogo.Rider> riders(){
		AgentSet<battle.relogo.Rider> a = new AgentSet<battle.relogo.Rider>();
		for (Object e : this.getMyObserver().getContext().getObjects(battle.relogo.Rider.class)) {
			if (e instanceof battle.relogo.Rider){
				a.add((battle.relogo.Rider)e);
			}
		}
		return a;
	}

	/**
	 * Returns an agentset of soldiers on a given patch.
	 * 
	 * @param p
	 *            a patch
	 * @return agentset of soldiers on patch p
	 */
	@ReLogoBuilderGeneratedFor("battle.relogo.Soldier")
	public AgentSet<battle.relogo.Soldier> soldiersOn(Patch p){
		AgentSet<battle.relogo.Soldier> result = new AgentSet<battle.relogo.Soldier>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),getMyObserver(),"soldier")){
			if (t instanceof battle.relogo.Soldier)
			result.add((battle.relogo.Soldier)t);
		}
		return result;
	}

	/**
	 * Returns an agentset of soldiers on the same patch as a turtle.
	 * 
	 * @param t
	 *            a turtle
	 * @return agentset of soldiers on the same patch as turtle t
	 */
	@ReLogoBuilderGeneratedFor("battle.relogo.Soldier")
	public AgentSet<battle.relogo.Soldier> soldiersOn(Turtle t){
		AgentSet<battle.relogo.Soldier> result = new AgentSet<battle.relogo.Soldier>();						
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),getMyObserver(),"soldier")){
			if (tt instanceof battle.relogo.Soldier)
			result.add((battle.relogo.Soldier)tt);
		}
		return result;
	}

	/**
	 * Returns an agentset of soldiers on the patches in a collection or on the patches
	 * that a collection of turtles are.
	 * 
	 * @param a
	 *            a collection
	 * @return agentset of soldiers on the patches in collection a or on the patches
	 *         that collection a turtles are
	 */
	@ReLogoBuilderGeneratedFor("battle.relogo.Soldier")
	public AgentSet<battle.relogo.Soldier> soldiersOn(Collection c){

		if (c == null || c.isEmpty()){
			return new AgentSet<battle.relogo.Soldier>();
		}

		Set<battle.relogo.Soldier> total = new HashSet<battle.relogo.Soldier>();
		if (c.iterator().next() instanceof Turtle){
			for (Object o : c){
				if (o instanceof Turtle){
					Turtle t = (Turtle) o;
					total.addAll(soldiersOn(t));
				}
			}
		}
		else {
			for (Object o : c){
				if (o instanceof Patch){
					Patch p = (Patch) o;
					total.addAll(soldiersOn(p));
				}
			}
		}
		return new AgentSet<battle.relogo.Soldier>(total);
	}

	/**
	 * Queries if object is a soldier.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a soldier
	 */
	@ReLogoBuilderGeneratedFor("battle.relogo.Soldier")
	public boolean isSoldierQ(Object o){
		return (o instanceof battle.relogo.Soldier);
	}

	/**
	 * Returns the soldier with the given who number.
	 * 
	 * @param number
	 *            a number
	 * @return turtle number
	 */
	@ReLogoBuilderGeneratedFor("battle.relogo.Soldier")
	public battle.relogo.Soldier soldier(Number number){
		Turtle turtle = Utility.turtleU(number.intValue(), getMyObserver());
		if (turtle instanceof battle.relogo.Soldier)
			return (battle.relogo.Soldier) turtle;
		return null;
	}

	/**
	 * Returns an agentset containing all soldiers.
	 * 
	 * @return agentset of all soldiers
	 */
	@ReLogoBuilderGeneratedFor("battle.relogo.Soldier")
	public AgentSet<battle.relogo.Soldier> soldiers(){
		AgentSet<battle.relogo.Soldier> a = new AgentSet<battle.relogo.Soldier>();
		for (Object e : this.getMyObserver().getContext().getObjects(battle.relogo.Soldier.class)) {
			if (e instanceof battle.relogo.Soldier){
				a.add((battle.relogo.Soldier)e);
			}
		}
		return a;
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
	 * Returns the value of the global variable numTanksBlue.
	 *
	 * @return the value of the global variable numTanksBlue
	 */
	@ReLogoBuilderGeneratedFor("global: numTanksBlue")
	public Object getNumTanksBlue(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("numTanksBlue");
	}

	/**
	 * Sets the value of the global variable numTanksBlue.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: numTanksBlue")
	public void setNumTanksBlue(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("numTanksBlue",value);
	}

	/**
	 * Returns the value of the global variable numTanksRed.
	 *
	 * @return the value of the global variable numTanksRed
	 */
	@ReLogoBuilderGeneratedFor("global: numTanksRed")
	public Object getNumTanksRed(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("numTanksRed");
	}

	/**
	 * Sets the value of the global variable numTanksRed.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: numTanksRed")
	public void setNumTanksRed(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("numTanksRed",value);
	}

	/**
	 * Returns the value of the global variable numRidersBlue.
	 *
	 * @return the value of the global variable numRidersBlue
	 */
	@ReLogoBuilderGeneratedFor("global: numRidersBlue")
	public Object getNumRidersBlue(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("numRidersBlue");
	}

	/**
	 * Sets the value of the global variable numRidersBlue.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: numRidersBlue")
	public void setNumRidersBlue(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("numRidersBlue",value);
	}

	/**
	 * Returns the value of the global variable numRidersRed.
	 *
	 * @return the value of the global variable numRidersRed
	 */
	@ReLogoBuilderGeneratedFor("global: numRidersRed")
	public Object getNumRidersRed(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("numRidersRed");
	}

	/**
	 * Sets the value of the global variable numRidersRed.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: numRidersRed")
	public void setNumRidersRed(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("numRidersRed",value);
	}

	/**
	 * Returns the value of the global variable numSoldierBlue.
	 *
	 * @return the value of the global variable numSoldierBlue
	 */
	@ReLogoBuilderGeneratedFor("global: numSoldierBlue")
	public Object getNumSoldierBlue(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("numSoldierBlue");
	}

	/**
	 * Sets the value of the global variable numSoldierBlue.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: numSoldierBlue")
	public void setNumSoldierBlue(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("numSoldierBlue",value);
	}

	/**
	 * Returns the value of the global variable numSoldierRed.
	 *
	 * @return the value of the global variable numSoldierRed
	 */
	@ReLogoBuilderGeneratedFor("global: numSoldierRed")
	public Object getNumSoldierRed(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("numSoldierRed");
	}

	/**
	 * Sets the value of the global variable numSoldierRed.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: numSoldierRed")
	public void setNumSoldierRed(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("numSoldierRed",value);
	}


}