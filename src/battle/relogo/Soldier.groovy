package battle.relogo

import static repast.simphony.relogo.Utility.*
import static repast.simphony.relogo.UtilityG.*

import battle.ReLogoTurtle
import repast.simphony.relogo.Plural
import repast.simphony.relogo.Stop
import repast.simphony.relogo.Utility
import repast.simphony.relogo.UtilityG
import repast.simphony.relogo.schedule.Go
import repast.simphony.relogo.schedule.Setup

class Soldier extends ReLogoTurtle {

	def lifePoints = 30
	def attack = 30
	def movementMethod = 2
	
	def step() {

		if (count(turtlesHere()) > 1) {
			def turtleChoosen = chooseOneOfNeighbour(turtlesHere())
			if(turtleChoosen == null) {
				label = lifePoints.toString()
				movement()
			}
			else {
				label = "FIGHT " + lifePoints.toString()
				fight(turtleChoosen)
			}
		}
		else {
			label = lifePoints.toString()
			movement()
		}
		if (lifePoints <= 0) {
			die()
		}
	}
	
	def fight(turtleChoosen) {
		turtleChoosen.lifePoints = turtleChoosen.lifePoints - (attack + Math.random()*4 - 2)
	}
	
	def chooseOneOfNeighbour(turtlesAround) {
		for (turtle in turtlesAround) {
			if (turtle.color != color) {
				return turtle
			}
		}
		return null
	}
	
	def movement() {
		if(movementMethod == 0) {
			setHeading(getHeading() + (Math.random()*60 - 30))
		}
				
		if(movementMethod == 1) {
			def oldColor = color
			def winner = minOneOf(turtles()){
				if (color == oldColor) {
					return 1000
				}
				else {
					distance(it)
				}
			}
			face(winner)
		}
		
		if(movementMethod == 2) {
			def winner = minOneOf(neighbors()){
				count(turtlesOn(it))
			}
			face(winner)
		}

		fd(1)
	}
}
