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
public class ReLogoObserver extends BaseObserver{

	/**
	 * Makes a number of randomly oriented tanks and then executes a set of commands on the
	 * created tanks.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created tanks
	 */
	@ReLogoBuilderGeneratedFor("battle.relogo.Tank")
	public AgentSet<battle.relogo.Tank> createTanks(int number, Closure closure) {
		AgentSet<battle.relogo.Tank> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.crt(number,closure,"Tank");
		for (Turtle t : createResult){
			if (t instanceof battle.relogo.Tank){
				result.add((battle.relogo.Tank)t);
			}
		} 
		return result; 
	}

	/**
	 * Makes a number of randomly oriented tanks and then executes a set of commands on the
	 * created tanks.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created tanks
	 */
	@ReLogoBuilderGeneratedFor("battle.relogo.Tank")
	public AgentSet<battle.relogo.Tank> createTanks(int number) {
		return createTanks(number,null);
	}

	/**
	 * Makes a number of uniformly fanned tanks and then executes a set of commands on the
	 * created tanks.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created tanks
	 */
	@ReLogoBuilderGeneratedFor("battle.relogo.Tank")
	public AgentSet<battle.relogo.Tank> createOrderedTanks(int number, Closure closure) {
		AgentSet<battle.relogo.Tank> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.cro(number,closure,"Tank");
		for (Turtle t : createResult){
			if (t instanceof battle.relogo.Tank){
				result.add((battle.relogo.Tank)t);
			}
		} 
		return result; 
	}

	/**
	 * Makes a number of uniformly fanned tanks and then executes a set of commands on the
	 * created tanks.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created tanks
	 */
	@ReLogoBuilderGeneratedFor("battle.relogo.Tank")
	public AgentSet<battle.relogo.Tank> createOrderedTanks(int number) {
		return createOrderedTanks(number,null);
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
		for (Object e : this.getContext().getObjects(battle.relogo.Tank.class)) {
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
		Turtle turtle = Utility.turtleU(number.intValue(), this);
		if (turtle instanceof battle.relogo.Tank)
			return (battle.relogo.Tank) turtle;
		return null;
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
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),this,"tank")){
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
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),this,"tank")){
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
	 * Makes a number of randomly oriented userTurtles and then executes a set of commands on the
	 * created userTurtles.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created userTurtles
	 */
	@ReLogoBuilderGeneratedFor("battle.relogo.UserTurtle")
	public AgentSet<battle.relogo.UserTurtle> createUserTurtles(int number, Closure closure) {
		AgentSet<battle.relogo.UserTurtle> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.crt(number,closure,"UserTurtle");
		for (Turtle t : createResult){
			if (t instanceof battle.relogo.UserTurtle){
				result.add((battle.relogo.UserTurtle)t);
			}
		} 
		return result; 
	}

	/**
	 * Makes a number of randomly oriented userTurtles and then executes a set of commands on the
	 * created userTurtles.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created userTurtles
	 */
	@ReLogoBuilderGeneratedFor("battle.relogo.UserTurtle")
	public AgentSet<battle.relogo.UserTurtle> createUserTurtles(int number) {
		return createUserTurtles(number,null);
	}

	/**
	 * Makes a number of uniformly fanned userTurtles and then executes a set of commands on the
	 * created userTurtles.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created userTurtles
	 */
	@ReLogoBuilderGeneratedFor("battle.relogo.UserTurtle")
	public AgentSet<battle.relogo.UserTurtle> createOrderedUserTurtles(int number, Closure closure) {
		AgentSet<battle.relogo.UserTurtle> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.cro(number,closure,"UserTurtle");
		for (Turtle t : createResult){
			if (t instanceof battle.relogo.UserTurtle){
				result.add((battle.relogo.UserTurtle)t);
			}
		} 
		return result; 
	}

	/**
	 * Makes a number of uniformly fanned userTurtles and then executes a set of commands on the
	 * created userTurtles.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created userTurtles
	 */
	@ReLogoBuilderGeneratedFor("battle.relogo.UserTurtle")
	public AgentSet<battle.relogo.UserTurtle> createOrderedUserTurtles(int number) {
		return createOrderedUserTurtles(number,null);
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
		for (Object e : this.getContext().getObjects(battle.relogo.UserTurtle.class)) {
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
		Turtle turtle = Utility.turtleU(number.intValue(), this);
		if (turtle instanceof battle.relogo.UserTurtle)
			return (battle.relogo.UserTurtle) turtle;
		return null;
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
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),this,"userTurtle")){
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
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),this,"userTurtle")){
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
		for (Object e : this.getContext().getObjects(battle.relogo.UserLink.class)) {
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
		return (battle.relogo.UserLink)(this.getNetwork("UserLink").getEdge(turtle(oneEnd),turtle(otherEnd)));
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