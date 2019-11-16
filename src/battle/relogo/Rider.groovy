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

class Rider extends ReLogoTurtle {

	def lifePoints = 10
	def attack = 100
	
	def step() {

		if (count(turtlesHere()) > 1) {
			def turtleChoosen = chooseOneOfNeighbour(turtlesHere())
			if(turtleChoosen == null) {
				label = lifePoints.toString()
				fd(1)
			}
			else {
				label = "FIGHT " + lifePoints.toString()
				fight(turtleChoosen)
			}
		}
		else {
			label = lifePoints.toString()
			fd(1)
		}
		if (lifePoints < 0) {
			die()
		}
	}
	
	def fight(turtleChoosen) {
		turtleChoosen.lifePoints = turtleChoosen.lifePoints - attack
	}
	
	def chooseOneOfNeighbour(turtlesAround) {
		for (turtle in turtlesAround) {
			if (turtle.color != color) {
				return turtle
			}
		}
		return null
	}
}
